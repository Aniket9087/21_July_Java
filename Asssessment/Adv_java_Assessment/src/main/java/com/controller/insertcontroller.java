package com.controller;

import java.io.IOException;

import javax.lang.model.element.ModuleElement.UsesDirective;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.insertdao;
import com.model.user;

@WebServlet("/insertcontroller")
public class insertcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public insertcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		user u=new user();
		u.setFirstname(request.getParameter("firstname"));
		u.setLastname(request.getParameter("lastname"));
		u.setEmail(request.getParameter("email"));
		u.setMobile(request.getParameter("mobile"));
		u.setAddress(request.getParameter("address"));
		u.setGender(request.getParameter("gender"));
		u.setPassword(request.getParameter("password"));
		u.setCpassword(request.getParameter("cpassword"));
		
		int x=new insertdao().dinsert(u);
		
		
		if(x>0)
		{
			request.setAttribute("msg", "Record Inserted...");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Record Not Inserted...");
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
		}
	}

}
