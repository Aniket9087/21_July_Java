<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg }
<form action="RegisterController" method="post">
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
	<td>UserName : </td>
	<td><input type="text" name="username"></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password"></td>
</tr>
<tr>
	<td><input type="submit" name="Register"></td>
</tr>

</table>
</form>
</body>
</html>