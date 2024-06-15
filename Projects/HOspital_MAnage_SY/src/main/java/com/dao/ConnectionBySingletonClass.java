package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBySingletonClass 
{
	//static reference to itself
    private static ConnectionBySingletonClass connectionfactroyobject = new ConnectionBySingletonClass();
    
    public static final String MySQLDRIVER_CLASS = "com.mysql.jdbc.Driver"; 
    public static final String MySQLURL = "jdbc:mysql://localhost/medical";
    public static final String MySQLUSER = "root";
    public static final String MySQLPASSWORD = "";
    
    
  //private constructor
    private ConnectionBySingletonClass() 
    {
        try 
        {
            Class.forName(MySQLDRIVER_CLASS);
        } catch (ClassNotFoundException e) { e.printStackTrace();}
    }
    
    private Connection createConnection() 
    {
        Connection cn = null;
        try 
        {
        	cn = DriverManager.getConnection(MySQLURL, MySQLUSER, MySQLPASSWORD);
        } catch (SQLException e) 
          {
            System.out.println("ERROR: Unable to Connect to Database.");
          }
        return cn;
    }   
     
    public static Connection getConnection() 
    {
        return connectionfactroyobject.createConnection();
    }
}
