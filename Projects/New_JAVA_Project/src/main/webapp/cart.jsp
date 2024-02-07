<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
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
</head>

<!-- Page Preloder -->
<div id="preloder">
	<div class="loader"></div>
</div>

<!-- Offcanvas Menu Begin -->
<div class="offcanvas-menu-overlay"></div>
<div class="offcanvas-menu-wrapper">
	<div class="offcanvas__option">
		<div class="offcanvas__links">
			<a href="#">Sign in</a> <a href="#">FAQs</a>
		</div>
		<div class="offcanvas__top__hover">
			<span>Usd <i class="arrow_carrot-down"></i></span>
			<ul>
				<li>USD</li>
				<li>EUR</li>
				<li>USD</li>
			</ul>
		</div>
	</div>
	<div class="offcanvas__nav__option">
		<a href="#" class="search-switch"><img src="img/icon/search.png"
			alt=""></a> <a href="#"><img src="img/icon/heart.png" alt=""></a>
		<a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
		<div class="price">$0.00</div>
	</div>
	<div id="mobile-menu-wrap"></div>

</div>
<!-- Offcanvas Menu End -->

<header class="header">
	<div class="header__top">
		<div class="container">
			<div class="row">

				<div class="col-lg-6 col-md-5">
					<div class="header__top__right">
						<div class="header__top__links"></div>

					</div>
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
			<div class="col-lg-7 col-md-10">
				<nav class="header__menu mobile-menu">
					<ul>
						<li class="active"><a href="./index.html">Home</a></li>
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
						<li><a href="cart.jsp">Cart</a></li>
						<li><a><%=session.getAttribute("firstname")%></a>
							<ul class="dropdown">
								<li><a href="index.jsp">Log Out</a></li>

							</ul></li>
					</ul>
				</nav>
			</div>
			<div class="col-lg-2 col-md-2">
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

<body>
	<%
	Connection cn = new DBUtil().getConnecttionData();
	String qry = "select * from subproducts where sproductid=?";
	PreparedStatement st = cn.prepareStatement(qry);
	st.setInt(1, Integer.parseInt(request.getParameter("sproductid")));
	ResultSet rs = st.executeQuery();
	while (rs.next()) {
	%>
	<div class="container">
		<div class="d-flex py-3">
			<h3>
				Total Price :
				<%=rs.getString(5)%>
				
			</h3>

		</div>
		<table class="table table-loght">
			<thead>
				<tr>
					<th scope="col">Product Name</th>
					<th scope="col">Price</th>
					<th scope="col">Quantity</th>
					<th scope="col">Buy Now</th>
					<th scope="col">Cancel</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=rs.getString(3)%></td>
					<td><%=rs.getString(5)%></td>
					
						<!--  <form action="" method="post" class="form-inline">
						<input type="hidden" name="id" value="1" class="form-inline">
						<div class="form-group d-flex justify-content-between">
							<a class="btn btn-sm btn-incre" href=""><i class="fas fa-plus-square"></i></a>
							<input type="text" name="Quantity" class="form-control" value="1" readonly="readonly">
							<a class="btn btn-sm btn-decre" href=""><i class="fas fa-plus-square"></i></a>
						</div>
					</form> --> 
					 <td class="quantity__item">
						<div class="quantity">
                                            <div class="pro-qty-2">
                                                <input type="text"
									value="1">
                                            </div>
                                        </div>
                                    </td>
                      <td><a href="#" class="btn btn-dark">Buy</a></td>
				 
					
				<td><a class="btn btn-sm btn-danger" href="#">Remove</a></td>
			</tr>
		</tbody>
	</table>
</div>
 <%
 }
 cn.close();
 %>




<%@ include file="footer.jsp"%>

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery.nicescroll.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/jquery.countdown.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>

</body>
</html>