package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.UserModel;
import com.util.DBUtil;

public class LoginDao 
{
	Connection cn=null;
	UserModel model=null;
	
	public UserModel getlogin(UserModel lmodel)
	{
		cn=new DBUtil().getConnecttionData();
		try {
			PreparedStatement st=cn.prepareStatement("select * from client where email=? and password=?");
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return model;
		
	}
}
