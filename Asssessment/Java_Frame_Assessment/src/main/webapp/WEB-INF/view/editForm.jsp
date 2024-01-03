<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

 body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }

</style>
</head>
<body>
<%
	Employee e=(Employee)request.getAttribute("e");
%>
<div class="container">
        <h2>Employee Form</h2>
        <form action="/Java_Frame_Assessment/update" method="post">
            <div class="form-group">
                <label for="name">First Name:</label>
                <input type="text" id="name" name="fname" value="<%=e.getFname() %>" required>
            </div>
            <div class="form-group">
                <label for="name">Last Name:</label>
                <input type="text" id="name" name="lname" value="<%=e.getLname() %>" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="<%=e.getEmail() %>"  required>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" id="mobile" name="mobile" value="<%=e.getMobile() %>" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" value="<%=e.getAddress() %>" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <input type="radio" id="gender" name="gender" value="<%=e.getGender() %>" value="Male" required>Male <input type="radio" id="gender" name="gender" value="FeMale" required>FeMale
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="text" id="password" name="password" value="<%=e.getPassword() %>" required>
            </div>
            <div class="form-group">
                <label for="password">Confirm Password:</label>
                <input type="text" id="cpassword" name="cpassword" value="<%=e.getCpassword() %>" required>
                <input type="hidden" name="id" value="<%=e.getId()%>">
            </div>
            <input type="submit" value="Update">
        </form>
    </div>
</body>
</html>