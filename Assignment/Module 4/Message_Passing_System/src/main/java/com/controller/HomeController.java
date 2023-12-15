package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.HomeDao;
import com.model.Usermodel;

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
		if(action.equals("showuser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			System.out.println("Home id is..."+uid);
			Usermodel model=new HomeDao().verifylogin(uid);
			request.setAttribute("model", model);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
		else if(action.equals("showuser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			Usermodel model=new HomeDao().verifylogin(uid);
			request.setAttribute("hmodel", model);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
		else if(action.equals("edituser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			Usermodel model=new HomeDao().verifylogin(uid);
			request.setAttribute("hmodel", model);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
		else if(action.equals("deleteuser"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			int x=new HomeDao().deleteuser(uid);
			request.setAttribute("msg", "Record Deleted Try Again.....");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Usermodel hmodel=new Usermodel();
		hmodel.setUid(Integer.parseInt(request.getParameter("uid")));
		hmodel.setFname(request.getParameter("fname"));
		hmodel.setLname(request.getParameter("lname"));
		hmodel.setEmail(request.getParameter("email"));
		hmodel.setMobile(request.getParameter("mobile"));
		hmodel.setPassword(request.getParameter("password"));
		
		int x=new HomeDao().updateuser(hmodel);
		
		if(x>0)
		{
			response.sendRedirect("HomeController?action=showuser&uid"+hmodel.getUid());
		}
	}

}
