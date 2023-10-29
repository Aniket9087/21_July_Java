package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.model.user;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		user lmodel=new user();
		lmodel.setEmail(request.getParameter("email"));
		lmodel.setPassword(request.getParameter("password"));
		
		user model=new LoginDao().getlogin(lmodel);
		
		if(model != null)
		{
			HttpSession session=request.getSession(true);
			request.setAttribute("msg", "Login Successfully....");
			request.getRequestDispatcher("Main.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Invalid Email or Password....");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}
