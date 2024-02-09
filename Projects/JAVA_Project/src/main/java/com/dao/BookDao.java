package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.bookmodel;
import com.util.DBUtil;

public class BookDao 
{
	Connection cn=null;
	int x=0;
	bookmodel model=null;
	public int bookProduct(bookmodel bmodel)
	{
		cn=new DBUtil().getConnecttionData();
		try {
			PreparedStatement ps=cn.prepareStatement("insert into book(customerid,sproductid,price,qty,date,total,bookstatus,paymentstatus) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, bmodel.getCustomerid());
			ps.setInt(2, bmodel.getBookid());
			ps.setString(3, bmodel.getPrice());
			ps.setInt(4, bmodel.getQty());
			ps.setInt(5, bmodel.getTotal());
			x=ps.executeUpdate();
			cn.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
	}
	public int update(bookmodel bmodel)
	{
		cn=new DBUtil().getConnecttionData();
		 try {
		        PreparedStatement ps = cn.prepareStatement("update book set qty=?, total=? where sproductid=?");
		        ps.setInt(1, bmodel.getQty());
		        ps.setInt(2,bmodel.getTotal());
		        x=ps.executeUpdate();
		        cn.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		
		
		return x;
	}
	public int delete(int id)
	{
		int x=0;
		cn= new DBUtil().getConnecttionData();
		try {
			PreparedStatement ps=cn.prepareStatement("delete from book where sproductid=?");
			ps.setInt(1, id);
			x=ps.executeUpdate();
			cn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}
