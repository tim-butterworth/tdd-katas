package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.problem;

public class OpportunityItem {
    private final DBConnection dbConnection;

    public OpportunityItem(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String getName() {
        return dbConnection.doSqlStuffToGetName();
    }
}
