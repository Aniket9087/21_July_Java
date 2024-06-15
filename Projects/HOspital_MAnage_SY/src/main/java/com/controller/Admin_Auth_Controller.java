package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;

public class Admin_Auth_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin_Auth_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String d_email = request.getParameter("d_email");
	      
	    CustomerDao cdaoobj = new CustomerDao();
	    
	      		
	   boolean replyfromdao = cdaoobj.docEnable(d_email);
	    String nextviewpage="";
	    String msg="Doctor enabled for email id:" +d_email;
	    if( replyfromdao)
	    {
	    	request.setAttribute("servermsg", msg);
	    	nextviewpage ="admin_auth_doctor.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "Oops! Something went wrong");
	    	nextviewpage ="admin_auth_doctor.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
