package creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) throws SQLException {
        // grabbing dbSingleton instance
        DbSingleton dbSingleton = DbSingleton.getInstance();
        DbSingleton dbSingleton2 = DbSingleton.getInstance();

        // printing obj address
        System.out.println(dbSingleton);
        System.out.println(dbSingleton2);

        // Db connection demo
        Connection connection = dbSingleton.getConnection();

        Statement statement = connection.createStatement();

        statement.executeUpdate("Create table students (ID int primary key, name varchar(65))");

        System.out.println("Created table students");

        int rows = statement.executeUpdate("Insert into students (ID, name) values (1, 'Vlada')");

        if (rows > 0) {
            System.out.println("Inserted new row!");
        }

        connection.close();
    }
}