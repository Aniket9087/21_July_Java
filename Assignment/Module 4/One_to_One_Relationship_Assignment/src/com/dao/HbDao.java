package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Address;
import com.model.Student;
import com.util.Hbutil;

public class HbDao 
{
	Session session=null;
	Transaction tx=null;
	
	public void addstudent(Student s)
	{
		session=new Hbutil().getsession();
		tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("Student Record Inserted...");
	}
	
	public void addadress(Address ad)
	{
		session=new Hbutil().getsession();
		tx=session.beginTransaction();
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("Address Record Inserted...");
	}
}
