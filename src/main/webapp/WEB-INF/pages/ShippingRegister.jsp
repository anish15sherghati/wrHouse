<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to Shipping Register Pages !!</h2>
	<form:form action="save
	" method="post" modelAttribute="shipping">
		<pre>
	
		Shipping Code:   <form:input path="shipCode" />
			<br>
		Shipping Ref No: <form:input path="shipRefNum" />
			<br>
		Courier Ref num: <form:input path="courRefNum" />
			<br>
		Contact Details: <form:input path="contDetails" />
			<br>
		Sale Order Code: <form:input path="salOrder" />
			<br>
		Description:     <form:input path="shipDesc" />
			<br>
		Bill To Address: <form:textarea path="billAddr" />
			<br>
		Ship To Address: <form:textarea path="shipAddr" />
			<br>
		<input type="submit" value="Create Shipping" />
	</pre>
	</form:form>
</body>
</html>