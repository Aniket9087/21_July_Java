package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Hbutil 
{
	Connection cn=null;
	
	public Connection getconnectiondata()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment");
			System.out.println("Connection Established...");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cn;
	}
}
