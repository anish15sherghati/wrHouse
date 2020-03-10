<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Width</th>
			<th>Length</th>
			<th>Height</th>
			<th>UomModel</th>
			<th>OrderMethodSCode</th>
			<th>OrderMethodPCode</th>
			<th>BaseCost</th>
			<th>Note</th>
			<th colspan="3">Operation</th>
		</tr>

		<c:forEach items="${list}" var="ob">
			<tr>
				<td>${ob.partId}</td>
				<td>${ob.partCode}</td>
				<td>${ob.partWidth}</td>
				<td>${ob.partLength}</td>
				<td>${ob.partHeight}</td>
				<td>${ob.uomObj.uomModel}</td>
				<td>${ob.ordSaleOb.ordCode}</td>
				<td>${ob.ordPurOb.ordCode}</td>
				<td>${ob.partBcost}</td>
				<td>${ob.partDesc}</td>

				<td><a href="view?pid=${ob.partId}">View</a></td>
				<td><a href="delete?pid=${ob.partId}">Delete</a></td>
				<td><a href="edit?pid=${ob.partId}">Edit</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>