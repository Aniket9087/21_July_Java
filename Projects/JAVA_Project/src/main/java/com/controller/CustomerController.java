package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BookDao;
import com.dao.CustomerDao;
import com.model.CustomerModel;
import com.model.bookmodel;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			CustomerModel rmodel=new CustomerModel();
			rmodel.setFirstname(request.getParameter("firstname"));
			rmodel.setLastname(request.getParameter("lastname"));
			rmodel.setGender(request.getParameter("gender"));
			rmodel.setAddress(request.getParameter("address"));
			rmodel.setCity(request.getParameter("city"));
			rmodel.setPincode(Integer.parseInt(request.getParameter("pincode")));
			rmodel.setMobile(request.getParameter("mobile"));
			rmodel.setEmail(request.getParameter("email"));
			rmodel.setPassword(request.getParameter("password"));
			
			int x=new CustomerDao().customerRegistration(rmodel);
			
			if(x>0)
			{
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("registration.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login"))
		{
			CustomerModel lmodel=new CustomerModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			
			CustomerModel model=new CustomerDao().getCustomerLogin(lmodel);
			
			if(model != null)
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("model", model);
				session.setAttribute("customerid", model.getCustomerid());
				session.setAttribute("firstname", model.getFirstname());
				session.setAttribute("lastname", model.getLastname());
				session.setAttribute("email", model.getEmail());
				response.sendRedirect("cust-home.jsp");
			}
		}
		bookmodel bmodel=new bookmodel();
		int sproductid=Integer.parseInt(request.getParameter("sproductid"));
		String price=request.getParameter("price");
		int customerid=Integer.parseInt(request.getParameter("customerid"));
		bmodel.setCustomerid(customerid);
		bmodel.setPrice(price);
		bmodel.setQty(1);
		
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		bmodel.setTotal(0);
		int x=new BookDao().bookProduct(bmodel);
		if(x>0)
		{
			request.getRequestDispatcher("cart.jsp").forward(request, response);
			
		}
		else
		{
			System.out.println("error");
			request.getRequestDispatcher("viewsubproduct.jsp").forward(request, response);
			
		}
	}
	
	
	

}
