<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RegistrationController" method="post">
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
	<td>Phone Number : </td>
	<td><input type="mobile" name="mobile"></td>
</tr>
<tr>
	<td>Gender : </td>
	<td><input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="FeMale">FeMale </td>
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