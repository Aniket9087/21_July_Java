package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;

public class Patient_Login_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_Login_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String email = request.getParameter("email");
        String password = request.getParameter("password");
      
      	CustomerDao cdaoobj = new CustomerDao();
      		
       String first_name = cdaoobj.userLogin2(email, password);
        
       if(first_name!= null)
       {
    	   HttpSession session = request.getSession(true);
    	   session.setAttribute("first_name",first_name);
    	   session.setAttribute("email", email);
    	   
           response.sendRedirect("patient_welcome.jsp");
        }
        else
        {
        	request.setAttribute("errormsg", "INVALID USERID OR PASSWORD");
        	RequestDispatcher rd = request.getRequestDispatcher("/patientlogin.jsp");
        	rd.forward(request, response);
        }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
