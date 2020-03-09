<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	<form:form action="save" method="POST" modelAttribute="whUserType">
		<H3>
			<I>WELCOME TO WHUSER PAGES !!</I>
		</H3>
		<pre>
<b>
User Type:  <form:radiobutton path="whuserType" value="Vendor" />Vendor    <form:radiobutton
					path="whuserType" value="Customer" />Customer<br><br>
User Code:   <form:input path="whuserCode" /><br><br>
User For:    <form:input path="whuserFor"/><br><br>
User Email:  <form:input path="whuserEmail" /><br><br>
User Contact:<form:input path="whuserCont" /><br><br>
User ID Type:<form:select path="whuserIdType">
<form:option value="">--select--</form:option>
<form:option value="PanCard">PanCard</form:option>
<form:option value="ADHARCard">ADHARCard</form:option>
<form:option value="PassPort">PassPort</form:option>
<form:option value="VoterCard">VoterCard</form:option>
<form:option value="OTHER">OTHER</form:option>
</form:select><br><br>
*If Other:  <form:input path="whuserIfOther" /><br><br>
ID Number:  <form:input path="whuserIdNum"/><br><br>

<input type="submit" value="Register"> <a href="all">DisplayAllData</a><br>
${msgs}
</b>
		</pre>
	</form:form>
</body>
</html>