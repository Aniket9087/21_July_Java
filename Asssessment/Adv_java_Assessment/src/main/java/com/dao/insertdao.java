package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.user;
import com.util.BDutil;

public class insertdao 
{
	Connection cn=null;
	int x=0;
	
	public int dinsert(user u)
	{
		cn= new BDutil().getConnectionData();
		try {
			PreparedStatement st=cn.prepareStatement("insert into info(firstname,lastname,email,mobile,address,gender,password,cpassword) values(?,?,?,?,?,?,?,?)");
			st.setString(1,u.getFirstname());
			st.setString(2, u.getLastname());
			st.setString(3, u.getEmail());
			st.setString(4, u.getMobile());
			st.setString(5, u.getAddress());
			st.setString(6, u.getGender());
			st.setString(7, u.getPassword());
			st.setString(8, u.getCpassword());
			
			x=st.executeUpdate();
			cn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
		
	}
}
