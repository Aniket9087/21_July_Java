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

public class Doctor_futureMonth_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Doctor_futureMonth_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		String appointment_date = request.getParameter("appointment_date");
	       String email=(String)session.getAttribute("email");

   	    CustomerDao cdaoobj = new CustomerDao();
   	    
	      		
   	    List<AppHistoryModel> applist = cdaoobj.fetchAllRecordmonth(appointment_date,email);
	    String nextviewpage="";
	    
	    if(applist.size() > 0)
	    {
	    	request.setAttribute("custinformationlist", applist);
	    	nextviewpage ="doctor_futuremonth.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "NO RECORDS FOUND");
	    	nextviewpage ="doctor_futuremonth.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
   	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
