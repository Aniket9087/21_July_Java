package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionByStaticMethod 
{
	public static final String MySQLDRIVER_CLASS = "com.mysql.jdbc.Driver"; 
    public static final String MySQLURL = "jdbc:mysql://localhost/medical";
    public static final String MySQLUSER = "root";
    public static final String MySQLPASSWORD = "";
	
    
    
	public static Connection getMySQLConnection()
	{
		Connection cn = null;
		try 
		{
		//JDBC STEP 1
           // Load and Register Driver -
           //(connector jar file should be put in lib folder)
		
		   Class.forName(MySQLDRIVER_CLASS);
	
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		
	    try 
	    {
	       //JDBC STEP 2
	       //	Establish Connection between Java & DB
	       //  	jdbc - main protocol
	       //  	mysql://localhost:3306 - subprotocol
	       //  	jdbcdb - database name
	       //   getconnection internally call Driver.connect() method & establish socket connection
		
	    	cn = DriverManager.getConnection(MySQLURL,MySQLUSER,MySQLPASSWORD);
		
	    } catch (SQLException e) {e.printStackTrace();}
	    
	    return cn;
	}
	
	public static void closeMySQLConnection(Connection cn)
	{
		if(cn != null)
		{
			try 
			{
				cn.close();
			
			} catch (SQLException e) {e.printStackTrace();}
		}
    }
	
	public static void closeMySQLPreaparedStatementConnection(PreparedStatement st)
	{
		if(st != null)
		{
			try 
			{
				st.close();
			
			} catch (SQLException e) {e.printStackTrace();}
		}
    }
	
	public static void closeMySQLResulsetConnection(ResultSet rs)
	{
		if(rs != null)
		{
			try 
			{
				rs.close();
			
			} catch (SQLException e) {e.printStackTrace();}
		}
    }
}
