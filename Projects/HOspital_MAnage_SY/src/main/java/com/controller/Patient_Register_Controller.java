package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.PatientModel;

public class Patient_Register_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_Register_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PatientModel pat = new PatientModel();
		
		pat.setEmail(request.getParameter("email"));
		pat.setPassword(request.getParameter("password"));
		pat.setFirst_name(request.getParameter("first_name"));
		pat.setLast_name(request.getParameter("last_name"));
		pat.setPhone(request.getParameter("phone"));
		pat.setAddress(request.getParameter("address"));
		pat.setZip(request.getParameter("zip"));
		pat.setState(request.getParameter("state"));

		
		
	
		CustomerDao cdaoobj = new CustomerDao();
		
		boolean replyfromdao = cdaoobj.userRegistration2(pat);
		
		String msg="";
		if(replyfromdao)
		{
			msg ="Please Login";
		}
		else
	    {
			msg ="Opps! Something went wrong. Please try after few moment";
	    }
		
		request.setAttribute("displaymsg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("after_patientlogin.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
