package com.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.DiagnosticTestModel;

public class Doctor_test_form_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Doctor_test_form_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		DiagnosticTestModel diagobj=new DiagnosticTestModel();
		Random r=new Random();
        int rand_int1 =r.nextInt(90000);
        String rand=Integer.toString(rand_int1);
        diagobj.setTest_id(rand);
        String booking_ref=request.getParameter("booking_ref");
		diagobj.setBooking_ref(booking_ref);
		diagobj.setP_email(request.getParameter("p_email"));
		diagobj.setD_email(request.getParameter("d_email"));
		diagobj.setTest_name(request.getParameter("test_name"));
		diagobj.setTest_price(request.getParameter("test_price"));
		diagobj.setFlag("true");
 	   CustomerDao cdaoobj=new CustomerDao();
 	   boolean reply=cdaoobj.docTestAssign(diagobj);
 	   String msg="";
 	 
 	   if(reply) {
 		   msg="A diagnostic test is assigned for Booking Reference: "+booking_ref+" with Test Id: "+rand;
 	   }
 	   else {
 		   msg="Oops! Something went wrong!";
 	   }
 	   
 	   request.setAttribute("servermsg", msg);
 	   RequestDispatcher rd=request.getRequestDispatcher("/doctor_test.jsp");
 	   rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
