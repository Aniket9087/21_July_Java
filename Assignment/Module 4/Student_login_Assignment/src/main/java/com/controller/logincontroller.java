package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.loginDao;
import com.model.usermodel;

@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		usermodel lmodel=new usermodel();
		lmodel.setUsername(request.getParameter("username"));
		lmodel.setPassword(request.getParameter("password"));
		
		usermodel model=new loginDao().getLogin(lmodel);
		if(model!=null)
		{
			HttpSession ses=request.getSession();
			ses.setAttribute("model", model);
			System.out.println("Login Id UserId :"+model.getUserid());
			response.sendRedirect("HomeController?action=showuser&userid="+model.getUserid());
		}
	}

}
