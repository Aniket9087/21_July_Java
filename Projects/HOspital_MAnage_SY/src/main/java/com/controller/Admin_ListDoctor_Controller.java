package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.DoctorModel;

public class Admin_ListDoctor_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin_ListDoctor_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String department = request.getParameter("department");
	      
	    CustomerDao cdaoobj = new CustomerDao();
	    
	      		
	    List<DoctorModel> doctlist = cdaoobj.fetchAllRecord(department);
	    String nextviewpage="";
	    
	    if(doctlist.size() > 0)
	    {
	    	request.setAttribute("custinformationlist", doctlist);
	    	nextviewpage ="admin_list_doctor.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "NO RECORDS FOUND");
	    	nextviewpage ="admin_list_doctor.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
