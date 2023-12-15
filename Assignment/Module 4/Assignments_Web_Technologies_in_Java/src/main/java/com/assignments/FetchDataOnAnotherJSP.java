package com.assignments;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FetchDataOnAnotherJSP")
public class FetchDataOnAnotherJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FetchDataOnAnotherJSP() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		
		
		String url="jdbc:mysql://localhost:3306/aniket";
		String username="Prashant";
		String password="123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection(url,username,password);
			st=cn.createStatement();
			rs=st.executeQuery("select * from fetch");
			
			request.setAttribute("result", rs);
			
			RequestDispatcher view=request.getRequestDispatcher("result.jsp");
			view.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {	
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(cn!=null) cn.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
