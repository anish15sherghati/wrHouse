<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to selected view SaleOrder Data!!</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<td>${saleOrder.salId}</td>
		</tr>
		<tr>
			<th>Code</th>
			<td>${saleOrder.salCode}</td>
		</tr>
		<tr>
			<th>ShipCode</th>
			<td>${saleOrder.shipObj.shipCode}</td>
		</tr>
		<tr>
			<th>Refernce</th>
			<td>${saleOrder.salRefNo}</td>
		</tr>
		<tr>
			<th>Mode</th>
			<td>${saleOrder.stockMode}</td>
		</tr>
		<tr>
			<th>Source</th>
			<td>${saleOrder.stockSource}</td>
		</tr>
		<tr>
			<th>Status</th>
			<td>${saleOrder.salStatus}</td>
		</tr>
		<tr>
			<th>Desc</th>
			<td>${saleOrder.salDesc}</td>
		</tr>
		
	</table>
</body>
</html>