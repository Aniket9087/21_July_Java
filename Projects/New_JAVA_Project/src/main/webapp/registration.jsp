<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Male-Fashion | Template</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
<script type="text/javascript">
	function validateForm() {
		var firstname = document.forms["registration"]["firstname"].value;
		var lastname = document.forms["registration"]["lastname"].value;
		var gender = document.forms["registration"]["gender"].value;
		var address = document.forms["registration"]["address"].value;
		var city = document.forms["registration"]["city"].value;
		var pincode = document.forms["registration"]["pincode"].value;
		var mobile = document.forms["registration"]["mobile"].value;
		var email = document.forms["registration"]["email"].value;
		var password = document.forms["registration"]["password"].value;
		if (firstname === "") {
			alert("Name must be filled out");
			return false;
		}
		if (lastname === "") {
			alert("Address must be filled out");
			return false;
		}
		if (gender === "") {
			alert("Number must be a 10-digit number");
			return false;
		}
		if (address === "") {
			alert("Please select a gender");
			return false;
		}
		if (city === "") {
			alert("Please select a City")
			return false;
		}
		if (pincode === "") {
			alert("Please select a Pin-code")
			return false;
		}
		if (mobile === "" || isNaN(mobile) || mobile.length !== 10) {
			alert("Please select Phone Number")
			return false;
		}

		if (email === "" || !validateEmail(email)) {
			alert("Please enter a valid email address");
			return false;
		}
		if (password === "" || !validatePassword(password)) {
			alert("Password must contain at least one lowercase, one uppercase, one number, one special character and minimum 8 characters");
			return false;
		}
		return true;
	}

	function validateEmail(email) {
		var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
		return emailRegex.test(email);
	}

	function validatePassword(password) {
		var passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%?&])[A-Za-z\d@$!%?&]{8,}$/;
		return passwordRegex.test(password);
	}
</script>

</head>
<body>
	<!-- Header Section Begin -->
	<header class="header">
		<div class="header__top">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-7"></div>
					<div class="col-lg-6 col-md-5">
						<div class="header__top__right"></div>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="header__logo">
						<a href="./index.html"><img src="img/logo.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu">
						<ul>
							<li class="active"><a href="index.jsp">Home</a></li>
							<li><a href="./shop.html">Shop</a></li>
							<li><a href="#">Pages</a>
								<ul class="dropdown">
									<li><a href="./about.html">About Us</a></li>
									<li><a href="./shop-details.html">Shop Details</a></li>
									<li><a href="./shopping-cart.html">Shopping Cart</a></li>
									<li><a href="./checkout.html">Check Out</a></li>
									<li><a href="./blog-details.html">Blog Details</a></li>
								</ul></li>
							<li><a href="./blog.html">Blog</a></li>
							<li><a href="./contact.html">Contacts</a></li>
						</ul>
					</nav>
				</div>
				<div class="col-lg-3 col-md-3">
					<div class="header__nav__option">
						<a href="#" class="search-switch"><img
							src="img/icon/search.png" alt=""></a> <a href="#"><img
							src="img/icon/heart.png" alt=""></a> <a href="#"><img
							src="img/icon/cart.png" alt=""> <span>0</span></a>
						<div class="price">$0.00</div>
					</div>
				</div>
			</div>
			<div class="canvas__open">
				<i class="fa fa-bars"></i>
			</div>
		</div>
	</header>
	<!-- Header Section End -->
	<section class="login_part padding_top">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-6 col-md-6">
					<div class="login_part_text text-center">
						<div class="login_part_text_iner">
							<h3 style="color: green">
								If You are New Customer <br> Please Sign Up Now
							</h3>
							<a style="color: gre" class="btn_3">Create Your Account</a>
						</div>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<div class="login_part_form">
						<div class="login_part_form_iner"></div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<h3 style="color: blue">Registration Form</h3>

	<form class="row contact_form" action="CustomerController"
		method="post" novalidate="novalidate" onsubmit="return validateForm()">
		<div class="col-md-12 form-group p_star">
			<input type="text" class="form-control" id="firstname"
				name="firstname" value="" placeholder="Enter Your Firstname">
		</div>
		<div class="col-md-12 form-group p_star">
			<input type="text" class="form-control" id="lastname" name="lastname"
				value="" placeholder="Enter Your Lastname">
		</div>
		<div class="col-md-12 form-group p_star">
			<h5>
				Gender : <input type="radio" id="gender" name="gender" value="Male">Male
				<input type="radio" id="gender" name="gender" value="Female">Female
			</h5>
		</div>
		<div class="col-md-12 form-group p_star">
			<input type="text" class="form-control" id="address" name="address"
				value="" placeholder="Enter Your Address">
		</div>
		<div class="col-md-12 form-group p_star">
			<input type="text" class="form-control" id="city" name="city"
				value="" placeholder="Enter Your City">
		</div>
		<div class="col-md-12 form-group p_star">
			<input type="text" class="form-control" id="pincode" name="pincode"
				value="" placeholder="Enter Your Pin-Code">
		</div>
		<div class="col-md-12 form-group p_star">
			<input type="text" class="form-control" id="mobile" name="mobile"
				value="" placeholder="Enter Your Phone Number">
		</div>
		<div class="col-md-12 form-group p_star">
			<input type="text" class="form-control" id="email" name="email"
				value="" placeholder="Enter Your E-mail">
		</div>
		<div class="col-md-12 form-group p_star">
			<input type="password" class="form-control" id="password"
				name="password" value="" placeholder="Enter Your Password">
		</div>
		<div class="col-md-12 form-group">
			<button style="color: blue" type="submit" value="register"
				name="action" class="btn_3">Register</button>
			<button style="color: blue" type="submit" value="cancel"
				name="action" class="btn_3">Cancel</button>
		</div>
	</form>

	<!-- Footer Section Begin -->
	<footer class="footer">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6 col-sm-6">
					<div class="footer__about">
						<div class="footer__logo">
							<a href="#"><img src="img/footer-logo.png" alt=""></a>
						</div>
						<p>The customer is at the heart of our unique business model,
							which includes design.</p>
						<a href="#"><img src="img/payment.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-2 offset-lg-1 col-md-3 col-sm-6">
					<div class="footer__widget">
						<h6>Shopping</h6>
						<ul>
							<li><a href="#">Clothing Store</a></li>
							<li><a href="#">Trending Shoes</a></li>
							<li><a href="#">Accessories</a></li>
							<li><a href="#">Sale</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-2 col-md-3 col-sm-6">
					<div class="footer__widget">
						<h6>Shopping</h6>
						<ul>
							<li><a href="#">Contact Us</a></li>
							<li><a href="#">Payment Methods</a></li>
							<li><a href="#">Delivary</a></li>
							<li><a href="#">Return & Exchanges</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 offset-lg-1 col-md-6 col-sm-6">
					<div class="footer__widget">
						<h6>NewLetter</h6>
						<div class="footer__newslatter">
							<p>Be the first to know about new arrivals, look books, sales
								& promos!</p>
							<form action="#">
								<input type="text" placeholder="Your email">
								<button type="submit">
									<span class="icon_mail_alt"></span>
								</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12 text-center">
					<div class="footer__copyright__text">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						<p>
							Copyright ©
							<script>
								document.write(new Date().getFullYear());
							</script>
							2020 All rights reserved | This template is made with <i
								class="fa fa-heart-o" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a>
						</p>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- Footer Section End -->

</body>
</html>