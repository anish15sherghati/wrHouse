<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H3>WELCOME TO SHIPMENTTYPE VIEW PAGES!!</H3>
	<table border="1">
		<tr>
			<th>Id</th>
			<td>${stObj.shipId}</td>
		</tr>
		<tr>
			<th>Mode</th>
			<td>${stObj.shipMode}</td>
		</tr>
		<tr>
			<th>Code</th>
			<td>${stObj.shipCode}</td>
		</tr>
		<tr>
			<th>Enable</th>
			<td>${stObj.enabShip}</td>
		</tr>
		<tr>
			<th>Grade</th>
			<td>${stObj.shipGrade}</td>
		</tr>
		<tr>
			<th>Desc</th>
			<td>${stObj.shipDesc}</td>
		</tr>
	</table>
<a href="pdf?sid=${stObj.shipId}">Pdf Export</a>||
<a href="excel?sid=${stObj.shipId}">Excel Export</a>
</body>
</html>