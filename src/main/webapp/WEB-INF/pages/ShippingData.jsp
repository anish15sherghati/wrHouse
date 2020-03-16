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
	<h3>Welcome to Shipping Data Pages !!</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Code</th>
			<th>RefNum</th>
			<th>CourRefNum</th>
			<th>ContDetails</th>
			<th>SaleOrder</th>
			<th>Note</th>
			<th>BillToAddrs</th>
			<th>ShipToAddrs</th>
		</tr>

		<c:forEach items="${list}" var="ob">
			<tr>
				<td>${ob.shipId}</td>
				<td>${ob.shipCode}</td>
				<td>${ob.shipRefNum}</td>
				<td>${ob.courRefNum}</td>
				<td>${ob.contDetails}</td>
				<td>${ob.salOrder}</td>
				<td>${ob.shipDesc}</td>
				<td>${ob.billAddr}</td>
				<td>${ob.shipAddr}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>