package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.model.AppHistoryModel;
import com.model.DiagnosticTestModel;
import com.model.DoctorModel;
import com.model.FeedbackModel;
import com.model.PatientContactModel;
import com.model.PatientModel;



public class CustomerDao 
{
	public boolean userRegistration(DoctorModel dc) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		boolean f = false;
		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
	         
	         st = cn.prepareStatement("insert into doctor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		     
				/*
				 * pst.setString(1, docobj.getEmail()); pst.setString(2, docobj.getPassword());
				 * pst.setString(3, docobj.getFirst_name()); pst.setString(4,
				 * docobj.getLast_name()); pst.setString(5, docobj.getPhone()); pst.setString(6,
				 * docobj.getDesignation()); pst.setString(7, docobj.getAddress());
				 * pst.setString(8, docobj.getDate()); pst.setString(9, docobj.getTime());
				 * pst.setString(10, docobj.getZip()); pst.setString(11, docobj.getState());
				 * pst.setString(12, docobj.getDepartment()); pst.setString(13,
				 * docobj.getSalary()); pst.setString(14, "false");
				 */
	         
	         st.setString(1, dc.getFirst_name());
	         st.setString(2, dc.getLast_name());
	         st.setString(3, dc.getEmail());
	         st.setString(4, dc.getPassword());
	         st.setString(5, dc.getPhone());
	         st.setString(6, dc.getAddress());
	         st.setString(7, dc.getState());
	         st.setString(8, dc.getZip());
	         st.setString(9, dc.getDate());
	         st.setString(10, dc.getTime());
	         st.setString(11, dc.getDesignation());
	         st.setString(12, dc.getSalary());
	         st.setString(13, dc.getDepartment());
			 st.setString(14, "false"); 
		     int i = st.executeUpdate();		     
		     if(i > 0 )
		    	 
		    	 f = true;
           
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
	     finally 
	     {
	    	 
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	
	public boolean patUpdate(PatientModel pt) 
	{
		Connection cn=null;
		PreparedStatement st=null;
		 
		boolean f=false;
		try {
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			st=cn.prepareStatement("update patient set last_name=?,phone=?,address=?,state=? where email=?");
			st.setString(1, pt.getLast_name());
			st.setString(2, pt.getPhone());
			st.setString(3, pt.getAddress());
			st.setString(4, pt.getState());
			st.setString(5, pt.getEmail());
			
			int i=st.executeUpdate();
			if(i>0)
				f=true;
		}
		catch(SQLException e)
		{
			System.out.print(e.toString());
		}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
	     }
		
	    return f;
	}

	
	
	
	public boolean docUpdate(DoctorModel dc) 
	{
		Connection cn=null;
		PreparedStatement st=null;
		 
		boolean f=false;
		try {
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			st=cn.prepareStatement("update doctor set last_name=?,phone=?,address=?,salary=? where email=?");
			st.setString(1, dc.getLast_name());
			st.setString(2, dc.getPhone());
			st.setString(3, dc.getAddress());
			st.setString(4, dc.getSalary());
			st.setString(5, dc.getEmail());
			
			int i=st.executeUpdate();
			if(i>0)
				f=true;
		}
		catch(SQLException e){System.out.print(e.toString());
		}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	
	
	public boolean patBooking(AppHistoryModel app)
	{
		Connection cn=null;
		PreparedStatement st=null;
		boolean f=false;
		try {
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			st=cn.prepareStatement("insert into appointment_history values(?,?,?,?,?,?,?,?,?)");
			st.setString(1, app.getBooking_ref());
			st.setString(2, app.getP_email());
			st.setString(3, app.getFirst_name());
			st.setString(4, app.getLast_name());
			st.setString(5, app.getD_email());
			st.setString(6, app.getAppointment_date());
			st.setString(7, app.getAppointment_reason());
			st.setString(8, app.getFlag());
			st.setString(9, app.getSalary());
			
			int i=st.executeUpdate();
			if(i>0)
				f=true;
		}
		catch(SQLException e){System.out.print(e.toString());
		}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	

	public boolean patFeedback(FeedbackModel feed) 
	{
		Connection cn=null;
		PreparedStatement st=null;
		PreparedStatement st1=null;
		String booking_ref= feed.getBooking_ref();
		boolean f=false;
		int j;
		try {
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			st1=cn.prepareStatement("select * from feedback where booking_ref=?");
			st1.setString(1,feed.getBooking_ref());
			ResultSet rs=st1.executeQuery();
			if(rs.next()) 
			{
				f=false;
			}
			else 
			{
			st=cn.prepareStatement("insert into feedback values(?,?,?,?,?)");
			st.setString(1, feed.getBooking_ref());
			st.setString(2, feed.getP_email());
			st.setString(3, feed.getD_email());
			st.setString(4, feed.getMessage());
			st.setString(5, feed.getFlag());

			int i=st.executeUpdate();
			if(i>0)
				f=true;
		}
			
			
		}
		
		catch(SQLException e){System.out.print(e.toString());
		}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
	     }
		
	    return f;
	}
	
	

	public boolean patContact(PatientContactModel contact) 
	{
		Connection cn=null;
		PreparedStatement st=null;
		boolean f=false;
		int j;
		try 
		{
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			st=cn.prepareStatement("insert into pat_contact values(?,?,?,?)");
			st.setString(1, contact.getFirst_name());
			st.setString(2, contact.getP_email());
			st.setString(3, contact.getMessage());
			st.setString(4, contact.getReference_no());


			int i=st.executeUpdate();
			if(i>0)
				f=true;
		}
			
			
		
		catch(SQLException e)
		{
			System.out.print(e.toString());
		}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
	     }
		
	    return f;
	}
	
	public boolean docTestAssign(DiagnosticTestModel diag) 
	{
		Connection cn=null;
		PreparedStatement st=null;
		boolean f=false;
		int j;
		try {
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			st=cn.prepareStatement("insert into diagnostic_test values(?,?,?,?,?,?,?,?)");
			st.setString(1, diag.getTest_id());  
			st.setString(2, diag.getBooking_ref());
			st.setString(3, diag.getP_email());
			st.setString(4, diag.getD_email());
			st.setString(5, diag.getTest_name());
			st.setString(6, diag.getTest_price());
			
			
			/* st.setString(7, diag.getFlag()); */ st.setString(7, diag.getTest_date());
			  st.setString(8, diag.getPayment_date());
			 

			int i=st.executeUpdate();
			if(i>0)
				f=true;
		}
			
			
		
		catch(SQLException e)
		{
			System.out.print(e.toString());
		}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
	     }
		
	    return f;
	}

