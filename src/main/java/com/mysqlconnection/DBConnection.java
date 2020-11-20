package com.mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args)  {

		//connection string

		String driver = "com.mysql.jdbc.driver";
		String url = "jdbc:mysql://localhost:3306/logintest"; 
		String user = "root"; 
		String password = "asdfg$789"; 

		try {

			//Register JDBC driver
			//Class.forName("driver");

			//Creating connection with db
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection success");

		}
		catch(SQLException e) {
			System.out.println("Connection fail");
			e.printStackTrace();

		}
	}

}
