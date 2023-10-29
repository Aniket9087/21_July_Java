package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.user;
import com.util.BDutil;

public class ForgotDao 
{
	public user checkemail(String email)
	{
		user u=new user();
		
		try {
			Connection cn=new BDutil().getConnectionData();
			String qry="select * from info where email=?";
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			
			
			if(rs.next())
			{
				u.setId(1);
				u.setEmail(email);
				u.setFirstname(rs.getString(2));
				u.setLastname(rs.getString(3));
			}
			else
			{
				u=null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return u;
	}
	
	public int changepassword(user u)
	{
		int r=0;
		
		try {
			Connection cn=new BDutil().getConnectionData();
			String qry="update info set password=? where id=?";
			PreparedStatement st=cn.prepareStatement(qry);
			
			st.setString(1, u.getPassword());
			st.setInt(2, u.getId());
			r=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return r;
	}
}
