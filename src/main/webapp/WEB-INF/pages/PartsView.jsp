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
	<h3>Welcome TO View Particular page!!</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<td>${parts.partId}</td>
		</tr>
		<tr>
			<th>Code</th>
			<td>${parts.partCode}</td>
		</tr>
		<tr>
			<th>Width</th>
			<td>${parts.partWidth}</td>
		</tr>
		<tr>
			<th>Length</th>
			<td>${parts.partLength}</td>
		</tr>
		<tr>
			<th>Height</th>
			<td>${parts.partHeight}</td>
		</tr>
				<tr>
			<th>Cost</th>
			<td>${parts.partBcost}</td>
		</tr>
		<tr>
			<th>UomModel</th>
			<td>${parts.uomObj.uomModel}</td>
		</tr>
		
		<tr>
			<th>OrderMethod</th>
			<td>${parts.ordSaleOb.ordMode}</td>
		</tr>
		
		<tr>
			<th>Note</th>
			<td>${parts.partDesc}</td>
		</tr>
	</table>
</body>
</html>