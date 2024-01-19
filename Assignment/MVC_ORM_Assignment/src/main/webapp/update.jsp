<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	User user = (User) request.getAttribute("user");
	%>
	<form method="post" action="ActionController">
		<table>
			<tr>
				<td>Enter Name:</td>
				<td><input type="text" name="name" value="<%=user.getName()%>"></td>
			</tr>
			<tr>
				<td>Enter City:</td>
				<td><input type="email" name="email" value="<%=user.getEmail()%>">
					<input type="hidden" name="id" value="<%=user.getId()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="update">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
