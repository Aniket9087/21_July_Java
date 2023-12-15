<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
</head>
<body>
${msg}
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
</body>
</html>