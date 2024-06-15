package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.FeedbackModel;

public class Patient_FeedbackForm_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_FeedbackForm_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		FeedbackModel feed=new FeedbackModel();
		String booking_ref=request.getParameter("booking_ref");
			feed.setBooking_ref(request.getParameter("booking_ref"));
			
			feed.setD_email(request.getParameter("d_email"));
			feed.setP_email(request.getParameter("p_email"));
			feed.setMessage(request.getParameter("message"));
			feed.setFlag("true");

			
	 	   CustomerDao cdaoobj=new CustomerDao();
	 	   boolean replyfromdao=cdaoobj.patFeedback(feed);
	 	   String msg="";
	 	   
	 	   
	 	   if(replyfromdao) {
	 		   msg="Feedback Submitted for Reference number: "+booking_ref;
	 	   }
	 	   else {
	 		   msg="Feedback Already been submitted!";
	 	   }
	 	  
	 	   request.setAttribute("servermsg", msg);
	 	   RequestDispatcher rd=request.getRequestDispatcher("/patient_feedback.jsp");
	 	   rd.forward(request, response);
	 	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	

	}

}
