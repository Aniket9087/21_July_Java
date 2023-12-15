package com.assignments;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentInformation")
public class StudentInformation extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public StudentInformation() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fname=request.getParameter("fname");
		
		String lname=request.getParameter("lname");
		
		String mobile=request.getParameter("mobile");
		
		String gender=request.getParameter("gender");
		
		String password=request.getParameter("password");
		
		
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
		System.out.println("Mobile: "+mobile);
		System.out.println("Gender: "+gender);
		System.out.println("Password: "+password);
	}

}
