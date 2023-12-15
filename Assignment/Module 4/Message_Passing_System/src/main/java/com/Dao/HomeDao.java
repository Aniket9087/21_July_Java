package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Usermodel;
import com.util.Dbutil;

public class HomeDao 
{
	Connection cn=null;
	Usermodel model=null;
	
	int x=0;
	
	public Usermodel verifylogin(int uid)
	{
		cn=new Dbutil().getconnection();
		try {
			PreparedStatement st=cn.prepareStatement("select * from message where uid=?");
			st.setInt(1, uid);
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
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
	}
	
	public int updateuser(Usermodel hmodel)
	{
		x=0;
		cn=new Dbutil().getconnection();
		
		try {
			PreparedStatement st=cn.prepareStatement("update message set fname=?,lname=?,email=?,mobile=?,password=? where uid=?");
			st.setString(1, hmodel.getFname());
			st.setString(2, hmodel.getLname());
			st.setString(3, hmodel.getEmail());
			st.setString(4, hmodel.getMobile());
			st.setString(5, hmodel.getPassword());
			st.setInt(6, hmodel.getUid());
			
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
	}
	
	public int deleteuser(int uid)
	{
		x=0;
		cn=new Dbutil().getconnection();
		
		try {
			PreparedStatement st=cn.prepareStatement("delete from message where uid=?");
			st.setInt(1, uid);
			x=st.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
}
