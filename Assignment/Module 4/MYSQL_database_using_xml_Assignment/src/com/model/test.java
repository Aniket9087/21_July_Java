package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		
		insertform i=new insertform();
		i.setId(1);
		i.setFirstname("Aniket");
		i.setLastname("Parmar");
		i.setEmail("aniketparmar@gmail.com");
		i.setGender("Male");
		i.setMobile("9316159616");
		i.setPassword("123");
	}
}
