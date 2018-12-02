package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.opportunityProcessing;

import coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseGateway.OpportunityItem;

public class AddOpportunityXMLGenerator {
    public String produceXML(OpportunityItem opportunityItem) {
        return String.format(
                "<xml>%s</xml>",
                opportunityItem.getName()
        );
    }
}
