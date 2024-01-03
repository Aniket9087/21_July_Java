<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th>Id</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Address</th>
	<th>Gender</th>
	<th>Password</th>
	<th>Cpassword</th>
	<th colspan="2">Action</th>
</tr>
<%
List<Employee> emp=(List<Employee>)request.getAttribute("emp");
for(Employee e:emp)

{
%>

	<tr>
		<td><%=e.getId() %></td>
		<td><%=e.getFname() %></td>
		<td><%=e.getLname() %></td>
		<td><%=e.getEmail() %></td>
		<td><%=e.getAddress()%></td>
		<td><%=e.getGender() %></td>
		<td><%=e.getPassword() %></td>
		<td><%=e.getCpassword() %></td>
		<td>
			<a href="edit/<%=e.getId()%>">Edit</a>
		</td>
		<td>
			<a href="delete/<%=e.getId()%>">Delete</a>
		</td>
	</tr>
<%} %>
</table>
<br>
<a href="empForm">Add New Employee</a>
</body>
</html>