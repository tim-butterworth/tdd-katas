package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.opportunityProcessing;

import coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseGateway.ConsultantSchedulerDB;
import coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseGateway.OpportunityItem;

public class AddOpportunityFormHandler {

    private final AddOpportunityXMLGenerator addOpportunityXMLGenerator;
    private final OpportunityItem opportunityItem;

    public AddOpportunityFormHandler(ConsultantSchedulerDB consultantSchedulerDB) {
        this.addOpportunityXMLGenerator = new AddOpportunityXMLGenerator();

        this.opportunityItem = consultantSchedulerDB.getOpportunityItem();
    }

    public String generateXML() {
        return addOpportunityXMLGenerator.produceXML(opportunityItem);
    }
}
