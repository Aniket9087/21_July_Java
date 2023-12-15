package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.RegisterDao;
import com.model.Usermodel;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Usermodel rmodel=new Usermodel();
		rmodel.setFname(request.getParameter("fname"));
		rmodel.setLname(request.getParameter("lname"));
		rmodel.setEmail(request.getParameter("email"));
		rmodel.setMobile(request.getParameter("mobile"));
		rmodel.setPassword(request.getParameter("password"));
		
		int x=new RegisterDao().doRegister(rmodel);
		
		if(x>0)
		{
			request.setAttribute("msg", "Record Inserted...");
			request.getRequestDispatcher("login.jsp");
		}
		else
		{
			request.setAttribute("msg", "Record Not Inserted...");
			request.getRequestDispatcher("register.jsp");
		}
	}

}
