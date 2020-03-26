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
				<h3>WELCOME TO PARTS_REGISTER PAGE!!</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="Post" modelAttribute="parts">

					<div class="row">
						<div class="col-4">
							<label for="partCode"><b>Code: </b></label>
						</div>
						<div class="col-4">
							<form:input path="partCode" id="partCode" />
						</div>
						<div class="col-4" id="partCode"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partWidth"><b>width:</b></label>
						</div>
						<div class="col-4">
							<form:input path="partWidth" id="partWidth" />
						</div>
						<div class="col-4" id="partWidth"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partLength"><b>Length: </b></label>
						</div>
						<div class="col-4">
							<form:input path="partLength" id="partLength" />
						</div>
						<div class="col-4" id="partLength"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partHeight"><b>Height: </b></label>
						</div>
						<div class="col-4">
							<form:input path="partHeight" />
						</div>
						<div class="col-4" id="partHeight"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partBcost"><b>Base Cost: </b></label>
						</div>
						<div class="col-4">
							<form:select path="partBcost">
								<form:option value="">-select-</form:option>
								<form:option value="INR">INR</form:option>
								<form:option value="USD">USD</form:option>
								<form:option value="AUS">AUS</form:option>
								<form:option value="ERU">ERU</form:option>
							</form:select>
						</div>
						<div class="col-4" id="partBcost"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="uomObj.uomId"><b>Uom Model : </b></label>
						</div>
						<div class="col-4">
							<form:select path="uomObj.uomId">
								<form:option value="">-select-</form:option>
								<form:options items="${uomModel}" />
							</form:select>
						</div>
						<div class="col-4" id="uomObj.uomId"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="ordSaleOb.ordId"><b>OrderMethod SCode:</b></label>
						</div>
						<div class="col-4">
							<form:select path="ordSaleOb.ordId">
								<form:option value="">-select-</form:option>
								<form:options items="${ordCodeS}" />
							</form:select>
						</div>
						<div class="col-4" id="ordSaleObordIdError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="ordPurOb.ordId"><b>OrderMethod PCode:</b></label>
						</div>
						<div class="col-4">
							<form:select path="ordPurOb.ordId">
								<form:option value="">-select-</form:option>
								<form:options items="${ordCodeP}" />
							</form:select>
						</div>
						<div class="col-4" id="ordPurOb.ordId"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partDesc"><b>Description:</b></label>
						</div>
						<div class="col-4">
							<form:textarea path="partDesc" />
						</div>
						<div class="col-4" id="partDesc"></div>
					</div>
					<input type="submit" value="Create" class="btn btn-success">

				</form:form>
			</div>
			<div class="card-footer bg-info"></div>
		</div>
	</div>
</body>
</html>