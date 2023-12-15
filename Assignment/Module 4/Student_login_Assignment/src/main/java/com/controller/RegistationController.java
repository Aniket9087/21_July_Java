package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.usermodel;

/**
 * Servlet implementation class RegistationController
 */
@WebServlet("/RegistationController")
public class RegistationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegistationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		usermodel rmodel=new usermodel();
		rmodel.setFirstname(request.getParameter("firstname"));
		rmodel.setLastname(request.getParameter("lastname"));
		rmodel.setUsername(request.getParameter("username"));
		rmodel.setPassword(request.getParameter("password"));
		
		String msg=new com.dao.RegistrationDao().doRegister(rmodel);
		if(!msg.equals("error"))
		{
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "Record not inserted");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
			
		}
			
	}

}
