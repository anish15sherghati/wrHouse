<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="excel?wid=${whObj.whuserId}">Excel</a>
<br><br>
<a href="pdf?wid=${whObj.whuserId}">PDF</a><br><br>
	<h3>WELCOME TO SELECTED WHUSERTYPE ID DATA</h3>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Type</th>
				<th>Code</th>
				<th>For</th>
				<th>Email</th>
				<th>Contact</th>
				<th>IdType</th>
				<th>IfOther</th>
				<th>IdNum</th>
			</tr>
	<tr>
		<td>${whObj.whuserId}</td>
		<td>${whObj.whuserType}</td>
		<td>${whObj.whuserCode}</td>
		<td>${whObj.whuserFor}</td>
		<td>${whObj.whuserEmail}</td>
		<td>${whObj.whuserCont}</td>
		<td>${whObj.whuserIdType}</td>
		<td>${whObj.whuserIfOther}</td>
		<td>${whObj.whuserIdNum}</td>
	</tr>
		</table>
</body>
</html>