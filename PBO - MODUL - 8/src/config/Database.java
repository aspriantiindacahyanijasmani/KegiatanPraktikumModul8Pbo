/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Database {
    private static Connection connection;
    public static Connection DBConnection() {
        String dbUrl = "jdbc:mysql://localhost:3306/db_praktikum";
        String user = "root";
        String password = "";
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = (Connection) DriverManager.getConnection(dbUrl,user, password);
        } catch (SQLException exc) {
            System.out.println("Koneksi error : "+ exc.getMessage());
        }
        return connection;
    }
    public static void closeConnection() throws IOException{
        connection.close();
    }
}
