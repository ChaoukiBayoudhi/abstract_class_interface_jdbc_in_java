package database;

import Classes.Vehicle;

import java.sql.*;

public class DBConnection {
    private static String url="jdbc:postgresql://localhost:5432/vehicule_db";
    //for oracle
    //private static String url="jdbc:oracle:thin:@localhost:1521:xe";
    private static String userName="user01";
    private static String password="user01";
    private static Connection conn;

    public static boolean addVehicle(Vehicle vehicle) throws SQLException {
        try {
            //1-create connection to the database
            conn = DriverManager.getConnection(url, userName, password);
            //2-create the sql query

            //String sql = "insert into vehicle (name,color,date_of_manufacture) values ("+vehicle.getName()+","+vehicle.getColor()+","+vehicle.getDateOfManufacture()+")";
            //the previous version is vulnerable to SQL injection
            String sql ="INSERT INTO vehicle(name,color,date_of_manufacture) values (?,?,?)";
            //3-create statement
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1,vehicle.getName());
            st.setString(2,vehicle.getColor());
            st.setDate(3, Date.valueOf(vehicle.getDateOfManufacture()));
            //or
            //st.setObject(3,vehicle.getDateOfManufacture());
            //4-Execute the query
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally {

            conn.close();
        }
    }
}
