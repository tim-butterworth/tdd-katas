package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.problem;

public class ConsultantSchedulerDB {

    private final DBConnectionFactory dbConnectionFactory;

    public ConsultantSchedulerDB() {
        dbConnectionFactory = new DBConnectionFactory(new DBConnectionConfiguration());
    }

    public OpportunityItem getOpportunityItem() {
        return new OpportunityItem(dbConnectionFactory.getInstance());
    }
}
