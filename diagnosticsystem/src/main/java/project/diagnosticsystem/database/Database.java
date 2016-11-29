//Database.java
package project.diagnosticsystem.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import project.diagnosticsystem.model.Disease;
import project.diagnosticsystem.model.Symptom;

public class Database {
	final private String DRIVER = "com.mysql.jdbc.Driver";
	final private String URL = "jdbc:mysql://localhost:3306/project";
	final private String USER = "root";
	final private String PASSWORD = "tiger";

	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;

	private void getConnection() {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			statement = connection.createStatement();

		} catch (ClassNotFoundException e) {
			// handle
		} catch (SQLException e) {
			// handle
		}
	}

	public Database() {
		getConnection();
	}

	public List<Symptom> getSymptomList(String bodyarea) {
		// the sql query
		String query = "Select * from " + bodyarea + "symptom";
		List<Symptom> list = new ArrayList<>();
		try {
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				String name = resultSet.getString(1);
				String area = resultSet.getString(2);
				list.add(new Symptom(name, area));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public List<Disease> getDiseaseList(String parsedQuery) {
		// the sql query

		List<Disease> list = new ArrayList<>();
		try {
			resultSet = statement.executeQuery(parsedQuery);
			while (resultSet.next()) {
				String name = resultSet.getString(1);
				String description = resultSet.getString(2);
				String severity = resultSet.getString(3);
				String area = resultSet.getString(4);
				list.add(new Disease(name, description, severity, area));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
