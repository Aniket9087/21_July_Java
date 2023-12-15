package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.usermodel;
import com.util.DBUtil;

public class loginDao 
{
	Session session = null;
	Transaction tx= null;
	usermodel model=null;
	public usermodel getLogin(usermodel lmodel)
	{
		session=new DBUtil().getSessionData();
		tx=session.beginTransaction();
		Query q=session.createQuery("from usermodel as u where u.username=:username and u.password=:password");
		q.setParameter("username", lmodel.getUsername());
		q.setParameter("password", lmodel.getPassword());
		List<usermodel> lists=q.list();
		model=lists.get(0);
		
		return model;
		
	}
}
