package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Hbdao;
import com.model.Usermodel;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterController() {
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
		rmodel.setUsername(request.getParameter("username"));
		rmodel.setPassword(request.getParameter("password"));
		
		int x=new Hbdao().doregister(rmodel);
		
		if(x>0)
		{
			request.setAttribute("msg", "Record Inserted...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Record Not Inserted...");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

}
