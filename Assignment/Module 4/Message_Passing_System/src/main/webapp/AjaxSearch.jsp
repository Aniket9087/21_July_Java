    <%@ page import="java.sql.*" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
    <%  
    String fname=request.getParameter("val");  
    if(fname==null||fname.trim().equals(""))
    {  
    	out.print("<p>Please enter name!</p>");  
    }
    else
    {  
    	try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aniket","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from message where fname like '"+fname+"%'");  
    		ResultSet rs=ps.executeQuery();  
      		if(!rs.isBeforeFirst()) 
      		{      
     			out.println("<p>No Record Found!</p>");   
    		}
      		else
      		{  
    			out.print("<table border='1' cellpadding='2' width='100%'>");  
    			out.print("<tr><th>UId</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Mobile</th><th>Password</th></tr>");  
    			while(rs.next())
    			{  
    				out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>");  
    			}  
    			out.print("</table>");  
    		}  
    		con.close();  
    	}
    	catch(Exception e)
    	{
    		out.print(e);
    	}  
    }  
    %>  