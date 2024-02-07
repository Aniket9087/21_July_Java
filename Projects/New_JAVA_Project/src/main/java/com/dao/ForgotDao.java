package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.CustomerModel;
import com.util.DBUtil;

public class ForgotDao 
{
	public CustomerModel checkemail(String email)
	{
		CustomerModel f=new CustomerModel();
		try {
			Connection cn=new DBUtil().getConnecttionData();
			String qry="select * from customer where email=?";
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				f.setCustomerid(1);
				f.setEmail("email");
				f.setFirstname(rs.getString(2));
				f.setLastname(rs.getString(3));
			}
			else
			{
				f=null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
	public int resetpassword(CustomerModel f)
	{
		int r=0;
		try {
			Connection cn=new DBUtil().getConnecttionData();
			String qry="update customer set password=? where customerid=?";
			PreparedStatement st=cn.prepareStatement(qry);
			
			st.setString(1, f.getPassword());
			st.setInt(2, f.getCustomerid());
			r=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
	}
}
