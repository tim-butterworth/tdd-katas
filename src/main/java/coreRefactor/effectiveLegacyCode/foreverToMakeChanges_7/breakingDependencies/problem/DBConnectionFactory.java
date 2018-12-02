package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.problem;

public class DBConnectionFactory {
    private final DBConnectionConfiguration dbConnectionConfiguration;

    public DBConnectionFactory(DBConnectionConfiguration dbConnectionConfiguration) {
        this.dbConnectionConfiguration = dbConnectionConfiguration;
    }

    public DBConnection getInstance() {
        return new DBConnection();
    }
}
