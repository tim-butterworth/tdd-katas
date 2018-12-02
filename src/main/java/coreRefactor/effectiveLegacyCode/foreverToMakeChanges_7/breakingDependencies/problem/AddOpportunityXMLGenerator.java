package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.problem;

public class AddOpportunityXMLGenerator {
    public String produceXML(OpportunityItem opportunityItem) {
        return String.format(
                "<xml>%s</xml>",
                opportunityItem.getName()
        );
    }
}
