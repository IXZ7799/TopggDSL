package uk.ac.kcl.topggdsl.generator

import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.resource.Resource
import uk.ac.kcl.topggdsl.topggDSL.Model
import uk.ac.kcl.topggdsl.topggDSL.Bot
import uk.ac.kcl.topggdsl.topggDSL.Review

class TopggDSLGenerator implements IGenerator2 {

    override beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    }

    override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val model = resource.contents.head as Model
        val result = new StringBuilder

        result.append("{\n  \"bots\": [\n")
        for (bot : model.entries.filter(Bot)) {
            result.append("    {\n")
            result.append("      \"name\": \"" + bot.name + "\",\n")
            result.append("      \"prefix\": \"" + bot.prefix + "\",\n")
            result.append("      \"tags\": [" + bot.tags.map['"' + it + '"'].join(", ") + "],\n")
            result.append("      \"description\": \"" + bot.description + "\"\n")
            result.append("    }")
            if (bot != model.entries.filter(Bot).last) result.append(",")
            result.append("\n")
        }
        result.append("  ],\n  \"reviews\": [\n")
        for (review : model.entries.filter(Review)) {
            result.append("    {\n")
            result.append("      \"id\": \"" + review.id + "\",\n")
            result.append("      \"bot\": \"" + review.botRef.name + "\",\n")
            result.append("      \"status\": \"" + review.status.literal + "\",\n")
            result.append("      \"reason\": \"" + review.reason + "\",\n")
            result.append("      \"reviewer\": \"" + review.reviewer + "\"\n")
            result.append("    }")
            if (review != model.entries.filter(Review).last) result.append(",")
            result.append("\n")
        }
        result.append("  ]\n}")

        fsa.generateFile("output.json", result.toString)
    }

    override afterGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    }
}