<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
<th>UserId</th>
<th>FirstName</th>
<th>LastName</th>
<th>UserName</th>
<th>Password</th>
</tr>
<tr>
<td>${model.userid }</td>
<td>${model.firstname }</td>
<td>${model.lastname }</td>
<td>${model.username }</td>
<td>${model.password }</td>
<td><a href="HomeController?action=edituser&userid=${model.userid}">Edit</a></td>
<td><a href="HomeController?action=deleteuser&userid=${model.userid}">Delete</a></td>
</tr>
</table>
<br><br><br>
<c:if test="${hmodel.userid > 0 }">
<form method="post" action="HomeController">
<table border="1">
<tr>
<td>Enter First Name :</td><td><input type="text" name="firstname" value="${hmodel.firstname }"></td>
</tr>
<tr>
<td>Enter Last Name :</td><td><input type="text" name="lastname" value="${hmodel.lastname }"></td>
</tr>
<tr>
<td>Enter User Name :</td><td><input type="text" name="username"  value="${hmodel.username }"></td>
</tr>
<tr>
<td>Enter Password :</td><td><input type="password" name="password" value="${hmodel.password }"><input type="hidden" name="userid" value="${hmodel.userid }"></td>
</tr>
<tr>
<td><input type="submit" name="Update"></td>
</tr>
</table>
</form>
</c:if>

</body>
</html>