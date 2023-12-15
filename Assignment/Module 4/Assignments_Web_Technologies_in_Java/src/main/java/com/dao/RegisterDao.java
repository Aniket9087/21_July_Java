package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.UserModel;
import com.util.DBUtil;

public class RegisterDao 
{
	Connection cn=null;
	int x=0;
	public int doregister(UserModel rmodel)
	{
		
		cn=new DBUtil().getConnecttionData();
		try {
			PreparedStatement st=cn.prepareStatement("insert into client(fname,lname,email,mobile,gender,password) values(?,?,?,?,?,?)");
			st.setString(1, rmodel.getFname());
			st.setString(2, rmodel.getLname());
			st.setString(3, rmodel.getEmail());
			st.setString(4, rmodel.getMobile());
			st.setString(5, rmodel.getGender());
			st.setString(6, rmodel.getPassword());
			
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
		
		
	}
}
