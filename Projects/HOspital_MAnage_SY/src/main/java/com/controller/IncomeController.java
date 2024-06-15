package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.AppHistoryModel;

public class IncomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IncomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AppHistoryModel app=new AppHistoryModel();
		app	.setAppointment_date(request.getParameter("appointment_date"));	
		System.out.println("U enter:"+request.getParameter("appointment_date"));
	 	   CustomerDao cdaoobj=new CustomerDao();
	 	   int replyfromdao=cdaoobj.income_day(app);
	 	   String msg="";
	 	  
	 	 Integer intInstance = new Integer(replyfromdao);      
	 	 String number = intInstance.toString();
	 	  
	 	   request.setAttribute("servermsg", number);
	 	   RequestDispatcher rd=request.getRequestDispatcher("/income.jsp");
	 	   rd.forward(request, response);
	 	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
