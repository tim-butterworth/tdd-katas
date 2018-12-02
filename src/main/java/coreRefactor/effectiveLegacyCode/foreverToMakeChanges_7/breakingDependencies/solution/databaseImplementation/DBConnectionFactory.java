package coreRefactor.effectiveLegacyCode.foreverToMakeChanges_7.breakingDependencies.solution.databaseImplementation;

public class DBConnectionFactory {
    private final DBConnectionConfiguration dbConnectionConfiguration;

    public DBConnectionFactory(DBConnectionConfiguration dbConnectionConfiguration) {
        this.dbConnectionConfiguration = dbConnectionConfiguration;
    }

    public SQLDBConnection getInstance() {
        return new SQLDBConnection();
    }
}
