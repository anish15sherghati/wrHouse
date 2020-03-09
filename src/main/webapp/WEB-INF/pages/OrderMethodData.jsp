<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
	<H3>WELCOME TO ORDER_METHOD DATA PAGES !!</H3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Mode</th>
			<th>Code</th>
			<th>Method</th>
			<th>Accept</th>
			<th>Description</th>
			<th colspan="3">Operation</th>
		</tr>
		<c:forEach items="${ordlists}" var="ob">
		<tr>
			<td>${ob.ordId}</td>
			<td>${ob.ordMode}</td>
			<td>${ob.ordCode}</td>
			<td>${ob.ordMethod}</td>
			<td>${ob.ordAccept}</td>
			<td>${ob.ordDesc}</td>
			<td><a href="delete?oid=${ob.ordId}">Delete</a></td>
			<td><a href="view?oid=${ob.ordId}">View</a></td>
			<td><a href="edit?oid=${ob.ordId}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
<a href="excel">ExcelData</a>      |    <a href="pdf">PdfData</a>
</body>
</html>