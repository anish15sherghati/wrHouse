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
	<h2>Welcome to Purchase_Order Data Pages !!</h2>
	<form action="all" method="GET">
		<table border="1">
			<tr>
				<th>PurId</th>
				<th>PurCode</th>
				<th>ShipCode</th>
				<th>WhUserType</th>
				<th>PurRefNo</th>
				<th>PurOrdQuality</th>
				<th>PurOrdStatus</th>
				<th>Note</th>
				<th colspan="3">Operation</th>
			</tr>
			<c:forEach items="${list}" var="ob">
				<tr>
					<td>${ob.purId}</td>
					<td>${ob.purCode}</td>
					<td>${ob.shpObjCode.shipCode}</td>
					<td>${ob.whUserObjV.whuserCode}</td>
					<td>${ob.purRefNo}</td>
					<td>${ob.purQua}</td>
					<td>${ob.purSts}</td>
					<td>${ob.purDesc}</td>
					<td><a href="delete?pid=${ob.purId}">Delete</a></td>
					<td><a href="edit?pid=${ob.purId}">Edit</a></td>
					<td><a href="view?pid=${ob.purId}">View</a></td>
				</tr>
			</c:forEach>
		</table>
		${msg}
	</form>
</body>
</html>