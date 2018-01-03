package com.library.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class LibraryDatabase {
	
	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=demo.demo;database=LibDemo");
		}catch(Exception exception){
			System.out.println(exception);
		}
		return con;
	}	
}
