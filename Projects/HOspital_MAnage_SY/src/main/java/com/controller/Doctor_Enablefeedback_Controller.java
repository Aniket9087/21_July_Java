package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;

public class Doctor_Enablefeedback_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Doctor_Enablefeedback_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 HttpSession session = request.getSession(true);
			String booking_ref = request.getParameter("booking_ref");
		       String email=(String)session.getAttribute("email");

	   	    CustomerDao cdaoobj = new CustomerDao();
	   	    
	  	   boolean replyfromdao=cdaoobj.docFeedbackEnable(booking_ref);
	 		
		      //CALL DAO METHOD
		    String nextviewpage="";
		    String reply="Feedback enabled for reference number:"+booking_ref;
		    if(replyfromdao)
		    {
		    	request.setAttribute("servermsg",reply );
		    	nextviewpage ="doctor_futuremonth.jsp";
		    }
		    else
		    {
		    	request.setAttribute("servermsg", "NO RECORDS FOUND");
		    	nextviewpage ="doctor_futuremonth.jsp";
		    }
		          
		    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
	   	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