	public String patTest(DiagnosticTestModel diag) 
	{
		Connection cn=null;
		PreparedStatement st=null;
		String f="false";
		LocalDate localDate = LocalDate.now();//For reference
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String today = localDate.format(formatter);
		int j;
		try {
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			System.out.println("U Entered inside"+diag.getTest_date()+""+diag.getTest_id()+" "+diag.getFlag());

			if(diag.getFlag().equals("true"))
			{
				st=cn.prepareStatement("update diagnostic_test set flag='false',test_date=?,payment_date=? where test_id=?");
				st.setString(1, diag.getTest_date());
				st.setString(2,today);
				st.setString(3,diag.getTest_id() );
				System.out.println("U Entered"+diag.getTest_date()+""+diag.getTest_id()+""+today);


			int i=st.executeUpdate();

			if(i>0)
				f="true";
		}
			else 
			{
				f="The Bill is being already generated";
			}
		}
		catch(SQLException e)
		{
			System.out.print(e.toString());
		}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
	    	 
	     }
		
	    return f;
	}
	
			
		public String patAlreadyBookedTest(DiagnosticTestModel diag) 
		{
			Connection cn=null;
			PreparedStatement st=null;
			String f="false";
			ResultSet rs=null;
			String payment_date=null;
			
			int j;
			try 
			{
				cn=DBConnectionByStaticMethod.getMySQLConnection();
				st=cn.prepareStatement("select payment_date from diagnostic_test where test_id=?");
				st.setString(1, diag.getTest_id()); 
				System.out.println("U Entered"+diag.getTest_id());


				rs=st.executeQuery();
				while(rs.next()) {
					payment_date=rs.getString(1);
				}

			}
		
		
		catch(SQLException e)
			{
				System.out.print(e.toString());
			}
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
	    	 
	     }
		
	    return payment_date;
	}
	
	
	public boolean userRegistration2(PatientModel pat) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		boolean f = false;
		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	         st = cn.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?)");
		     
				/*
				 * pst.setString(1, patobj.getEmail()); pst.setString(2, patobj.getPassword());
				 * pst.setString(3, patobj.getFirst_name()); pst.setString(4,
				 * patobj.getLast_name()); pst.setString(5, patobj.getPhone()); pst.setString(6,
				 * patobj.getAddress()); pst.setString(7, patobj.getState()); pst.setString(8,
				 * patobj.getZip());
				 */
	         
	         st.setString(1, pat.getFirst_name());
	         st.setString(2, pat.getLast_name());
	         st.setString(3, pat.getEmail());
	         st.setString(4, pat.getPassword());
	         st.setString(5, pat.getPhone());
	         st.setString(6, pat.getAddress());
	         st.setString(7, pat.getState());
	         st.setString(8, pat.getZip());
		     
		     int i = st.executeUpdate();		     
		     if(i > 0 )
		    	 f = true;
           
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
	     finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	
	
	public String userLogin(String email,String password) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		String first_name = null,last_name=null;
		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	         
	         st = cn.prepareStatement("select * from doctor where email= ? and password =?");
		     
		     st.setString(1, email);
		     st.setString(2, password);
		    	     
		     rs = st.executeQuery();
		     
		     if(rs.next())
		     {
		    	 if(rs.getString(14).equals("true")) 
		    	 {
		    		 first_name = rs.getString(1);
		    		 last_name=rs.getString(2);
		    	 }
		     }

	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
	     finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
	    return first_name;
	}

	public boolean docFeedbackEnable(String booking_ref) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		boolean f=false;

		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	        // connectionobject = ConnectionFactoryBySingletonClass.getConnection();
	      	         
	         st = cn.prepareStatement("update appointment_history set flag='false' where booking_ref=?");
		     
		     st.setString(1, booking_ref);
		    	     
		     int i=st.executeUpdate();
				if(i>0)
					f=true;
		
		     
		    
		     
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
	     finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	
	public boolean docEnable(String d_email) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		boolean f=false;

		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	         
	         st = cn.prepareStatement("update doctor set flag='true' where email=?");
		     
		     st.setString(1, d_email);
		    	     
		     int i=st.executeUpdate();
				if(i>0)
					f=true;
		
		     
		    
		     
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
	     finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	
	
	public DoctorModel searchUser(String emailid) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		DoctorModel dc = null;
		try
		{
	        cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	                 
	         st = cn.prepareStatement("select * from custreg where email= ?");
		     
		     st.setString(1, emailid);
		    		    	     
		     rs = st.executeQuery();
		     
		     if(rs.next())
		     {
		    	 dc = new DoctorModel();
		    	 
		    	dc.setEmail(rs.getString(1));
		    	
		    	dc.setFirst_name(rs.getString(3));
		    	dc.setLast_name(rs.getString(4));
		    	dc.setPhone(rs.getString(5));
		    	dc.setDesignation(rs.getString(6));
		    	dc.setAddress(rs.getString(7));
		    	dc.setDate(rs.getString(8));
		    	dc.setTime(rs.getString(9));
		    	dc.setDepartment(rs.getString(12));
		    	dc.setZip(rs.getString(10));
		    	dc.setState(rs.getString(11));
		    	
		 		
		    	
			     
		 		
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		 finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return dc;
	}
	
	public int count(AppHistoryModel app)
	{
		Connection cn = null;
		int c1 = 0;
		PreparedStatement st;
		try {
			cn = DBConnectionByStaticMethod.getMySQLConnection();

			st = cn.prepareStatement("select count(*) from appointment_history where d_email=? and appointment_date=?");
		 
	     st.setString(1, app.getD_email());
	     st.setString(2,app.getAppointment_date());
	     
	     ResultSet rs1 = st.executeQuery();
	     while(rs1.next()) {
	    	 String count1=rs1.getString(1);
	    	   c1 = Integer.parseInt(count1);
	     }
	
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c1;
	}

	
	public int income_year(AppHistoryModel app) 
	{
		Connection cn = null;
		int c1 = 0;
		int sum=0;
		PreparedStatement pst1;
		try 
		{
			cn = DBConnectionByStaticMethod.getMySQLConnection();

			pst1 = cn.prepareStatement("select * from appointment_history");
			
			
	     
	     ResultSet rs = pst1.executeQuery();
	     while(rs.next()) 
	     {
		     
		    	 String str = rs.getString(6);
		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		         LocalDate dateTime = LocalDate.parse(str, formatter);
		         int year1 = dateTime.getYear();
			    	String y1= Integer.toString(year1);

			    	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			         LocalDate dateTime1 = LocalDate.parse(app.getAppointment_date(), formatter);
			         int year = dateTime.getYear();
				    	String y= Integer.toString(year);
			    	


		    	 if(y.equals(y1) )
		    	 {
		    		 String count1=rs.getString(9);
		    		 c1 = Integer.parseInt(count1);
		    		 sum+= c1;
	     
		    	 }
		
	     	}
		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return sum;
	}
	
	public boolean deleteUser(String booking_ref) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		boolean f = false;
		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	         
	         st = cn.prepareStatement("delete from appointment_history where booking_ref= ?");
		     
		     st.setString(1, booking_ref);
		    		    	     
		     int noofrecorddeleted = st.executeUpdate();
		     
		     if(noofrecorddeleted > 0)
		     {
		    	 f = true;
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
		}
		finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	
	public boolean deleteDoctor(String emailid) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		boolean f = false;
		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	                 
	         st = cn.prepareStatement("delete from doctor where email= ?");
		     
		     st.setString(1, emailid);
		    		    	     
		     int noofrecorddeleted = st.executeUpdate();
		     
		     if(noofrecorddeleted > 0)
		     {
		    	 f = true;
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return f;
	}
	
	


public int income_month(AppHistoryModel app)
{
	Connection cn = null;
	int c1 = 0;
	int sum=0;
	PreparedStatement st;
	try {
		cn = DBConnectionByStaticMethod.getMySQLConnection();

		st = cn.prepareStatement("select * from appointment_history");
		
		
     
     ResultSet rs = st.executeQuery();
     while(rs.next()) 
     {
	     
	    	 String str = rs.getString(6);
	         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	         YearMonth dateTime = YearMonth.parse(str, formatter);
	         int month1 = dateTime.getMonthValue();
	         
		    	String m1= Integer.toString(month1);
		    	
		    	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM");
		        YearMonth dateTime1 = YearMonth.parse(app.getAppointment_date(), formatter1);
		    int month = dateTime1.getMonthValue();
		    String m= Integer.toString(month);
		    	


	    	 if(m.equals(m1) )
	    	 {
	    		 String count1=rs.getString(9);
	    		 c1 = Integer.parseInt(count1);
	    		 sum+= c1;
    
	    	 }
	
     	}
	}
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	return sum;
}

	public int income_day(AppHistoryModel app) 
	{
		Connection cn = null;
		int c1 = 0;
		PreparedStatement st;
		try
		{
			cn = DBConnectionByStaticMethod.getMySQLConnection();

			st = cn.prepareStatement("select sum(salary) from appointment_history where appointment_date=?");
			
			DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	         LocalDate dateTime1 = LocalDate.parse(app.getAppointment_date(), formatter1);	   
	    	 String formattedString = dateTime1.format(formatter1);
	    	  st.setString(1, formattedString);
	     
	     ResultSet rs1 = st.executeQuery();
	     while(rs1.next()) 
	     {
	    	 String count1=rs1.getString(1);
	    	   c1 = Integer.parseInt(count1);
	     
	     }
		
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c1;
	}


public int income_diag_month(AppHistoryModel app) 
{
	Connection cn = null;
	int c1 = 0;
	int sum=0;
	PreparedStatement st;
	try 
	{
		cn = DBConnectionByStaticMethod.getMySQLConnection();

		st = cn.prepareStatement("select * from diagnostic_test");
		
		
     
     ResultSet rs = st.executeQuery();
     while(rs.next()) 
     {
    	 System.out.println("U: "+rs.getString(7)+" "+rs.getString(8));
	         if(rs.getString(7).equals("false")) {
	        	 System.out.println("U: "+rs.getString(7)+" "+rs.getString(8));
	    	 String str = rs.getString(8);
	         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	         YearMonth dateTime = YearMonth.parse(str, formatter);
	         int month1 = dateTime.getMonthValue();
	         
		    	String m1= Integer.toString(month1);
		    	
		    	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM");
		        YearMonth dateTime1 = YearMonth.parse(app.getAppointment_date(), formatter1);
		    int month = dateTime1.getMonthValue();	
		    String m= Integer.toString(month);
		    	


	    	 if(m.equals(m1) )
	    	 {
	    		 String count1=rs.getString(6);
	    		 c1 = Integer.parseInt(count1);
	    		 sum+= c1;
    
	    	 }
	
	         }
     }
	
	}
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return sum;
}
	

public int income_diag_year(AppHistoryModel app) 
{
	Connection cn = null;
	int c1 = 0;
	int sum=0;
	PreparedStatement st;
	try 
	{
		cn = DBConnectionByStaticMethod.getMySQLConnection();

		st = cn.prepareStatement("select * from diagnostic_test");
		
		
     
     ResultSet rs = st.executeQuery();
     while(rs.next()) 
     {
	         if(rs.getString(7).equals("false"))
	         {
	        	 String str = rs.getString(8);
		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		         LocalDate dateTime = LocalDate.parse(str, formatter);
		         int year1 = dateTime.getYear();
			    	String y1= Integer.toString(year1);
	         
		    	String y= app.getAppointment_date();
		    	
		    	
		    	


	    	 if(y.equals(y1))
	    	 {
	    		 String count1=rs.getString(6);
	    		 c1 = Integer.parseInt(count1);
	    		 sum+= c1;
     
	    	 }
	
	         }
	
     	}
	}
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	return sum;
}
	


	public int income(AppHistoryModel app) 
	{
		Connection cn = null;
		int c1 = 0;
		PreparedStatement st;
		try 
		{
			cn = DBConnectionByStaticMethod.getMySQLConnection();

			st = cn.prepareStatement("select salary from doctor in(select *  from appointment_history where appointment_date=?)");
			LocalDate localDate = LocalDate.now();//For reference
	    	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    	 String formattedString = localDate.format(formatter);
	     st.setString(1, formattedString);
	     
	     ResultSet rs1 = st.executeQuery();
	     while(rs1.next()) 
	     {
	    	 String count1=rs1.getString(1);
	    	   c1 = Integer.parseInt(count1);
	     }
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return c1;
	}
	

	public String previousBookingCheck(AppHistoryModel app) 
	{
		Connection cn=null;
		PreparedStatement st=null;
		String f="false";
		ResultSet rs=null;
		int c = 0;
		try 
		{
			cn = DBConnectionByStaticMethod.getMySQLConnection();
			c=count(app);
		     
			
	      	         
	         st = cn.prepareStatement("select * from appointment_history where d_email=? and appointment_date= ?");
		     st.setString(1, app.getD_email());
		     st.setString(2, app.getAppointment_date());
		    		    	     
		     rs = st.executeQuery();
		     

		     if(c<3) 
		     {
		      while(rs.next())
		     {
		    	 AppHistoryModel app1 = new AppHistoryModel();
		    	 
		    	app1.setBooking_ref(rs.getString(1));
		    	app1.setP_email(rs.getString(2));
		    	app1.setFirst_name(rs.getString(3));
		    	app1.setLast_name(rs.getString(4));
		    	app1.setD_email(rs.getString(5));
		    	app1.setAppointment_date(rs.getString(6));
		    	app1.setAppointment_reason(rs.getString(7));
		    	app1.setFlag(rs.getString(8));
		    	if(app1.getAppointment_date().equals(app.getAppointment_date())&&app1.getP_email().equals(app.getP_email())) 
		    	{
		    		f="true";
		    	}
		    	else 
		    	{
		    		f="false";
		    	}
		    	
		    	}
		     }
		
		
		else 
		{
			f="Not Available";
		}
	
		}
		     
		     
	    catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		 finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		return f;
	}
	
	public String userLogin2(String email,String password) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		String first_name=null,last_name=null;
		try
		{
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	         
	         st = cn.prepareStatement("select * from patient where email=? and password=?");
		     
		     st.setString(1, email);
		     st.setString(2, password);
		    	     
		     rs = st.executeQuery();
		     
		     if(rs.next())
		     {
		    	 first_name = rs.getString(1);
		    	 last_name=rs.getString(2);
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
	     finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
	    return first_name;
	}
	
	public List<PatientModel> otherDate(String p_email)
	{
		Connection cn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		List<PatientModel> pactlist= new ArrayList<PatientModel>();

		try 
		{
			cn=DBConnectionByStaticMethod.getMySQLConnection();
			st=cn.prepareStatement("select appointment_date from appointment_history where p_email=?");
			st.setString(2, p_email);
			rs=st.executeQuery();
			
			if(rs.next()) 
			{
				PatientModel patobj=new PatientModel();
				patobj.setAppointment_date(rs.getString(6));
				pactlist.add(patobj);
			}
			
		}
		catch(SQLException e)
		{
			System.out.print(e.toString());
		}
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return pactlist;

		
	}
	public List<DoctorModel> fetchAllRecord(String department) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		
		  List<DoctorModel> doctlist= new ArrayList<DoctorModel>();
		 
		
		String sql="select * from doctor ";
		if(department != null && !department.isEmpty())
		{
			sql+="where department=?";
		}
		
		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
	         st=cn.prepareStatement(sql);
	         
	         if(department!= null && !department.isEmpty())
	         {
	        	 st.setString(1, department);
	         }
		     
	      	 	         
			/*
			 * if (department.length()>0) { st =
			 * cn.prepareStatement("select * from doctor where department= ?");
			 * st.setString(1, department); } else { st =
			 * cn.prepareStatement("select * from doctor"); }
			 */
	         rs = st.executeQuery();
		     
		     while(rs.next())
		     {
		    	 DoctorModel dc = new DoctorModel();
		    	 
					/*
					 * docobj.setFirst_name(rs.getString(3));
					 * 
					 * docobj.setLast_name(rs.getString(4)); docobj.setEmail(rs.getString(1));
					 * docobj.setPhone(rs.getString(5)); docobj.setDesignation(rs.getString(6));
					 * docobj.setAddress(rs.getString(7)); docobj.setDate(rs.getString(8));
					 * docobj.setTime(rs.getString(9)); docobj.setZip(rs.getString(10));
					 * docobj.setState(rs.getString(11)); docobj.setDepartment(rs.getString(12));
					 * docobj.setSalary(rs.getString(13)); docobj.setFlag(rs.getString(14));
					 */
		    	 
		    	 dc.setFirst_name(rs.getString(1));
		    	 dc.setLast_name(rs.getString(2));
		    	 dc.setEmail(rs.getString(3));
		    	 dc.setPassword(rs.getString(4));
		    	 dc.setPhone(rs.getString(5));
		    	 dc.setAddress(rs.getString(6));
		    	 dc.setState(rs.getString(7));
		    	 dc.setZip(rs.getString(8));
		    	 dc.setDate(rs.getString(9));
		    	 dc.setTime(rs.getString(10));
		    	 dc.setDesignation(rs.getString(11));
		    	 dc.setSalary(rs.getString(12));
		    	 dc.setDepartment(rs.getString(13));
		    	 dc.setFlag(rs.getString(14));
				//ADDED TO THE ARRAYLIST
				doctlist.add(dc);
				
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
		}
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return doctlist;
	}
	
	public List<FeedbackModel> fetchAllRecordfeedback(String d_email) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<FeedbackModel> feedlist= new ArrayList<FeedbackModel>();
		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	         	         
	         if (d_email.length()>0)
	         {
	            st = cn.prepareStatement("select * from feedback where d_email= ?");
		        st.setString(1, d_email);
	         }
	         
	         rs = st.executeQuery();
		     
		     while(rs.next())
		     {
		    	 FeedbackModel feed = new FeedbackModel();
		    	 
		    	feed.setBooking_ref(rs.getString(1));
		 		
		 		feed.setP_email(rs.getString(2));
		 		feed.setD_email(rs.getString(3));
		 		feed.setMessage(rs.getString(4));
		 		
				
				//ADDED TO THE ARRAYLIST
				feedlist.add(feed);
				
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return feedlist;
	}
	
	
	
	
	public List<AppHistoryModel> fetchAllRecord3(String emailid) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();
		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	         if (emailid!="null")
	         {
	            st = cn.prepareStatement("select * from appointment_history where p_email=? ");
		        st.setString(1, emailid);
	         }
	         
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {
		    	 
		    	
		        	 AppHistoryModel app = new AppHistoryModel();
		    	 
		    	app.setBooking_ref(rs.getString(1));
		 		
		 		app.setP_email(rs.getString(2));
		 		app.setFirst_name(rs.getString(3));
		 		app.setLast_name(rs.getString(4));
		 		app.setD_email(rs.getString(5));
		 		app.setAppointment_date(rs.getString(6));
		 		app.setAppointment_reason(rs.getString(7));
		 		app.setFlag(rs.getString(8));
		 		
				applist.add(app);
				
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
		}
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}

	public List<AppHistoryModel> fetchAllRecord2(String emailid) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();
		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	         	         
	         if (emailid!="null")
	         {
	            st = cn.prepareStatement("select * from appointment_history where p_email=? ");
		        st.setString(1, emailid);
	         }
	         
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {
		    	 
		    	 String str = rs.getString(6);
		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		         LocalDate dateTime = LocalDate.parse(str, formatter);
		    	 if(LocalDate.now().isBefore(dateTime) )
		    	 {
		    	
		    		 AppHistoryModel app = new AppHistoryModel();
		    	 
		    		 app.setBooking_ref(rs.getString(1));
		 		
		    		 app.setP_email(rs.getString(2));
		    		 app.setFirst_name(rs.getString(3));
		    		 app.setLast_name(rs.getString(4));
		    		 app.setD_email(rs.getString(5));
		    		 app.setAppointment_date(rs.getString(6));
		    		 app.setAppointment_reason(rs.getString(7));
		    		 app.setFlag(rs.getString(8));
		 		
		    		 applist.add(app);
				
		     
		     
		    	 }
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}

	
	public List<AppHistoryModel> fetchAllRecordmonth(String appointment_date,String d_email) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();

		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	         if (d_email!="null")
	         {
	            st = cn.prepareStatement("select * from appointment_history where d_email=? ");
		        st.setString(1, d_email);
		        
	         }
	        
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {

		    	 String str = rs.getString(6);
		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		         LocalDate dateTime = LocalDate.parse(str, formatter);
		         int month1 = dateTime.getMonthValue();
			    	String m1= Integer.toString(month1);


			    	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM");
			         YearMonth dateTime1 = YearMonth.parse(appointment_date, formatter1);
		    	 int month = dateTime1.getMonthValue();
		    	String m= Integer.toString(month);


		    	 if(m.equals(m1))
		    	 {
		    	
		    	 AppHistoryModel app = new AppHistoryModel();
		    	 
		    	app.setBooking_ref(rs.getString(1));
		 		
		 		app.setP_email(rs.getString(2));
		 		app.setFirst_name(rs.getString(3));
		 		app.setLast_name(rs.getString(4));
		 		app.setD_email(rs.getString(5));
		 		app.setAppointment_date(rs.getString(6));
		 		app.setAppointment_reason(rs.getString(7));
		 		app.setFlag(rs.getString(8));
		 		
				//ADDED TO THE ARRAYLIST
				applist.add(app);
		    	 
		    	 }
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}
	

	public List<AppHistoryModel> fetchAllRecordyear(String appointment_date,String d_email) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();

		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	         if (d_email!="null")
	         {
	            st = cn.prepareStatement("select * from appointment_history where d_email=? ");
		        st.setString(1, d_email);
		        
	         }
	        
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {

		    	 String str = rs.getString(6);
		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		         LocalDate dateTime = LocalDate.parse(str, formatter);
		         int year1 = dateTime.getYear();
			    	String y1= Integer.toString(year1);


			    	


		    	 if(appointment_date.equals(y1))
		    	 {
		    	
		    	 AppHistoryModel app = new AppHistoryModel();
		    	 
		    	 
		    	app.setBooking_ref(rs.getString(1));
		 		
		 		app.setP_email(rs.getString(2));
		 		app.setFirst_name(rs.getString(3));
		 		app.setLast_name(rs.getString(4));
		 		app.setD_email(rs.getString(5));
		 		app.setAppointment_date(rs.getString(6));
		 		app.setAppointment_reason(rs.getString(7));
		 		app.setFlag(rs.getString(8));
		 		
				//ADDED TO THE ARRAYLIST
				applist.add(app);
		    	 
		    	 }
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public List<AppHistoryModel> fetchAllRecorddate(String appointment_date,String d_email) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();

		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	         if (d_email!="null")
	         {
	            st = cn.prepareStatement("select * from appointment_history where d_email=? ");
		        st.setString(1, d_email);
		        
	         }
	        
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {

					/*
					 * String str = rs.getString(6); DateTimeFormatter formatter =
					 * DateTimeFormatter.ofPattern("yyyy-MM-dd"); LocalDate dateTime =
					 * LocalDate.parse(str, formatter);
					 * 
					 * DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					 * LocalDate dateTime1 = LocalDate.parse(appointment_date, formatter1);
					 */
		    	 String str = rs.getString(6);
		    	 
		    	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		    	 LocalDate localdate = LocalDate.parse(str,formatter);
		    	 String formatteddate = localdate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


		    	 if(formatter.equals(formatteddate) )
		    	 {
		    	
		    	 AppHistoryModel app = new AppHistoryModel();
		    	 
		    	app.setBooking_ref(rs.getString(1));
		 		
		 		app.setP_email(rs.getString(2));
		 		app.setFirst_name(rs.getString(3));
		 		app.setLast_name(rs.getString(4));
		 		app.setD_email(rs.getString(5));
		 		app.setAppointment_date(rs.getString(6));
		 		app.setAppointment_reason(rs.getString(7));
		 		app.setFlag(rs.getString(8));
		 		app.setSalary(rs.getString(9));

		 		
				applist.add(app);
		
		    	 }
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}
	
	public List<AppHistoryModel> fetchAllRecordtoday(AppHistoryModel app) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();

		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	        
	            st = cn.prepareStatement("select * from appointment_history");
		        

	        
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {

		    	 String str = rs.getString(6);
		    	 DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		         LocalDate dateTime1 = LocalDate.parse(app.getAppointment_date(), formatter1);	   
		    	 String formattedString = dateTime1.format(formatter1);
		    	

		    	 if(formattedString.equals(str) )
		    	 {
		    	
		    	 
		    	app.setBooking_ref(rs.getString(1));
		 		
		 		app.setP_email(rs.getString(2));
		 		app.setFirst_name(rs.getString(3));
		 		app.setLast_name(rs.getString(4));
		 		app.setD_email(rs.getString(5));
		 		app.setAppointment_date(rs.getString(6));
		 		app.setAppointment_reason(rs.getString(7));
		 		app.setFlag(rs.getString(8));
		 		
				applist.add(app);
		    
		    	 }
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}
	
	
	public List<AppHistoryModel> fetchAllRecordtoday2() 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();
		AppHistoryModel app=new AppHistoryModel();
		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	        
	            st = cn.prepareStatement("select * from appointment_history");
		        

	        
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {
		    	 LocalDate localDate = LocalDate.now();
		    	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		    	 String formattedString = localDate.format(formatter);
		    	

		    	 if(formattedString.equals(rs.getString(6)) )
		    	 {
		    	
		    		 app.setBooking_ref(rs.getString(1));
		 		
		    		 app.setP_email(rs.getString(2));
		    		 app.setFirst_name(rs.getString(3));
		    		 app.setLast_name(rs.getString(4));
		    		 app.setD_email(rs.getString(5));
		    		 app.setAppointment_date(rs.getString(6));
		    		 app.setAppointment_reason(rs.getString(7));
		    		 app.setFlag(rs.getString(8));
		 		
				applist.add(app);
		    
		    	 }
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}
	
	public List<AppHistoryModel> fetchAllRecordtestassign(String d_email) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<AppHistoryModel> applist= new ArrayList<AppHistoryModel>();

		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	         if (d_email!="null")
	         {
	            st = cn.prepareStatement("select * from appointment_history where d_email=? ");
		        st.setString(1, d_email);
		        
	         }
	        
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {

		    	 String str = rs.getString(6);
		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		         LocalDate dateTime = LocalDate.parse(str, formatter);

		         


		    	 if(dateTime.isBefore(LocalDate.now()) )
		    	 {
		    	
		    		 AppHistoryModel app = new AppHistoryModel();
		    		 
		    		 app.setBooking_ref(rs.getString(1));
			 		
			 		app.setP_email(rs.getString(2));
			 		app.setFirst_name(rs.getString(3));
			 		app.setLast_name(rs.getString(4));
			 		app.setD_email(rs.getString(5));
			 		app.setAppointment_date(rs.getString(6));
			 		app.setAppointment_reason(rs.getString(7));
			 		app.setFlag(rs.getString(8));
		 		
				applist.add(app);
		    	
		    	 }
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
		 }
		
	    return applist;
	}
	
	
	public List<DiagnosticTestModel> fetchAllRecordtest(String p_email) 
	{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		List<DiagnosticTestModel> diaglist= new ArrayList<DiagnosticTestModel>();

		try
		{
			
	         cn = DBConnectionByStaticMethod.getMySQLConnection();
		     
	      	 	         
	         if (p_email!="null")
	         {
	            st = cn.prepareStatement("select * from diagnostic_test where p_email=? ");
		        st.setString(1, p_email);
		        
	         }
	        
	         
	         rs = st.executeQuery();	 
	        
		     while(rs.next())
		     {

		    	 DiagnosticTestModel diag = new DiagnosticTestModel();
		    	 
		     		
			 		diag.setBooking_ref(rs.getString(1));
			 		diag.setP_email(rs.getString(2));
			 		diag.setD_email(rs.getString(3));
			 		diag.setTest_name(rs.getString(4));
			 		diag.setTest_price(rs.getString(5));
					/* diag.setFlag(rs.getString(7)); */
		 		
				diaglist.add(diag);
		    	 
		     
		     
		     }
	    }catch(SQLException e)
		{
	    	System.out.print(e.toString());
	    }
		finally 
	     {
		     DBConnectionByStaticMethod.closeMySQLResulsetConnection(rs);
	    	 DBConnectionByStaticMethod.closeMySQLPreaparedStatementConnection(st);
	    	 DBConnectionByStaticMethod.closeMySQLConnection(cn);
			
	     
	     }
		
	    return diaglist;
	}

}
