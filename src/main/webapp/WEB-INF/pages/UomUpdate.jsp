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
<H3>WELCOME TO UPDATE PAGES!!</H3>
<form:form action="update" method="POST" modelAttribute="uom">
Shipment Id:
<form:input path="uomId" readonly="true"/><br>
Shipment Mode:
<form:input path="uomType"/><br>
Shipment Code:
<form:input path="uomModel"/><br>
Shipment Description:
<form:textarea path="uomDesc"/><br>
<input type="submit" value="Update"/>
</form:form>


</body>
</html>