<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@page
	import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
	UserDao userDao = (UserDao) a.getBean("userDao");
	List<User> list = userDao.getAllUser();
	%>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th colspan="3">Actions</th>
		</tr>
		<%
		for (User user : list) {
		%>
		<tr>
			<td><%=user.getId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getEmail()%></td>
			<td>
				<form name="query" method="post" action="ActionController">
					<input type="hidden" name="id" value="<%=user.getId()%>"> <input
						type="submit" name="action" value="Query">
				</form>
			</td>
			<td>
				<form name="edit" method="post" action="ActionController">
					<input type="hidden" name="id" value="<%=user.getId()%>"> <input
						type="submit" name="action" value="Edit">
				</form>
			</td>
			<td>
				<form name="delete" method="post" action="ActionController">
					<input type="hidden" name="id" value="<%=user.getId()%>"> <input
						type="submit" name="action" value="Delete">
				</form>
			</td>
		</tr>
		<%
		}
		%>
	</table>
	
	<h3>
		<a href="insert.jsp">Add User</a>
	</h3>
</body>
</html>
