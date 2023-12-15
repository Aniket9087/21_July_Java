package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Usermodel;
import com.util.Hbutil;

public class Hbdao 
{
	Connection cn=null;
	int x=0;
	
	public int doregister(Usermodel rmodel)
	{
		cn=new Hbutil().getconnectiondata();
		
		try {
			PreparedStatement st=cn.prepareStatement("insert into home(fname,lname,username,password) values(?,?,?,?)");
			st.setString(1, rmodel.getFname());
			st.setString(2, rmodel.getLname());
			st.setString(3, rmodel.getUsername());
			st.setString(4, rmodel.getPassword());
			
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return x;
	}
}
