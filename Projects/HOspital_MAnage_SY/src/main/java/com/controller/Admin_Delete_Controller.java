package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;

public class Admin_Delete_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin_Delete_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String d_email = request.getParameter("d_email");
	      
	    CustomerDao cdaoobj = new CustomerDao();
	    
	      		
	    boolean replyfromdao=cdaoobj.deleteDoctor(d_email);
	    String msg="";
	    if(replyfromdao) 
	    {
	        msg="The Doctor Account for email: "+d_email+" has been deleted!";
	    }
	    else 
	    {
	    	msg="Oops! Something went wrong.";
	    }
	  
	  
	   request.setAttribute("servermsg", msg);
	   RequestDispatcher rd=request.getRequestDispatcher("/admin_welcome.jsp");
	   rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
