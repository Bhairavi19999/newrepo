package com.xworkz.jdbcprgms.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class runner {

	public static void main(String[] args) throws SQLException {
		
		try {
			System.out.println("loaded driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
			System.out.println("got the connection");
			System.out.println("statement creation");
			Statement stmt=con.createStatement();
			
			/* should not create table from java prgm, table has been created by DB developer
			 * System.out.println(""); System.out.println("prepare query"); String
			 * query="create table student(id int primary key, name varchar(20), gender varchar(20))"
			 * ; System.out.println("execute query"); boolean
			 * createStatus=stmt.execute(query);
			 * System.out.println("Is table exist already: "+createStatus);
			 */
			System.out.println("");
			System.out.println("insert value into table");
			String insertQuery="insert into student values(1, 'Bhairavi', 'female'), (2, 'Savitri', 'female')";
			int rows=stmt.executeUpdate(insertQuery);
			System.out.println("No. of rows inserted: "+rows);
			
			System.out.println("");
			System.out.println("read the data");
			String readValues="select * from student";
			ResultSet set = stmt.executeQuery(readValues);
			while(set.next()) {
				System.out.println("ID: "+set.getInt(1)+", Name: "+set.getString(2)+", Gender: "+set.getString(3));
			}
			
			System.out.println("");
			System.out.println("delete record from table");
			String deleteQuery="delete from student where id=2";
				int deletedRows=stmt.executeUpdate(deleteQuery);
				System.out.println("No. of rows deleted: "+deletedRows);
				
				} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
