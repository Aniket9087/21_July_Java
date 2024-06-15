package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;

public class Patient_Cancel_Form_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_Cancel_Form_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String booking_ref = request.getParameter("booking_ref");
	      
 	 CustomerDao cdaoobj = new CustomerDao();
	      		
	     boolean replyfromdao = cdaoobj.deleteUser(booking_ref);
	     String msg ="";
	        
	       if(replyfromdao)
	       {
	    	  msg ="Appointment Cancelled for booking reference: "+booking_ref;
	        }
	        else
	        {
	        	msg ="Oops! Something went wrong.";
	        	
	        }
	      
	       request.setAttribute("servermsg", msg);
	       RequestDispatcher rd = request.getRequestDispatcher("/patient_cancel.jsp");
 	   rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
