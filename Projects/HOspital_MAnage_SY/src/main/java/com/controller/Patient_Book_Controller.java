package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.AppHistoryModel;



public class Patient_Book_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Patient_Book_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AppHistoryModel app=new AppHistoryModel();
		PrintWriter out = response.getWriter();
		Random r=new Random();
        int rand_int1 =r.nextInt(90000);
        String rand=Integer.toString(rand_int1);
        app.setBooking_ref(rand);
        
		app.setP_email(request.getParameter("p_email"));
		app.setFirst_name(request.getParameter("first_name"));
		app.setLast_name(request.getParameter("last_name"));
		app.setD_email(request.getParameter("d_email"));
		app.setAppointment_date(request.getParameter("appointment_date"));
		app.setAppointment_reason(request.getParameter("appointment_reason"));
		app.setSalary(request.getParameter("salary"));
		app.setFlag("true");
		out.println("Enterd values:"+app.getP_email()+""+app.getAppointment_date());
 	   CustomerDao cdaoobj=new CustomerDao();
 	   String reply=cdaoobj.previousBookingCheck(app);
 	   if(reply=="false") {
 	   boolean replyfromdao=cdaoobj.patBooking(app);
 	   String msg="";
 	   
 	   
 	   if(replyfromdao) {
 		   msg="The doctor has been booked!";
 	   }
 	   else {
 		   msg="Oops! Something went wrong!";
 	   }
 	   
 	   request.setAttribute("servermsg", msg);
 	   RequestDispatcher rd=request.getRequestDispatcher("/patient_appointment.jsp");
 	   rd.forward(request, response);
 	   }
	
 	   else if(reply=="Not Available") {
 		  request.setAttribute("servermsg", "Maximum number of patient reached for the day! Try for other date");
		   RequestDispatcher rd=request.getRequestDispatcher("/patient_appointment.jsp");
		   rd.forward(request, response);
 	   }
 	   else {
 		   request.setAttribute("servermsg", "Already booked!");
 		   RequestDispatcher rd=request.getRequestDispatcher("/patient_appointment.jsp");
 		   rd.forward(request, response);
 	   }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
