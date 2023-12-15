package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.usermodel;
import com.util.DBUtil;


public class RegistrationDao
{
	Session session=null;
	Transaction tx=null;
	String msg="";
	
	public String doRegister(usermodel rmodel)
	{
		try 
		{
			session=new DBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(rmodel);
			tx.commit();
			session.close();
			msg="Record Inserted";
			
		} catch (Exception e) {
			msg="erros";
			e.printStackTrace();
		}
		return msg;
	}	
}
