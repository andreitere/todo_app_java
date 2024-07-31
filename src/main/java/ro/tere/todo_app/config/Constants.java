package ro.tere.todo_app.config;

public class Constants {
    private static final String db_schema = System.getProperty("db_schema");

    private Constants() {
    }

    public static String getSchema() {
        return Constants.db_schema;
    }
}
