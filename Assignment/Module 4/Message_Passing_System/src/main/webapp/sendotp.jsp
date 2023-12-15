<%@page import="com.model.Usermodel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Find Your Account</h1>

<h2>Enter your email associated with your account to change your password...</h2>
	
	<%
		String email=null;
		if(session.getAttribute("otp")==null)
		{
			response.sendRedirect("forgot.jsp");
		}
		else
		{
			Usermodel u=(Usermodel)session.getAttribute("Userdata");
			email=u.getEmail();
		}
	
	%>
	
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
</body>
</html>