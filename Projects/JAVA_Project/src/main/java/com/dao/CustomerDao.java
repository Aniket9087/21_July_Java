package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.CustomerModel;
import com.model.bookmodel;
import com.util.DBUtil;

public class CustomerDao 
{
	Connection cn=null;
	
	int x=0;
	
	public int customerRegistration(CustomerModel rmodel)
	{
		cn=new DBUtil().getConnecttionData();
		String qry="insert into customer(firstname,lastname,gender,address,city,pincode,mobile,email,password) values(?,?,?,?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getGender());
			st.setString(4, rmodel.getAddress());
			st.setString(5, rmodel.getCity());
			st.setInt(6, rmodel.getPincode());
			st.setString(7, rmodel.getMobile());
			st.setString(8, rmodel.getEmail());
			st.setString(9, rmodel.getPassword());
			
			x=st.executeUpdate();
			
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	CustomerModel model=null;
	
	public CustomerModel getCustomerLogin(CustomerModel lmodel)
	{
		cn=new DBUtil().getConnecttionData();
		String qry="select * from customer where email=? and password=?";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
			{
				model=new CustomerModel();
				model.setCustomerid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setGender(rs.getString(4));
				model.setAddress(rs.getString(5));
				model.setCity(rs.getString(6));
				model.setPincode(rs.getInt(7));
				model.setMobile(rs.getString(8));
				model.setEmail(rs.getString(9));
				model.setPassword(rs.getString(10));
				
				cn.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			model=null;
			e.printStackTrace();
		}
		
		return model;
		
	}
	public String getProductName(int productid)
	{
		String pname=null;
		cn=new DBUtil().getConnecttionData();
		String qry="select * from product where productid=?";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, productid);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				pname=rs.getString(2);
			}
			cn.close();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pname;
	}
	public int bookProduct(bookmodel bmodel)
	{
		int x=0;
		cn=new DBUtil().getConnecttionData();
		String qry="insert into booking(productid,customerid,bookdate,price,status) values(?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, bmodel.getProductid());
			st.setInt(2, bmodel.getCustomerid());
			st.setString(3, bmodel.getBookdate());
			st.setString(4, bmodel.getPrice());
			st.setString(5, bmodel.getStatus());
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return x;
	}
	
}
