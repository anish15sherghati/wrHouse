<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H3>WELCOME TO SHIPMENT EDIT PAGES</H3>
<form:form action="update" method="POST" modelAttribute="stObj">
<pre>
<b>
ShipmentType Id:<form:input path="shipId" readonly="true"/>
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
				<form:option value="">--Select--</form:option>
				<form:option value="Yes">Yes</form:option>
				<form:option value="No">No</form:option>	
				</form:select><br>				
Shipment Grade:	
<form:radiobutton path="shipGrade" value="A"/>A
<form:radiobutton path="shipGrade" value="B"/>B
<form:radiobutton path="shipGrade" value="C"/>C
<br>
Description:	<form:textarea path="shipDesc"></form:textarea>
<input type="submit" value="Update SHIPMENT"/>			
</b>
</pre>
</form:form>

</body>
</html>