<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H3>WELCOME TO FILE UPLOAD IN DB</H3>
	<form action="upload" method="POST" enctype="multipart/form-data">
		<pre>
Doc Id: <input type="text" name="filId" /> <br>
Doc File: <input type="file" name="filOb" /><br> 
<input type="submit" value="Upload" />
</pre>
	</form>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Data</th>
		</tr>
		<c:forEach items="${list}" var="ob">
		<tr>
		<td>${ob[0]}</td>
		<td>${ob[1]}</td>
		<td><a href="download?fid=${ob[0]}">DownLoad</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>