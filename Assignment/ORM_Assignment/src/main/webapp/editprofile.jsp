<%@page import="com.model.usermodel"%>
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
	usermodel user = (usermodel) request.getAttribute("user");
	%>
	<h1>Edit Profile</h1>
	<form method="post" action="UserController">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="fname" value="<%=user.getFirstname() %>"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lname" value="<%=user.getLastname() %>"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" value="<%=user.getEmail() %>"></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="mobile" value="<%=user.getMobile() %>"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" value="<%=user.getPassword() %>"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender"  value="<%=user.getGender() %>">Male
					<input type="radio" name="gender"  value="<%=user.getGender() %>">Female</td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>