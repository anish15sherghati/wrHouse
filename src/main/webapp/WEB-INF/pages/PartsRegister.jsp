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
	<h3>WELCOME TO PARTS_REGISTER PAGE!!</h3>
	<form:form action="save" method="Post" modelAttribute="parts">
		<pre>
	Code:     <form:input path="partCode" /><br>
	width:    <form:input path="partWidth" />  <br>
	Length:   <form:input path="partLength" /> <br> 
	Height:   <form:input path="partHeight" /> <br>
	Base Cost:<form:select path="partBcost">
			 <form:option value="">-select-</form:option>
			<form:option value="INR">INR</form:option>
			<form:option value="USD">USD</form:option>
			<form:option value="AUS">AUS</form:option>
			<form:option value="ERU">ERU</form:option>
			  </form:select><br>
	Uom Model :     <form:select path="uomObj.uomId">
	<form:option value="">-select-</form:option>
	<form:options items="${uomModel}" />
	</form:select>	<br>
	OrderMethod Mode:<form:select path="ordSaleOb.ordId">
	<form:option value="">-select-</form:option>
	<form:options items="${OrdModelS}" />
	</form:select>    <form:select path="ordSaleOb.ordId">
	<form:option value="">-select-</form:option>
	<form:options items="${OrdModelP}" />
	            </form:select>
	            <br>
	Description:<form:textarea path="partDesc" /><br>
		<input type="submit" value="Create">
	</pre>
	</form:form>
	${msg}
</body>
</html>