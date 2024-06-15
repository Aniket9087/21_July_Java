package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.AppHistoryModel;

public class Admin_TodayApp_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin_TodayApp_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		CustomerDao cdaoobj = new CustomerDao();
 	    List<AppHistoryModel> applist = cdaoobj.fetchAllRecordtoday2();
	    String nextviewpage="";
	    
	    if(applist.size() > 0)
	    {
	    	request.setAttribute("custinformationlist", applist);
	    	nextviewpage ="admin_today_app.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "NO RECORDS FOUND");
	    	nextviewpage ="admin_today_app.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
 	rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
