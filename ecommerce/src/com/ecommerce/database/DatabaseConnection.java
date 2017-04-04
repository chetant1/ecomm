package com.ecommerce.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
	public static Connection getConnection() {
		Properties dbProp = new Properties();
		String DB_DRIVER, DB_URL, DB_NAME, DB_USER, DB_PASSWORD;
		Connection dbCon = null;
		try {
			dbProp.load(DatabaseConnection.class.getClassLoader()
					.getResourceAsStream(
							"com/ecommerce/database/Settings.properties"));
			System.out.println("IN DB .....");
			DB_DRIVER = dbProp.getProperty("DB_DRIVER");
			DB_URL = dbProp.getProperty("DB_URL");
			DB_NAME = dbProp.getProperty("DB_NAME");
			DB_USER = dbProp.getProperty("DB_USER");
			DB_PASSWORD = dbProp.getProperty("DB_PASSWORD");

			Class.forName(DB_DRIVER);
			dbCon = DriverManager.getConnection(DB_URL + DB_NAME, DB_USER,
					DB_PASSWORD);
		} catch (IOException e) {
			System.out.println("Error : Failed to load Properties file");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Error : Class Not Found " + e);
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error : SQL Error " + e);
			e.printStackTrace();
		}

		return dbCon;
	}
}
