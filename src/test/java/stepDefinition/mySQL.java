package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MySqlTesting;
import java.sql.*;

public class mySQL {
    MySqlTesting mySqlTesting = new MySqlTesting();

    @When("I connect to MySQL Database")
    public void iConnectToMySQLDatabase() throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Tesla1856");
        Statement statement = connection.createStatement();
        String s = "SELECT * FROM city";
        ResultSet resultSet = statement.executeQuery(s);
        connection.close();
        System.out.println("Query executed successfully!");
    }

    @Then("I should be able to connect to MySQL Database")
    public void iShouldBeAbleToConnectToMySQLDatabase() {
    }
}
