package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Usermodel;
import com.util.Dbutil;

public class ForgotDao 
{
	public Usermodel checkemail(String email)
	{
		Usermodel u=new Usermodel();
		
		Connection cn=new Dbutil().getconnection();
		String qry="select * from message where email=?";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				u.setUid(1);
				u.setEmail(email);
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
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
	
	public int changepassword(Usermodel u)
	{
		int r=0;
		
		Connection cn=new Dbutil().getconnection();
		String qry="update message set password=? where id=?";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, u.getPassword());
			st.setInt(2, u.getUid());
			r=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
	}
}
