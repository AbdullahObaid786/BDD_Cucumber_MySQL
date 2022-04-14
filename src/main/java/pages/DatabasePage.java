package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	String columnValue = null;
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public String getData(String columnName) {

		try {
			// Setting the properties for MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://localhost:3306/october2021";
			String username = "root";
			String password = "Obaid@2027";
			String query = "select * from users";

			// create connection to local database
			connection = DriverManager.getConnection(sqlUrl, username, password);

			// Empower connection reference variable to execute queries
			statement = connection.createStatement();

			// Deliver the query
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				columnValue = resultSet.getString(columnName);
				return columnValue;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return columnValue;

	}

}
