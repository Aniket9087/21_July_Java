package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.UserModel;
import com.util.DBUtil;

public class HomeDao
{
	Connection cn=null;
	UserModel model=null;
	int x=0;
	
	public UserModel veryfilogin(int id)
	{
		cn=new DBUtil().getConnecttionData();
		try {
			PreparedStatement st=cn.prepareStatement("select * from client where id=?");
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				model=new UserModel();
				model.setId(rs.getInt(1));
				model.setFname(rs.getString("fname"));
				model.setLname(rs.getString("lname"));
				model.setEmail(rs.getString(4));
				model.setMobile(rs.getString(5));
				model.setGender(rs.getString(6));
				model.setPassword(rs.getString(7));
			}
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	
	public int updateuser(UserModel hmodel)
	{
		 x=0;
		cn=new DBUtil().getConnecttionData();
		try {
			PreparedStatement st=cn.prepareStatement("update client set fname=?,lname=?,email=?,mobile=?,gender=?,password=? where id=?");
			st.setString(1, hmodel.getFname());
			st.setString(2, hmodel.getLname());
			st.setString(3, hmodel.getEmail());
			st.setString(4, hmodel.getMobile());
			st.setString(5, hmodel.getGender());
			st.setString(6, hmodel.getPassword());
			st.setInt(7, hmodel.getId());
			
			x=st.executeUpdate();
			
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return x;
	}
	
	public int deleteuser(int id)
	{
		x=0;
		cn=new DBUtil().getConnecttionData();
		try {
			PreparedStatement st=cn.prepareStatement("delete from client where id=?");
			st.setInt(1, id);
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}
