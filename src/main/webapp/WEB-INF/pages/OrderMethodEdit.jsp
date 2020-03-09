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
	<h3>WELCOME TO ORDER EDIT PAGE!!</h3>
	<form:form action="update" method="POST" modelAttribute="ob">
		<pre>
Order Id:	<form:input path="ordId" value="${ob.ordId}" readonly="true" />
Order Mode:	<form:radiobutton path="ordMode" value="Sale" />Sale <form:radiobutton
				path="ordMode" value="Purchase" />Purchase
Order Code: <form:input path="ordCode" />
Order Method:<form:select path="ordMethod">
<form:option value="-select-">Select</form:option>
<form:option value="FIFO">FIFO</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FEFO">FEFO</form:option>
<form:option value="FCFO">FCFO</form:option>

</form:select>          
Order Accept:<form:checkbox path="ordAccept" value="Multi-Model"/>Multi-Model <form:checkbox path="ordAccept" value="Accept Return"/>Accept Return
Description:<form:textarea path="ordDesc"/>
          
          
            <input type="submit" value="Update" />
	</pre>
	</form:form>

</body>
</html>