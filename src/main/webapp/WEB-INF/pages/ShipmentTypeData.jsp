<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to shipment records</title>
</head>

<body bgcolor="lightgreen">
<H3>WELCOME TO SHIPMENT DATA'S PAGES !!</H3>
<a href="excel">Excel Export</a>
<a href="pdf">Pdf Export</a>

<c:choose>
<c:when test="${!empty lists}">
<table border=1 >
	<tr>
		<th>ID</th>
		<th>Mode</th>
		<th>Code</th>
		<th>ENABLE</th>
		<th>GRADE</th>
		<th>NOTE</th>
		<th colspan="3">Operation</th>
	</tr>
<c:forEach items="${lists}" var="ob">

	<tr>
		<td>${ob.shipId}</td>
		<td>${ob.shipMode}</td>
		<td>${ob.shipCode}</td>
		<td>${ob.enabShip}</td>
		<td>${ob.shipGrade}</td>
		<td>${ob.shipDesc}</td>
		<td><a href="delete?sid=${ob.shipId}"><img src="../resources/images/delete.jpg" width="40" height="30"/></a></td>
		<td><a href="edit?sid=${ob.shipId}"><img src="../resources/images/edit.jpg" width="40" height="30"/></a></td>
		<td><a href="view?sid=${ob.shipId}"><img src="../resources/images/view.png" width="40" height="30"/></a></td>
	</tr>
</c:forEach>	
</table>
</c:when>

<c:otherwise>NO DATA</c:otherwise>
</c:choose>
${msg}
</body>
</html>