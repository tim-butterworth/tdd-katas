package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseImplementation;

import coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseGateway.OpportunityItem;

public class SQLOpportunityItem implements OpportunityItem {
    private final SQLDBConnection dbConnection;

    public SQLOpportunityItem(SQLDBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public String getName() {
        return dbConnection.doSqlStuffToGetName();
    }
}
