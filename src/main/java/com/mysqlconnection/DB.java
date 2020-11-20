package com.mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static void main(String[] args)  {

		//connection string

		String driver = "com.mysql.jdbc.driver";
		String url = "jdbc:mysql://localhost:3306/logintest"; 
		String user = "root"; 
		String pwd = "asdfg$789"; 

		try {
			//Creating connection with db

			Connection con = DriverManager.getConnection(url, user, pwd);

			//			to insert new row
						
//						String sql = "INSERT INTO studentlogin (Id, user , password) VALUES (?, ?, ?)";
//						PreparedStatement stmt = con.prepareStatement(sql);
//						stmt.setString(1, "5");
//						stmt.setString(2, "Tom");
//						stmt.setString(3, "abcd@123");
//						
//						int rows = stmt.executeUpdate();
//						if(rows > 0) {
//							System.out.println("A row has been inserted");
//							}
//						
//						stmt.close();

			//Get all rows from DB
			
			String sql = "SELECT * FROM studentlogin";
			Statement stmt = con.createStatement();  //Create Statement Object

			// Execute the SQL Query. Store results in ResultSet
			ResultSet result = stmt.executeQuery(sql);



			//Extract data from result set

			while(result.next()) {
				String Id = result.getString(1);
				String username = result.getString(2);
				String password = result.getString(3);

				//Display values
				
				System.out.println(Id +" "+ username +" "+ password);

			}
			result.close();
			stmt.close();
			con.close();
		}
		catch(SQLException e) {
			System.out.println("Connection fail");
			e.printStackTrace();

		}
	}

}
