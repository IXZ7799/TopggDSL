package uk.ac.kcl.topggdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.topggdsl.topggDSL.Model
import uk.ac.kcl.topggdsl.topggDSL.Bot
import uk.ac.kcl.topggdsl.topggDSL.Review
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.JsonArray

class TopggDSLGenerator implements IGenerator2 {

    override beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // Nothing to do before generation
    }

    override afterGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // Nothing to do after generation
    }

    override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val model = resource.allContents.toIterable.filter(Model).head
        if (model !== null) {
            val gson = new GsonBuilder().setPrettyPrinting().create()
            val root = new JsonObject

            val botsArray = new JsonArray
            val reviewsArray = new JsonArray

            for (entry : model.entries) {
                switch entry {
                    Bot: {
                        val botJson = new JsonObject
                        botJson.addProperty("name", entry.name)
                        botJson.addProperty("prefix", entry.prefix)
                        botJson.addProperty("description", entry.description)

                        val tagsJson = new JsonArray
                        entry.tags.forEach[tagsJson.add(it)]
                        botJson.add("tags", tagsJson)

                        botsArray.add(botJson)
                    }

                    Review: {
                        val reviewJson = new JsonObject
                        reviewJson.addProperty("id", entry.id)
                        reviewJson.addProperty("refersTo", entry.botRef.name)
                        reviewJson.addProperty("status", entry.status.toString)
                        reviewJson.addProperty("reason", entry.reason)
                        reviewJson.addProperty("reviewer", entry.reviewer)

                        reviewsArray.add(reviewJson)
                    }
                }
            }

            root.add("bots", botsArray)
            root.add("reviews", reviewsArray)

            val jsonOutput = gson.toJson(root)
            fsa.generateFile("output.json", jsonOutput)
        }
    }
}