package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Admin_Login_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin_Login_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        System.out.println("U entered:"+username+" "+password);
	        
	       if(username.equals("admin")&&password.equals("admin")) {
	     
	    	   HttpSession session = request.getSession(true);
	    	   session.setAttribute("username", username);
	    	   
	           response.sendRedirect("admin_welcome.jsp");
	        }
	        else
	        {
	        	request.setAttribute("errormsg", "INVALID USERID OR PASSWORD");
	        	RequestDispatcher rd = request.getRequestDispatcher("/Adminlogin.jsp");
	        	rd.forward(request, response);
	        }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
