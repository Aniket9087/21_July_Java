<%@page import="java.net.URI"%>
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
	<th>Id</th>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Email</th>
	<th>PhoneNumber</th>
	<th>Gender</th>
	<th>Password</th>
</tr>
<tr>
	<td>${model.id }</td>
	<td>${model.fname }</td>
	<td>${model.lname }</td>
	<td>${model.email }</td>
	<td>${model.mobile }</td>
	<td>${model.gender }</td>
	<td>${model.password }</td>
	<td><a href="HomeController.do?action=edituser&id=${model.id }">Edit User</a></td>
	<td><a href="HomeController.do?action=deleteuser&id=${model.id }">Delete User</a></td>
</tr>
</table>
<br>
<br>
<c:if test="${hmodel.id>0}">
<form action="HomeController.do" method="post">
<table>
	<tr>
	<td>First Name: </td>
	<td><input type="text" name="fname" value="${hmodel.fname }"></td>
	</tr>
	<tr>
	<td>Last Name: </td>
	<td><input type="text" name="lname" value="${hmodel.lname }"></td>
	</tr>
	<tr>
	<td>Email: </td>
	<td><input type="email" name="email" value="${hmodel.email }"></td>
	</tr>
	<tr>
	<td>Phone Number: </td>
	<td><input type="mobile" name="mobile" value="${hmodel.mobile }"></td>
	</tr>
	<tr>
	<td>Gender: </td>
	<td><input type="gender" name="gender" value="${hmodel.gender }"></td>
	</tr>
	<tr>
	<td>Password: </td>
	<td><input type="password" name="password" value="${hmodel.password }"><input type="hidden" name="id" value="${hmodel.id }"></td>
	</tr>
	<tr>
	<td><input type="submit" value="Update"></td>
	</tr>
</table>
</form>
</c:if>
</body>
</html>