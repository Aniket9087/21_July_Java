<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information Form</title>
</head>
<body>
<form action="StudentInformation" method="post">
	
	First Name: <input type="text" name="fname"><br>
	
	Last Name: <input type="text" name="lname"><br>
	
	Email: <input type="text" name="email"><br>
	
	Mobile: <input type="text" name="mobile"><br>
	
	Gender: <input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female<br>
	
	Password: <input type="password" name="password"><br>
	
	<input type="submit" value="Submit">
	

</form>
</body>
</html>