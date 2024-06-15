package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.model.FeedbackModel;

public class Doctor_Feedback_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Doctor_Feedback_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

   	 HttpSession session = request.getSession(true);
	       String email=(String)session.getAttribute("email");

	    CustomerDao cdaoobj = new CustomerDao();
	    
	      		
	    List<FeedbackModel> feedlist = cdaoobj.fetchAllRecordfeedback(email);
	    String nextviewpage="";
	    
	    if(feedlist.size() > 0)
	    {
	    	request.setAttribute("custinformationlist", feedlist);
	    	nextviewpage ="doctor_feedback.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "NO FEEDBACK FOUND");
	    	nextviewpage ="doctor_feedback.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
