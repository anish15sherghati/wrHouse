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
<h3>WELCOME TO SELECTED PRUCHASE TO EDIT PAGE</h3>
<form:form action="update" method="post" modelAttribute="purchaseOrder">
<pre>
Purchase Id:<form:input path="purId"  readonly="true"/>
Order Code:  <form:input path="purCode" />
Shipment Code:   <form:select path="shpObjCode.shipId">
	<form:option value="">-select-</form:option>
	<form:options items="${listShipCode}"/>
	</form:select><br>
Reference Number:<form:input path="purRefNo" />
Quality Check:   <form:radiobutton path="purQua" value="Required" />Required  <form:radiobutton
				path="purQua" value="Not Required" />Not Required
Default Status:  <form:input path="purSts" />
Description:     <form:textarea path="purDesc" />


<input type="submit" value="UPDATE"/>


</pre>
</form:form>
</body>
</html>