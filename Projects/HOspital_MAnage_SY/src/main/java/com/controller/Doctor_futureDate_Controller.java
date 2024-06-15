package com.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.model.AppHistoryModel;

public class Doctor_futureDate_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Doctor_futureDate_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		String appointment_date = request.getParameter("appointment_date");
	       String email=(String)session.getAttribute("email");
	       
	       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	       LocalDate localDate = LocalDate.parse(appointment_date, formatter);
	       String formattedDate = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

   	    CustomerDao cdao = new CustomerDao();
   	    
	      		
   	    List<AppHistoryModel> applist = cdao.fetchAllRecorddate(formattedDate,email);
	    String nextviewpage="";
	    
	    if(applist.size() > 0)
	    {
	    	request.setAttribute("custinformationlist", applist);
	    	nextviewpage ="doctor_futuredate.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "NO RECORDS FOUND");
	    	nextviewpage ="doctor_futuredate.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
   	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
