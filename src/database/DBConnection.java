package database;

import java.sql.Connection;

public class DBConnection {
    private static String url="jdbc:postgresql://localhost:5432/vehicule_db";
    private static String userName="companyuser";
    private static String password="companyuser";
    private static Connection conn;
}
