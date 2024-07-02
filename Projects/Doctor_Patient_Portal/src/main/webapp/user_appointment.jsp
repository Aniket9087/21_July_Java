<%@page import="com.model.Doctor"%>
<%@page import="java.util.List"%>
<%@page import="com.util.DBConnection"%>
<%@page import="com.dao.DoctorDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Appointment Page</title>
<%@include file="../component/allcss.jsp"%>

<style type="text/css">
.my-card {
	box-shadow: 0px 0px 10px 1px maroon;
}


.my-bg-img{
	background: linear-gradient(rgba(0, 0, 0, .4), rgba(0, 0, 0, .4)),url("img/hospital1.jpg");
	height: 20vh;
	width: 100%;
	background-size:cover;
	background-repeat: no-repeat;
	
}

</style>

</head>
<body>
	<%@include file="component/navbar.jsp"%>


	<div class="container-fluid my-bg-img p-5">
		<p class="text-center fs-2 text-white"></p>

	</div>


	<div class="container p-3">
		<p class="fs-2"></p>

		<div class="row">
			
			<div class="col-md-6 p-5">
				<!-- <img alt="" src="img/picDoc.jpg" width="500px" height="400px"> -->
				<img alt="" src="img/doc3.jpg" width="370" height="">
			</div>
			
			<div class="col-md-6">
				<div class="card my-card">
					<div class="card-body">
						<p class="text-center fs-3">User Appointment</p>

						<c:if test="${not empty successMsg }">
							<p class="text-center text-success fs-5">${successMsg}</p>
							<c:remove var="successMsg" scope="session" />
						</c:if>

						<c:if test="${not empty errorMsg }">
							<p class="text-center text-danger fs-5">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						<form class="row g-3" action="addAppointment" method="post">
							
							<input type="hidden" name="userId" value="${ userObj.id }">
							
							<div class="col-md-6">
								<label class="form-label">Full Name</label> <input required="required"
									name="fullName" type="text" placeholder="Enter full name"
									class="form-control">

							</div>

							<div class="col-md-6">
								<label class="form-label">Gender</label> <select
									class="form-control" name="gender" required="required">
									<option selected="selected" disabled="disabled">---Select
										Gender---</option>
									<option value="male">Male</option>
									<option value="female">Female</option>
								</select>
							</div>

							<div class="col-md-6">
								<label class="form-label">Age</label> <input name="age"
								required="required"	type="text" placeholder="Enter your Age" class="form-control">
							</div>
							<div class="col-md-6">
								<label class="form-label">Appointment Date</label> <input
								required="required"	name="appointmentDate" type="date" class="form-control">
							</div>

							<div class="col-md-6">
								<label class="form-label">Email</label> <input name="email"
								required="required"	type="email" placeholder="Enter email" class="form-control">
							</div>

							<div class="col-md-6">
								<label class="form-label">Phone</label> <input name="phone"
								required="required"	type="text" maxlength="11" placeholder="Enter Mobile no."
									class="form-control">
							</div>

							<div class="col-md-6">
								<label class="form-label">Diseases</label> <input
								required="required"	name="diseases" type="text" placeholder="Enter diseases"
									class="form-control">
							</div>

							<div class="col-md-6">
								<label class="form-label">Doctor</label> <select
								 required="required" class="form-control" name="doctorNameSelect">
									<option selected="selected" disabled="disabled">---Select---</option>
									
									<%
									DoctorDAO doctorDAO = new DoctorDAO(DBConnection.getConn());
									List<Doctor> listOfDoctor = doctorDAO.getAllDoctor();
									for(Doctor d : listOfDoctor) 
									
									{%>
									<!-- actually we take id of doctor from doctor table -->
									<option value="<%= d.getId() %>"> <%= d.getFullName()%> (<%= d.getSpecialist() %>) </option>
									
									<%
									}
									%>
									
									<!-- <option>Doctor name</option> -->
								</select>
							</div>



							<div class="col-md-12">
								<label class="form-label">Full Address</label>
								<textarea name="address" required="required" class="form-control" rows="3" cols=""></textarea>
							</div>


							<c:if test="${empty userObj}">
								<div class="col-md-12">
									<a href="user_login.jsp" class="btn my-bg-color text-white col-md-12">Submit</a>
								</div>
							</c:if>


							<c:if test="${not empty userObj}">

								<div class="col-md-12">
									<button type="submit" class="btn my-bg-color text-white col-md-12">Submit</button>
								</div>

							</c:if>

						</form>


					</div>
				</div>

			</div>



		</div>


	</div>















<%@include file="component/footer.jsp" %>

</body>
</html>