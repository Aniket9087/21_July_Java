package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Cart;
import com.model.Item;
import com.util.Hbutil;

public class Hbdao 
{
	Session session=null;
	Transaction tx=null;
	
	public void addcart(Cart c)
	{
		session=new Hbutil().getsession();
		tx=session.beginTransaction();
		session.save(c);
		session.close();
		System.out.println("Cart Record Inserted...");
	}
	
	public void additem(Item i)
	{
		session=new Hbutil().getsession();
		tx=session.beginTransaction();
		session.save(i);
		tx.commit();
		session.close();
		System.out.println("Item Record Inserted...");
	}
}
