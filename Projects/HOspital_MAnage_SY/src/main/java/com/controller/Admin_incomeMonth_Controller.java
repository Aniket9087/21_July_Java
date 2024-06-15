package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.AppHistoryModel;

public class Admin_incomeMonth_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin_incomeMonth_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 CustomerDao cdaoobj = new CustomerDao();
	 	    AppHistoryModel appobj=new AppHistoryModel();
			String appointment_date = request.getParameter("appointment_date");
			appobj.setAppointment_date(appointment_date);

			appobj.setAppointment_date(request.getParameter("appointment_date"));	
			System.out.println("U enter:"+request.getParameter("appointment_date"));
		 	   int replyfromdao=cdaoobj.income_month(appobj);
		 	   String msg="";
		 	  
		 	 Integer intInstance = new Integer(replyfromdao);      
		 	 String number = intInstance.toString();
		 	  
		 	   request.setAttribute("servermsg", number);
		 	   RequestDispatcher rd=request.getRequestDispatcher("/admin_income_month.jsp");
		 	   rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
