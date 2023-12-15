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
<form method="post" action="RegistationController">
<table>
<tr>
<td>Enter First Name :</td><td><input type="text" name="firstname"></td>
</tr>
<tr>
<td>Enter Last Name :</td><td><input type="text" name="lastname"></td>
</tr>
<tr>
<td>Enter User Name :</td><td><input type="text" name="username"></td>
</tr>
<tr>
<td>Enter Password :</td><td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" name="Register"></td>
</tr>

</table>
</form>
</body>
</html>