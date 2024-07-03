package com.jdbc;
import java.sql.*;
public class MyJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("welcome to mysql");
		
		Class.forName("com.mysql.cj.jdbc.Driver");//step1: Loading the MySQL Driver
		
		//step-2: Provide the Connection: Path to the database,UserName,Password
		
		String url="jdbc:mysql://localhost:3306/batch_9899";
		String username="root";
		String password="Root";
		Connection con=DriverManager.getConnection(url, username, password);
		
		if(con!=null)
		{
			System.out.println("connection established successfully!!!");
		}
		
		//step-3:create statement
		
		Statement stmt=con.createStatement();
		//step-4: Exicute the SQL queries:
		ResultSet rs=stmt.executeQuery("select * from trainer;");
		System.out.println(rs);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		}

	}

}
