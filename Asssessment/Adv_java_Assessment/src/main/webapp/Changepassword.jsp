<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
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
<div class="container">
        <h2>Change Password</h2>
        <form action="LoginController" method="post">
            <div class="form-group">
                <label for="password">Enter New Password:</label>
                <input type="password" id="password" name="newpassword" required>
            </div>
            <div class="form-group">
                <label for="cpassword">Re-Enter Your New Password:</label>
                <input type="password" id="cpassword" name="cpassword" required>
            </div>
           <input type="submit" value="Save Changes" name="action"><br><br>
           <input type="submit" value="Cancle" name="action"><br><br>
           
        </form>
    </div>
</body>
</html>