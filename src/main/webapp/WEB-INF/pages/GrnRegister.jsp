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
	<div class="container">

		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome TO GRN Register Page!!</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="post" modelAttribute="goodsRNote">

					<div class="row">
						<div class="col-4">
							<label for="grnCode"><b>Grn Code:</b></label>
						</div>
						<div class="col-4">
							<form:input path="grnCode" />
						</div>
						<div class="col-4" id="grnCodeError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="grnType"><b>Grn Type: </b></label>
						</div>
						<div class="col-4">
							<form:input path="grnType" />
						</div>
						<div class="col-4" id="grnTypeError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="PurOrderCode.purId"><b>Order Type:</b></label>
						</div>
						<div class="col-4">
							<form:select path="PurOrderCode.purId">
								<form:option value="">-select-</form:option>
								<form:options items="${purCodeMap}" />
							</form:select>
						</div>
						<div class="col-4" id="PurOrderCode.purIdError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="grnDesc"><b>Description:</b></label>
						</div>
						<div class="col-4"><form:input path="grnDesc" /></div>
						<div class="col-4" id="grnDesc"></div>
					</div>

					<div class="row">
						<div class="col-8">
							<input type="submit" value="Create GRN" class="btn btn-success">
						</div>
						<div class="col-4"></div>
						
					</div>
				</form:form>
			</div>

			<div class="card-footer bg-info"></div>
		</div>
	</div>
</body>
</html>