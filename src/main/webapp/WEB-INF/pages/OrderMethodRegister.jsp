<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<!-- <head>
<meta charset="ISO-8859-1">
<title>OrderMethod</title>
<style>
h3 {
	backgroundcolor: white;
	color: blue;
}
</style>
</head> -->
<body bgcolor="orange">
	<H3>WELCOME TO METHOD ORDER REGISTER PAGES !!</H3>
	<form:form action="save" method="POST" modelAttribute="orderMethod">
		<pre>
<b>
Order Mode:  <form:radiobutton path="ordMode" value="Sale" />Sale   <form:radiobutton
					path="ordMode" value="Purchase" />Purchase
<br>
Order Code:  <form:input path="ordCode" />
<br>
Order Method:<form:select path="ordMethod">
			<form:option value="">-select-</form:option>
			<form:option value="FIFO">FIFO</form:option>
			<form:option value="LIFO">LIFO</form:option>
			<form:option value="FCFO">FCFO</form:option>
			<form:option value="FEFO">FEFO</form:option>
			</form:select>
<br>
Order Accept:<form:checkbox path="ordAccept" value="Multi-Model" />Multi-Model   <form:checkbox path="ordAccept" value="Accept Return" />Accept Return
<br>
Description:<form:textarea path="ordDesc"></form:textarea>
<br>
         <input type="submit" name="Create Order Method">
<br>
			</b>
</pre>
	</form:form>
	${msg}

</body>
</html>