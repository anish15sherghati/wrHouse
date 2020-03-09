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
	<h1>Welcome to Edit/Update Of SaleOrder !!</h1>
	
	<form:form method="get" action="update" modelAttribute="saleOrder">
	SaleOrderId:	<form:input path="salId"/><br>
Order Code:<form:input path="salCode" />
<br>
Shipment Code:<form:select path="shipObj.shipId">
<form:option value="">-select-</form:option>
<form:options items="${list}" />
</form:select>
<br>
Ref Number:  <form:input path="salRefNo" />
<br>
Stock Mode:  <form:radiobutton path="stockMode" value="Grade" />Grade   <form:radiobutton
				path="stockMode" value="Margin" />Margin
<br>
Stock Source:<form:select path="stockSource">
<form:option value="">-select-</form:option>
<form:option value="Open">Open</form:option>
<form:option value="Avail">Avail</form:option>
<form:option value="Refund">Refund</form:option>
</form:select>
<br>
Default status:<form:input path="salStatus" readonly="readOnly" />
<br>
Description:  <form:textarea path="salDesc" />
<br>
<input type="submit" value="Update" />

	</form:form>
</body>
</html>