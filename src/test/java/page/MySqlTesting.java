package page;
import java.sql.*;

public class MySqlTesting{

    public static void testDB() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Tesla1856");
        Statement statement = connection.createStatement();
        String s = "SELECT * FROM city";
        ResultSet resultSet = statement.executeQuery(s);
        connection.close();
        System.out.println("Query executed successfully!");
    }
}
