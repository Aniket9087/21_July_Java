package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HomeDao;
import com.model.UserModel;

@WebServlet("/HomeController.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("showuser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			System.out.println("Home id is..."+id);
			UserModel model=new HomeDao().veryfilogin(id);
			request.setAttribute("model", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equals("showuser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			UserModel model=new HomeDao().veryfilogin(id);
			request.setAttribute("hmodel", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equals("edituser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			UserModel model=new HomeDao().veryfilogin(id);
			request.setAttribute("hmodel", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equals("deleteuser"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			int x=new HomeDao().deleteuser(id);
			request.setAttribute("msg", "Record Deleted Try Again...");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel hmodel=new UserModel();
		hmodel.setId(Integer.parseInt(request.getParameter("id")));
		hmodel.setFname(request.getParameter("fname"));
		hmodel.setLname(request.getParameter("lname"));
		hmodel.setEmail(request.getParameter("email"));
		hmodel.setMobile(request.getParameter("mobile"));
		hmodel.setGender(request.getParameter("gender"));
		hmodel.setPassword(request.getParameter("password"));
		
		
		int x=new HomeDao().updateuser(hmodel);
		if(x>0)
		{
			response.sendRedirect("HomeController.do?action=showuser&id="+hmodel.getId());
		}
	}

}
