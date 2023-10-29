<%@page import="com.model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
</head>
<body bgcolor="floralwhite">
<h1>Find Your Account</h1>

<h2>Enter Your Email associated with your account to change your password....</h2>

	<%
		String email=null;
		if(session.getAttribute("otp")==null)
		{
			response.sendRedirect("Forgotpassword.jsp");
		}
		else
		{
			user u=(user)session.getAttribute("Userdata");
			email=u.getEmail();
		}
	%>
<div class="col-lg-6 col-md-6">
                    <div class="login_part_form">
                        <div class="login_part_form_iner">
                            <form class="row contact_form" action="ForgotController" method="post"><br>

                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="email" name="Enterotp" value=""
                                        placeholder="Your Otp">
                                        <label for="email">Your OTP</label>
                                        <label>Email send on Email Address &emsp;<%=email %></label>
                                </div><br><br>
                                <div class="col-md-12 form-group">
                                     <button style="color: blue" type="submit" value="Verify" name="action" class="btn_3">
                                        Verify
                                    </button>
                                    <button style="color: blue" type="submit" value="cancel" name="action" class="btn_3">
                                        Cancel
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
</body>
</html>