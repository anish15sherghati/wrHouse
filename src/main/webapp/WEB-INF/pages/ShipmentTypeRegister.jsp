<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<h3>WELCOME TO SHIPMENT TYPE REGISTER</h3>
<form:form action="save" method="POST" modelAttribute="shipmentType">
<pre>
<b>
Shipment Mode:
<form:select path="shipMode">
				<form:option value="">--Select--</form:option>
				<form:option value="Train">Train</form:option>
				<form:option value="Air">Air</form:option>
				<form:option value="Truck">Truck</form:option>
				<form:option value="Ship">Ship</form:option>
</form:select>
Shipment Code:<form:input path="shipCode"/><br>				
Enable Shipment:
<form:select path="enabShip">
				<form:option value="--Select--">--Select--</form:option>
				<form:option value="Yes">Yes</form:option>
				<form:option value="No">No</form:option>	
				</form:select><br>				
Shipment Grade:	
<form:radiobutton path="shipGrade" value="A"/>A
<form:radiobutton path="shipGrade" value="B"/>B
<form:radiobutton path="shipGrade" value="C"/>C
<br>
Description:	<form:textarea path="shipDesc"></form:textarea>
<input type="submit" value="CREATE SHIPMENT"/>			
</b>
</pre>
</form:form>
${msg}


</body>
</html>