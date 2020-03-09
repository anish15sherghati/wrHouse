<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Uom</title>

<style>
h3 {
	background-color: green;
	color: white
}
</style>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgreen">
	<H3>WELCOME TO UOM REGISTER PAGE !!</H3>
	<form:form action="save" method="POST" modelAttribute="uom">
		<pre>
		 <b>
Uom Type:
<form:select path="uomType">
	<form:option value="">--Select--</form:option>
	<form:option value="Packing">Packing</form:option>
	<form:option value="NOPacking">No Packing</form:option>
	<form:option value="NA">--NA--</form:option>
</form:select><br>
Uom Model:
<form:input path="uomModel" /><br>
Uom Desc:
<form:textarea path="UomDesc" /><br>
<input type="submit" value="UomCreate" />
</b>
</pre>
	</form:form>
	<br>${msg}
	<br>
	<a href="all">DisplayAll</a>
</body>
</html>