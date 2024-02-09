<%@page import="com.dao.CustomerDao"%>
<%@page import="com.model.CustomerModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
 	
 	
 	<div class="custom-border-bottom py-3">
      <div class="container">
        <div class="row">
          <div class="col-md-12 mb-0"><a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong class="text-black">Booking Product</strong></div>
        </div>
      </div>
    </div>


    <div class="site-section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h2 class="h3 mb-3 text-black">Customer Booking</h2>
          </div>
          <div class="col-md-7">
	<%
		CustomerModel model=(CustomerModel)session.getAttribute("model");		
		
	%>
            <form action="CustomerController" method="post">
              
              <div class="p-3 p-lg-5 border">
                <div class="form-group row">
                  <div class="col-md-6">
                    <label for="c_fname" class="text-black">First Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_fname" name="firstname" value="<%=model.getFirstname()%>">
                  </div>
                  <div class="col-md-6">
                    <label for="c_lname" class="text-black">Last Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_lname" name="lastname" value="<%=model.getLastname()%>">
                  </div>
                </div>

                <div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_message" class="text-black">Address </label>
                    <textarea name="address" id="c_message" cols="30" rows="5" class="form-control"><%=model.getAddress() %></textarea>
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_subject" class="text-black">City </label>
                    <input type="text" class="form-control" id="c_subject" name="city" value="<%=model.getCity()%>">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_subject" class="text-black">Pin Code </label>
                    <input type="text" class="form-control" id="c_subject" name="pincode" value="<%=model.getPincode()%>">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_subject" class="text-black">MobNo </label>
                    <input type="text" class="form-control" id="c_subject" name="mobno" value="<%=model.getMobile()%>">
                  </div>
                </div>

                <div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_email" class="text-black">Price <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_email" name="price" placeholder="" value="<%=request.getParameter("price") %>">
                  </div>
                </div>
 				<div class="form-group row">
                  <div class="col-md-12">
                    <label for="c_email" class="text-black">Product Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="c_email" name="pname" placeholder="" value="<%= new CustomerDao().getProductName(Integer.parseInt(request.getParameter("productid")))%>">
                    <input type="hidden" name="productid" value="<%= request.getParameter("productid")%>">
            <input type="hidden" name="customerid" value="<%= session.getAttribute("customerid")%>">
            <input type="hidden" name="price" value="<%=request.getParameter("price")%>">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-lg-12">
                    <input type="submit" class="btn btn-primary btn-lg btn-block" name="action" value="OrderBook">
                  </div>
                </div>
              </div>
            </form>
          </div>
      
        </div>
      </div>
    </div>
 	
 	<%@ include file="footer.jsp" %>
 
</body>
</html>