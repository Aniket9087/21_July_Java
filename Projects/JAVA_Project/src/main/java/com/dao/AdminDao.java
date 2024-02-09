package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.model.MainProductsModel;
import com.model.SubProductModel;
import com.util.DBUtil;

public class AdminDao 
{
Connection cn=null;
	
	int x=0;
	
	public int AddMProducts(MainProductsModel mpm)
	{
		cn=new DBUtil().getConnecttionData();
		String qry="insert into mainproducts(mproductname,mimage) values(?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, mpm.getMproductname());
			st.setString(2, mpm.getMimage());
			
			
			x=st.executeUpdate();
			
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	public int AddSProducts(SubProductModel spm)
	{
		x=0;
		cn=new DBUtil().getConnecttionData(); 
		String qry="insert into subproducts(mproductid,sproductname,simage,price,content) values(?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, spm.getMproductid());
			st.setString(2, spm.getSproductname());
			st.setString(3, spm.getSimage());
			st.setString(4, spm.getPrice());
			st.setString(5, spm.getContent());
			
			x=st.executeUpdate();
			
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}
