package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Usermodel;
import com.util.Dbutil;

public class LoginDao 
{
	Connection cn=null;
	Usermodel model=null;
	
	public Usermodel getlogin(Usermodel lmodel)
	{
		cn=new Dbutil().getconnection();
		try {
			PreparedStatement st=cn.prepareStatement("select * from message where email=? and password=?");
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			
			ResultSet rs=st.executeQuery();
			
			
			if(rs.next())
			{
				model=new Usermodel();
				model.setUid(rs.getInt(1));
				model.setFname(rs.getString("fname"));
				model.setLname(rs.getString("lname"));
				model.setEmail(rs.getString(4));
				model.setMobile(rs.getString(5));
				model.setPassword(rs.getString(6));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
	}
}
