<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Page</title>
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
${msg}
<center><h1>Sign Up Page</h1></center><br>

<div class="container">
        <h2>Registration Form</h2>
        <form action="insertcontroller" method="post">
            <div class="form-group">
                <label for="name">Enter the First Name:</label>
                <input type="text" id="name" name="firstname" required>
            </div>
            <div class="form-group">
                <label for="name">Enter the Last Name:</label>
                <input type="text" id="name" name="lastname" required>
            </div>
            <div class="form-group">
                <label for="email">Enter the Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="mobile">Enter Your Phone Number:</label>
                <input type="mobile" id="mobile" name="mobile" required>
            </div>
            <div class="form-group">
                <label for="address">Enter Your Address:</label>
                <input type="address" id="address" name="address" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <input type="radio" id="gender" name="gender" value="Male" required>Male <input type="radio" id="gender" name="gender" value="FeMale" required>FeMale
            </div>
            <div class="form-group">
                <label for="password">Enter the Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="password">Confirm Password:</label>
                <input type="password" id="cpassword" name="cpassword" required>
            </div>
            <input type="submit" value="Register">
        </form>
    </div>

</body>
</html>