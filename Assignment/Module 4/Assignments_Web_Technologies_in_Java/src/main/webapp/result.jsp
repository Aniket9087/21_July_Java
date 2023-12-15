<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>
<body>
<h1>Fetched Data:</h1>
<table border="1">
<tr>
	<th>Column Name 1</th>
	<th>Column Name 2</th>
</tr>
<c:forEach var="row" items="${result}">
<tr>
	<td>${row.columnname1}</td>
	<td>${row.columnname2}</td>
</tr>
</c:forEach>
</table>
</body>
</html>