package com.xworkz.jdbcprgms.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class runner {

	public static void main(String[] args) throws SQLException {
		
		try {
			System.out.println("loaded driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("getting the connection");
			Connection con=DriverManager.getConnection("jdbc:mysql://locahost:3306/db1", "root", "Bhairavitn1999");
			
			System.out.println("statement creation");
			Statement stmt=con.createStatement();
			
			System.out.println("prepare query");
			String query="create table student(id int primary, name varchar(20), gender varchar(20)";
			
			System.out.println("execute query");
			boolean createStatus=stmt.execute(query);
			System.out.println("Is table exist already: "+createStatus);
			
			System.out.println("connection is closed");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
