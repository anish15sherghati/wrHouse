<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<td>${obj.ordId}</td>
		</tr>
		<tr>
			<th>Mode</th>
			<td>${obj.ordMode}</td>
		</tr>
		<tr>
			<th>Code</th>
			<td>${obj.ordCode}</td>
		</tr>
		<tr>
			<th>Method</th>
			<td>${obj.ordMethod}</td>
		</tr>
		<tr>
			<th>Accept</th>
			<td>${obj.ordAccept}</td>
		</tr>
		<tr>
			<th>Note</th>
			<td>${obj.ordDesc}</td>
		</tr>
	</table>
<a href="excel?oid=${obj.ordId}">ExcelData</a>
<a href="pdf?oid=${obj.ordId}">PdfExport</a>
</body>
</html>