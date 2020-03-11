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
	<h3>Welcome TO GRN Register Page!!</h3>
	<form:form action="save" method="post" modelAttribute="goodsRNote"><pre>
Grn Code:<form:input path="grnCode" /><br>
Grn Type:<form:input path="grnType" /><br>
Order Type:<form:select path="PurOrderCode.purId">
<form:option value="">-select-</form:option>
<form:options items="${purCodeMap}"/>
</form:select><br>
Description:<form:input path="grnDesc" /><br>
		<input type="submit" value="Create GRN">
	</pre></form:form>
</body>
</html>