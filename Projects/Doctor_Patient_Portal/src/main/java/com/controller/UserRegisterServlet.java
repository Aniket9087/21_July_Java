package com.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.model.User;
import com.util.DBConnection;


@WebServlet("/user_register")
public class UserRegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			// PrintWriter out = resp.getWriter();

			String fullName = req.getParameter("fullName");
			String email = req.getParameter("email");
			String password = req.getParameter("password");

			User user = new User(fullName, email, password);

			UserDAO userDAO = new UserDAO(DBConnection.getConn());
			
			HttpSession session = req.getSession();
			

			boolean f = userDAO.userRegister(user); 

			if (f == true) {

				session.setAttribute("successMsg", "Register Successfully");
				resp.sendRedirect("signup.jsp");
				//System.out.println("register successfull");
				// out.println("success");

			} else {
				
				session.setAttribute("errorMsg", "Something went wrong!");
				resp.sendRedirect("signup.jsp");
				
				//System.out.println("Error! Something went wrong");
				// out.println("error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
