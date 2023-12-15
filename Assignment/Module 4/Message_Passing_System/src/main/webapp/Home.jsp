<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th>User Id</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>Password</th>
</tr>
<tr>
	<td>${model.uid }</td>
	<td>${model.fname }</td>
	<td>${model.lname }</td>
	<td>${model.email }</td>
	<td>${model.mobile }</td>
	<td>${model.password }</td>
	<td><a href="HomeController?action=edituser&uid=${model.uid }">Edit User</a></td>
	<td><a href="HomeController?action=deleteuser&uid=${model.uid }">Delete User</a></td>
	<td><a href="forgot.jsp">Forgot Password</a></td>
</tr>
</table>
<br>
<br>
<c:if test="${hmodel.uid>0 }">
<form method="post" action="HomeController">
<table>
<tr>
	<td>FirstName : </td>
	<td><input type="text" name="fname"></td>
</tr>
<tr>
	<td>LastName : </td>
	<td><input type="text" name="lname"></td>
</tr>
<tr>
	<td>Email : </td>
	<td><input type="email" name="email"></td>
</tr>
<tr>
	<td>Mobile : </td>
	<td><input type="text" name="mobile"></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password"></td>
</tr>
<tr>
	<td><input type="submit" name="Update"></td>
</tr>
</table>
</form></c:if>
</body>
</html>