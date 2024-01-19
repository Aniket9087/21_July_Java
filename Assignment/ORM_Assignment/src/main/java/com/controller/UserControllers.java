package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.usermodel;

/**
 * Servlet implementation class UserControllers
 */
public class UserControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		UserDao userDao=new UserDao();
		if(action.equalsIgnoreCase("register"))
		{
			usermodel user=new usermodel();
			user.setFirstname(request.getParameter("fname"));
			user.setLastname(request.getParameter("lname"));
			user.setEmail(request.getParameter("email"));
			user.setMobile(request.getParameter("mobile"));
			user.setPassword(request.getParameter("password"));
			user.setGender(request.getParameter("gender"));
			
			userDao.insert(user);
			response.sendRedirect("login.jsp");			
		}
		else if(action.equalsIgnoreCase("Login"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			usermodel user=userDao.getLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
			
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			usermodel user=userDao.getLogin(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("editupdate.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			userDao.delete(id);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			usermodel user=new usermodel();
			user.setUid(Integer.parseInt(request.getParameter("uid")));
			user.setFirstname(request.getParameter("fname"));
			user.setLastname(request.getParameter("lname"));
			user.setEmail(request.getParameter("email"));
			user.setMobile(request.getParameter("mobile"));
			user.setPassword(request.getParameter("password"));
			user.setGender(request.getParameter("gender"));
			
			userDao.update(user);
			response.sendRedirect("profile.jsp");
		}
	}
	

}
