package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.DiagnosticTestModel;

public class Patient_testForm_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_testForm_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		DiagnosticTestModel diag=new DiagnosticTestModel();
	       
		diag.setTest_id(request.getParameter("test_id"));
		diag.setBooking_ref(request.getParameter("booking_ref"));
		diag.setP_email(request.getParameter("p_email"));
		diag.setD_email(request.getParameter("d_email"));
		diag.setTest_name(request.getParameter("test_name"));
		diag.setTest_name(request.getParameter("test_price"));
		
		diag.setTest_date(request.getParameter("test_date"));
		diag.setFlag(request.getParameter("flag"));

		System.out.println("U Entere"+diag.getTest_date()+""+diag.getTest_id()+""+diag.getFlag());

 	   CustomerDao cdaoobj=new CustomerDao();
 	   String reply=cdaoobj.patTest(diag);
 	   String msg="";
 	 
 	   if(reply=="true") {
 		   msg="Thank You for the payment against Test Id: "+diag.getTest_id();
 	   }
 	   else if(reply=="The Bill is being already generated"){
 	 	   String reply1=cdaoobj.patAlreadyBookedTest(diag);
 	 	   msg="The Bill is being already generated on "+reply1;
 	   }
 	   else {
 		   msg="Oops! Something went wrong";
 	   }
 	   
 	   request.setAttribute("servermsg", msg);
 	   RequestDispatcher rd=request.getRequestDispatcher("/patient_test.jsp");
 	   rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
