package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.homedao;
import com.model.usermodel;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("showuser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			System.out.println(userid);
			usermodel model=new homedao().getLogin(userid);
			request.setAttribute("model", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		usermodel hmodel=new usermodel();
		hmodel.setUserid(Integer.parseInt(request.getParameter("userid")));
		hmodel.setFirstname(request.getParameter("firstname"));
		hmodel.setLastname(request.getParameter("lastname"));
		hmodel.setUsername(request.getParameter("username"));
		hmodel.setPassword(request.getParameter("password"));
		
	}

}
