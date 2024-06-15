package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.DoctorModel;

public class Doctor_Register_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Doctor_Register_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 DoctorModel doc = new DoctorModel();
			
			doc.setEmail(request.getParameter("email"));
			doc.setPassword(request.getParameter("password"));
			doc.setFirst_name(request.getParameter("first_name"));
			doc.setLast_name(request.getParameter("last_name"));
			doc.setPhone(request.getParameter("phone"));
			doc.setDesignation(request.getParameter("designation"));
			doc.setAddress(request.getParameter("address"));
			doc.setDate(request.getParameter("date"));
			doc.setTime(request.getParameter("time"));
			doc.setZip(request.getParameter("zip"));
			doc.setState(request.getParameter("state"));
			doc.setDepartment(request.getParameter("department"));
			doc.setSalary(request.getParameter("salary"));

			
			
		
			CustomerDao cdaoobj = new CustomerDao();
			
			boolean replyfromdao = cdaoobj.userRegistration(doc);
			
			String msg="";
			String nextpage="";
			if(replyfromdao)
			{
				msg ="Please wait for the Administrator to authenticate you email address!";
				nextpage="doctorlogin.jsp";
			}
			else
		    {
				msg ="Oops! Something went wrong!";
				nextpage="doctorregister.jsp";
		    }
			
			request.setAttribute("errormsg", msg);
			RequestDispatcher rd = request.getRequestDispatcher(nextpage);
			rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
