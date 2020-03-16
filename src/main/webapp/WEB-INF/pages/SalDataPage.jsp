<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="class" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to Sale Order All Data Pages !!</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>ShipCode</th>
			<th>CustCode</th>
			<th>SalRef</th>
			<th>StockMode</th>
			<th>StockSource</th>
			<th>SalStatus</th>
			<th>SalDesc</th>
			<th colspan="3">OPeration</th>
		</tr>
	<class:forEach items="${list}" var="ob">
	<tr>
			<td>${ob.salId}</td>
			<td>${ob.salCode}</td>
			<td>${ob.shipObj.shipCode}</td>
			<td>${ob.whTypeCust.whuserCode}</td>
			<td>${ob.salRefNo}</td>
			<td>${ob.stockMode}</td>
			<td>${ob.stockSource}</td>
			<td>${ob.salStatus}</td>
			<td>${ob.salDesc}</td>
			<td><a href="view?sid=${ob.salId}">View</a></td>
			<td><a href="delete?sid=${ob.salId}">Delete</a></td>
			<td><a href="edit?sid=${ob.salId}">Edit</a></td>
		</tr>
	</class:forEach>

	</table>

</body>
</html>