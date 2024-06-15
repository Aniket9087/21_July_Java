package com.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.PatientContactModel;

public class Patient_Contact_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_Contact_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PatientContactModel patconobj=new PatientContactModel();
		Random r=new Random();
	    int rand_int1 =r.nextInt(90000);
	    String rand=Integer.toString(rand_int1);
	    patconobj.setReference_no(rand);
			patconobj.setFirst_name(request.getParameter("first_name"));
			
			patconobj.setP_email(request.getParameter("p_email"));
			patconobj.setMessage(request.getParameter("message"));

			
	 	   CustomerDao cdaoobj=new CustomerDao();
	 	   boolean replyfromdao=cdaoobj.patContact(patconobj);
	 	   String msg="";
	 	   
	 	   
	 	   if(replyfromdao) {
	 		   msg="We will get back to you withing 5-6 business days! Reference number: "+rand;
	 	   }
	 	   else {
	 		   msg="Oops! Something went wrong.";
	 	   }
	 	  
	 	   request.setAttribute("servermsg", msg);
	 	   RequestDispatcher rd=request.getRequestDispatcher("/patient_contact.jsp");
	 	   rd.forward(request, response);
	 	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
