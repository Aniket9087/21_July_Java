<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
</head>
<body>
<h1>Find Your Account</h1>

<h2>Enter Your Email associated with your account to change your password....</h2>

                            <form action="ForgotController" method="post"><br>

                                <div class="col-md-12 form-group p_star">
                                    <input type="email" class="form-control" id="email" name="email" value=""
                                        placeholder="Enter Your E-mail">
                                </div><br><br>
                                <div class="col-md-12 form-group">
                                     <button style="color: blue" type="submit" value="submit" name="action" class="btn_3">
                                        Submit
                                    </button>
                                    <button style="color: blue" type="submit" value="cancel" name="action" class="btn_3">
                                        Cancel
                                    </button>
                                </div>
                            </form>
</body>
</html>