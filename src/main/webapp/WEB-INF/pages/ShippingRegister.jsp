<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class='container'>

		<div class="card">

			<div class="card-header bg-primary text-white">
				<h2>Welcome to Shipping Register Pages !!</h2>
			</div>

			<div class="card-body">
				<form:form action="save" method="post" modelAttribute="shipping">
					<div class="row">
						<div class="col-4">
							<label for="shipCode"><b>Shipping Code:</b></label>
						</div>
						<div class="col-4">
							<form:input path="shipCode" id="shipCode" />
						</div>
						<div class="col-4" id="shipCodeError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipRefNum"><b>Shipping Ref No: </b></label>
						</div>
						<div class="col-4">
							<form:input path="shipRefNum" />
						</div>
						<div class="col-4" id="shipRefNumError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="courRefNum"><b>Courier Ref num: </b></label>
						</div>
						<div class="col-4">
							<form:input path="courRefNum" id="courRefNum" />
						</div>
						<div class="col-4" id="courRefNumError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="contDetails"><b>Contact Details:</b></label>
						</div>
						<div class="col-4">
							<form:input path="contDetails" id="contDetails" />
						</div>
						<div class="col-4" id="contDetailsError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="salOrder"><b>Sale Order Code: </b></label>
						</div>
						<div class="col-4">
							<form:input path="salOrder" id="salOrder" />
						</div>
						<div class="col-4" id="salOrderError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipDesc"><b>Description: </b></label>
						</div>
						<div class="col-4">
							<form:input path="shipDesc" id="shipDesc" />
						</div>
						<div class="col-4" id="shipDescError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="billAddr"><b>Bill To Address: </b></label>
						</div>
						<div class="col-4">
							<form:textarea path="billAddr" id="billAddr"></form:textarea>
						</div>
						<div class="col-4" id="billAddrError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipAddr"><b>Ship To Address:</b></label>
						</div>
						<div class="col-4">
							<form:textarea path="shipAddr" id="shipAddr"></form:textarea>
						</div>
						<div class="col-4" id="shipAddrError"></div>
					</div>

					<input type="submit" value="Create Shipping"
						class="btn btn-success" />
				</form:form>
			</div>

			<div class="card-footer bg-info text-white"></div>

		</div>
	</div>

</body>
</html>