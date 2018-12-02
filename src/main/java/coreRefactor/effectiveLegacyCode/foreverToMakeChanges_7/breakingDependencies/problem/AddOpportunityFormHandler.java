package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.problem;

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
