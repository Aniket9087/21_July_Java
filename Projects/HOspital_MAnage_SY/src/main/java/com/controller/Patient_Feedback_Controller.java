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
import com.model.AppHistoryModel;

public class Patient_Feedback_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_Feedback_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 HttpSession session = request.getSession(true);
	       String email=(String)session.getAttribute("email");
	       

	   	    CustomerDao cdao = new CustomerDao();
	   	    
		      		
	   	    List<AppHistoryModel> applist = cdao.fetchAllRecord3(email);
		    String nextviewpage="";
		    
		    if(applist.size() > 0)
		    {
		    	request.setAttribute("custinformationlist", applist);
		    	nextviewpage ="patient_feedback.jsp";
		    }
		    else
		    {
		    	request.setAttribute("servermsg", "NO RECORDS FOUND");
		    	nextviewpage ="patient_feedback.jsp";
		    }
		    
		    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
	   	rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
