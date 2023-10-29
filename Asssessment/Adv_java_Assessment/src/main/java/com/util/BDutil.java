package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class BDutil 
{
	Connection cn=null;
	
	public Connection getConnectionData()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aniket", "root", "");
			System.out.println("Connection Established");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
}
