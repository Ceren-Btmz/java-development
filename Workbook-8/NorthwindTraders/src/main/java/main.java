import java.sql.*;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1 - Load the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2 - Create the connection
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "Getrich2024!");

        // Step 3 - Create the statement
        Statement statement = connection.createStatement();

        // Step 4 - Create the query
        String query = "SELECT productName FROM northwind.products";

        // Step 5 - Execute the query
        ResultSet results = statement.executeQuery(query);

        // Step 6 - Go through the results
        while (results.next()){
            String city = results.getString("ProductName");
            System.out.println(city);
        }

        // Step 7 - Close the connection
        connection.close();
    }
}
