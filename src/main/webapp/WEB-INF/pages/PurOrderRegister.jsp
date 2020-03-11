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
	<h3>WELCOME TO PURCHASE_ORDER REGISTER PAGE!!</h3>
	<form:form method="post" action="save" modelAttribute="purchaseOrder">
		<pre>
Order Code:      <form:input path="purCode" /><br>
Shipment Code:   <form:select path="shpObjCode.shipId">
	<form:option value="">-select-</form:option>
	<form:options items="${listShipCode}"/>
	</form:select><br>
WhUserVend Code:<form:select path="whUserObjV.whuserId">
<form:option value="">-select-</form:option>
<form:options items="${venCodeMap}"/>
</form:select><br>
Reference Number:<form:input path="purRefNo" /><br>
Quality Check:   <form:radiobutton path="purQua" value="Required" />Required  <form:radiobutton
				path="purQua" value="Not Required" />Not Required  <br>
Default Status:  <form:input path="purSts" readonly="true"/><br>
Description:     <form:textarea path="purDesc" /><br>
<input type="submit" value="ProceedMyOrder"/>
</pre>	</form:form>
${msg}
<a href="all">AllPurChase</a>	
</body>
</html>