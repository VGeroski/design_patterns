package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private Connection conn = null;

    // Initialization on demand holder
    // In same time lazy loaded and thread safe
    // JVM guarantees thread safety
    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton() {
        try {
            String jdbcURL = "jdbc:h2:mem:test";
            conn = DriverManager.getConnection(jdbcURL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * Retrieve connection
     *
     * @return connection, we can be sure that connection is created
     */
    public Connection getConnection() {
        return conn;
    }
}