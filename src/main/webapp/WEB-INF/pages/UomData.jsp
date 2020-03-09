<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<title>UomData</title>
<style>
h2{
background-color:black;
color:white;
}
</style>
<script >Wanted to See All Data's</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">

<h2>Welcome to All Data Pages !!</h2>
<form action="all" method="GET">
<table border="1">
	<tr>
		<th>Id</th>
		<th>Type</th>
		<th>Model</th>
		<th>Description</th>
		<th colspan="3">Operation</th>
	</tr>
	<c:forEach items="${lists}" var="ob">
	
	<tr >
			<td>${ob.uomId}</td>
			<td>${ob.uomType }</td>
			<td>${ob.uomModel}</td>
			<td>${ob.uomDesc}</td>
			<td><a href="delete?uid=${ob.uomId}">Delete</a></td>
			<td><a href="edit?uid=${ob.uomId}">Edit</a></td>
			<td><a href="view?uid=${ob.uomId}">View</a></td>
			
	</tr>
	</c:forEach>
	
</table>
${msg}
</form>
<a href="excel">Excel Data</a>
<a href="pdf">PDF Data</a>
</body>
</html>