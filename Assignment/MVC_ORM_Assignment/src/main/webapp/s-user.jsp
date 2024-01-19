<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	User user = (User) request.getAttribute("user");
	%>
	<table border="1">
		<tr>
			<td>User Id: </td>
			<td><%=user.getId()%></td>
		</tr>
		<tr>
			<td>Enter Name:</td>
			<td><%=user.getName()%></td>
		</tr>
		<tr>
			<td>Enter City:</td>
			<td><%=user.getEmail()%></td>
		</tr>
	</table>
</body>
</html>
