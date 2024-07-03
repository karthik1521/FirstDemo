package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DynamicJDBC {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/batch_9899";
			String username="root";
			String password="Root";
			Connection con=DriverManager.getConnection(url, username, password);
			String query= "insert into trainer value(?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, 90319);
			stmt.setString(2, "naveen");
			stmt.setString(3, ".net");
			stmt.setInt(4, 120000);
			stmt.setString(5, "chennai");
			stmt.setString(6, "naveen123@gmail.com");
			stmt.executeUpdate();
			System.out.println("values get successfully");
			
			String query1= "insert into trainer value(?,?,?,?,?,?)";
			PreparedStatement stmt1=con.prepareStatement(query1);
			stmt1.setInt(1, 90319);
			ResultSet rs=stmt1.executeQuery();
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
