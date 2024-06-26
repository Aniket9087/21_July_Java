package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.model.PatientModel;



public class Patient_Update_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_Update_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String last_name = request.getParameter("last_name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String state = request.getParameter("state");

		

		HttpSession session = request.getSession(true);
	       String email=(String)session.getAttribute("email");
	      
	      //CREATE OBJECT OF DAO CLASS
     	 CustomerDao cdaoobj = new CustomerDao();
	      PatientModel pat=new PatientModel();
	      pat.setLast_name(last_name);
	      pat.setPhone(phone);
	      pat.setAddress(address);
	      pat.setEmail(email);
	      pat.setState(state);
	      //CALL DAO METHOD
    	   boolean replyfromdao=cdaoobj.patUpdate(pat);
	    String nextviewpage="";
	    String reply="Information successfully stored for"+email;
	    if(replyfromdao)
	    {
	    	request.setAttribute("servermsg", reply);
	    	nextviewpage ="patient_update.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "Oops! Something went wrong.");
	    	nextviewpage ="patient_update.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
     	rd.forward(request, response);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
