package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.user;
import com.util.BDutil;

public class LoginDao 
{
	Connection cn=null;
	user model=null;
	
	public user getlogin(user lmodel)
	{
		cn=new BDutil().getConnectionData();
		try {
			PreparedStatement st=cn.prepareStatement("select * from info where email=? and password=?");
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				model=new user();
				model.setId(rs.getInt(1));
				model.setFirstname(rs.getString("firstname"));
				model.setLastname(rs.getString("lastname"));
				model.setEmail(rs.getString("email"));
				model.setMobile(rs.getString("mobile"));
				model.setAddress(rs.getString("address"));
				model.setGender(rs.getString("gender"));
				model.setPassword(rs.getString(8));
				model.setCpassword(rs.getString(9));
				
			}
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
		
	}
}
