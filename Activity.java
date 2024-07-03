package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Activity {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/batch_9899";
			String username="root";
			String password="Root";
			Connection con=DriverManager.getConnection(url, username, password);
			String up= "update trainer set tsubject='senior developer' where tid=90319";
			PreparedStatement stmt=con.prepareStatement(up);
			stmt.executeUpdate();
	        System.out.println("Successfully updated");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
