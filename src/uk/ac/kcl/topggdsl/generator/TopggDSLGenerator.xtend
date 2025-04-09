package uk.ac.kcl.topggdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.topggdsl.topggDSL.Model
import uk.ac.kcl.topggdsl.topggDSL.Bot
import uk.ac.kcl.topggdsl.topggDSL.Review
import uk.ac.kcl.topggdsl.topggDSL.Status
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

            val botNames = model.entries.filter(Bot).map[name].toSet
            val reviewedBotNames = model.entries.filter(Review).map[botRef.name].toSet
            val unreviewedBotCount = botNames.size - reviewedBotNames.size

            val reviewCounts = <Status, Integer>newHashMap
			model.entries.filter(Review).groupBy[status].entrySet.forEach [
			reviewCounts.put(key, value.size)
			]


            val summary = new JsonObject
            summary.addProperty("totalBots", botNames.size)
            summary.addProperty("reviewedBots", reviewedBotNames.size)
            summary.addProperty("unreviewedBots", unreviewedBotCount)

            val statusCounts = new JsonObject
            Status.values.forEach [
                val count = reviewCounts.getOrDefault(it, 0)
                statusCounts.addProperty(it.toString, count)
            ]
            summary.add("reviewStatusCount", statusCounts)

            root.add("summary", summary)

            val jsonOutput = gson.toJson(root)
            fsa.generateFile("output.json", jsonOutput)
        }
    }
}
