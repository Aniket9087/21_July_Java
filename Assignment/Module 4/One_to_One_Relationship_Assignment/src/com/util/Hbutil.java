package com.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Student;

public class Hbutil 
{
	Properties prop=null;
	Configuration cg=null;
	SessionFactory fact=null;
	Session session=null;
	
	public Session getsession()
	{
		prop=new Properties();
		prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hb");
		prop.setProperty("hibernate.connection.username", "root");
		prop.setProperty("hibernate.connection.password", "");
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.format_sql", "true");
		prop.setProperty("hibernate.show_sql", "true");
		
		cg=new Configuration();
		cg.addProperties(prop).addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);
		fact=cg.buildSessionFactory();
		session=fact.openSession();
		return session;
	}
}
