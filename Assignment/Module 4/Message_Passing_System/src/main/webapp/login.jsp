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
<form method="post" action="LoginController">
<table>
<tr>
	<td>Email : </td>
	<td><input type="email" name="email"></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password"></td>
</tr>
<tr>
	<td><input type="submit" name="Login"></td>
</tr>
<tr><a href="Ajex.jsp">Search</a></tr>
</table>
</form>
</body>
</html>