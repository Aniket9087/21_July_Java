<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<h1>User Registration</h1>
	<form method="post" action="ActionController">
		<table>
			<tr>
				<td>Enter Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="insert"></td>
			</tr>
		</table>
	</form>
</body>
</html>
