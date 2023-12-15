<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fetch Data</title>
</head>
<body>
<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/database" user="aniket" password="2003"/>

	<sql:query dataSource="${dataSource }" var="result">
		select * from database
	</sql:query>
	
	<c:forEach var="row" items="${result.rows }">
		ID: <c:out value="${row.ID }"/><br/>
		Name: <c:out value="${row.Name }"/><br/>
	
	</c:forEach>
</body>
</html>