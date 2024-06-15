package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.model.DoctorModel;

public class Doctor_Update_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Doctor_Update_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String last_name = request.getParameter("last_name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String salary = request.getParameter("salary");
		

		HttpSession session = request.getSession(true);
	       String email=(String)session.getAttribute("email");
	      
     	 CustomerDao cdaoobj = new CustomerDao();
	      DoctorModel docobj=new DoctorModel();
	      docobj.setLast_name(last_name);
	      docobj.setPhone(phone);
	      docobj.setAddress(address);
	      docobj.setSalary(salary);
	      docobj.setEmail(email);
    	   boolean replyfromdao=cdaoobj.docUpdate(docobj);
	    String nextviewpage="";
	    String reply="Information successfully stored for"+" "+email;
	    if(replyfromdao)
	    {
	    	request.setAttribute("servermsg", reply);
	    	nextviewpage ="doctor_update.jsp";
	    }
	    else
	    {
	    	request.setAttribute("servermsg", "Oops! Something went wrong.");
	    	nextviewpage ="doctor_update.jsp";
	    }
	          
	    RequestDispatcher rd = request.getRequestDispatcher(nextviewpage);
     	rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
