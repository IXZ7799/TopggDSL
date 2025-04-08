package uk.ac.kcl.topggdsl.validation

import org.eclipse.xtext.validation.Check
import uk.ac.kcl.topggdsl.topggDSL.Bot
import uk.ac.kcl.topggdsl.topggDSL.Review
import uk.ac.kcl.topggdsl.topggDSL.Status
import uk.ac.kcl.topggdsl.topggDSL.Model
import uk.ac.kcl.topggdsl.topggDSL.TopggDSLPackage

class TopggDSLValidator extends AbstractTopggDSLValidator {

    @Check
    def void checkBotHasTags(Bot bot) {
        if (bot.tags === null || bot.tags.isEmpty) {
            error("A bot must have at least one tag.", TopggDSLPackage.Literals.BOT__TAGS)
        }
    }

    @Check
    def void checkReviewHasReason(Review review) {
        if (review.status != Status.APPROVED && review.reason.trim.isEmpty) {
            warning("Reviews that are not approved must include a reason.", TopggDSLPackage.Literals.REVIEW__REASON)
        }
    }

    @Check
    def void checkConflictingReviews(Model model) {
        val grouped = model.entries.filter(Review).groupBy[it.botRef]
        for (entry : grouped.entrySet) {
            val statuses = entry.value.map[it.status].toSet
            if (statuses.contains(Status.APPROVED) && statuses.contains(Status.DECLINED)) {
                warning(
                    "Bot '" + entry.key.name + "' has conflicting reviews: both APPROVED and DECLINED.",
                    TopggDSLPackage.Literals.REVIEW__STATUS
                )
            }
        }
    }
}