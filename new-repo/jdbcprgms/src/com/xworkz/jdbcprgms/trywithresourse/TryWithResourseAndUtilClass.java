package com.xworkz.jdbcprgms.trywithresourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.util.Util;
import com.xworkz.jdbcprgms.util.UtilClass;

public class TryWithResourseAndUtilClass {

		public static void main(String[] args) throws SQLException {
			
			try(Connection con=DriverManager.getConnection(UtilClass.url, UtilClass.userName, UtilClass.password)) {
				System.out.println("loaded driver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				System.out.println("got the connection");
				System.out.println("statement creation");
				Statement stmt=con.createStatement();

				System.out.println("");
				System.out.println("insert value into table");
				String insertQuery="insert into student values(1, 'Bhairavi', 'female'), (2, 'Savitri', 'female'), (3, 'geetha', 'female')";
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
