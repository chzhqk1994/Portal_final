package kr.ac.jejunu;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectionTest {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/spring_db?characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "thdgusdn";

    @Test
    public void testConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
            System.out.println("Connected!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
