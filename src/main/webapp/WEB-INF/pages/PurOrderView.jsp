<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Selected view Data!!</h3>
<table border="1">
<tr>
<th>Id</th><td>${purchaseOrder.purId}</td>
</tr>
<tr>
<th>Code</th><td>${purchaseOrder.purCode}</td>
</tr>
<tr>
<th>RefernceNumber</th><td>${purchaseOrder.purRefNo}</td>
</tr>
<tr>
<th>Quantity</th><td>${purchaseOrder.purQua}</td>
</tr>
<tr>
<th>Status</th><td>${purchaseOrder.purSts}</td>
</tr>
<tr>
<th>Desc</th><td>${purchaseOrder.purDesc}</td>
</tr>
</table>

</body>
</html>