<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Selected view Data</h3>
<a href="excel?uid=${om.uomId}">Excel</a>    <a href="pdf?uid=${om.uomId}">PDF</a>
	<table border="1">
		<tr>
			<th>ID</th>
			<td>${om.uomId}</td>
		</tr>
		<tr>
			<th>Type</th>
			<td>${om.uomType}</td>
		</tr>
		<tr>
			<th>Model</th>
			<td>${om.uomModel}</td>
		</tr>
		<tr>
			<th>Desc</th>
			<td>${om.uomDesc}</td>
		</tr>
	</table>

</body>
</html>