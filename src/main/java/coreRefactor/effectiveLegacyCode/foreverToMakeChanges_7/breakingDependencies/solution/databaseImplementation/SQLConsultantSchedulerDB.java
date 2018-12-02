package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseImplementation;

import coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseGateway.ConsultantSchedulerDB;
import coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseGateway.OpportunityItem;

public class SQLConsultantSchedulerDB implements ConsultantSchedulerDB {

    private final DBConnectionFactory dbConnectionFactory;

    public SQLConsultantSchedulerDB() {
        dbConnectionFactory = new DBConnectionFactory(new DBConnectionConfiguration());
    }

    @Override
    public OpportunityItem getOpportunityItem() {
        return new SQLOpportunityItem(dbConnectionFactory.getInstance());
    }
}
