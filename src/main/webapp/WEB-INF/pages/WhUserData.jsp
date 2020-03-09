<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightGreen">
	<h1>
		<i>Welcome to WhUserDataPage !!</i>
	</h1>
	<table border="1">
		<tr>
			<th>UId</th>
			<th>UType</th>
			<th>UCode</th>
			<th>UFor</th>
			<th>UEmail</th>
			<th>UContact</th>
			<th>UId</th>
			<th>IfOthers</th>
			<th>UIdNum</th>
			<th colspan="3">Operation</th>
			
			<c:forEach items="${lists}" var="ob">
		<tr>
			<td>${ob.whuserId}</td>
			<td>${ob.whuserType}</td>
			<td>${ob.whuserCode}</td>
			<td>${ob.whuserFor}</td>
			<td>${ob.whuserEmail}</td>
			<td>${ob.whuserCont}</td>
			<td>${ob.whuserIdType}</td>
			<td>${ob.whuserIfOther}</td>
			<td>${ob.whuserIdNum}</td>
			<td><a href="delete?wid=${ob.whuserId}">Delete</a></td>
			<td><a href="view?wid=${ob.whuserId}">View</a></td>
			<td><a href="edit?wid=${ob.whuserId}">Edit</a></td>			
		</tr>

</c:forEach>
		
	</table>
	<br><br>
	<a href="excel">ExcelData</a>
	<a href="pdf">PDFData</a>
</body>
</html>