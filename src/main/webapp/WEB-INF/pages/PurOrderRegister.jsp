<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary">
				<h3>WELCOME TO PURCHASE_ORDER REGISTER PAGE!!</h3>
			</div>

			<div class="card-body">
				<form:form method="post" action="save"
					modelAttribute="purchaseOrder">

					<div class="row">
						<div class="col-4">
							<label for="purCode"><b>Order Code: </b> </label>
						</div>
						<div class="col-4">
							<form:input path="purCode" id="purCode" />
						</div>
						<div class="col-4" id="purCodeError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shpObjCode.shipId"><b>Shipment Code: </b></label>
						</div>
						<div class="col-4">
							<form:select path="shpObjCode.shipId">
								<form:option value="">-select-</form:option>
								<form:options items="${listShipCode}" />
							</form:select>
						</div>
						<div class="col-4" id="shpObjCodeshipIdError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="whUserObjV.whuserId"><b>WhUserVend Code:</b></label>
						</div>
						<div class="col-4">
							<form:select path="whUserObjV.whuserId">
								<form:option value="">-select-</form:option>
								<form:options items="${venCodeMap}" />
							</form:select>
						</div>
						<div class="col-4" id="whUserObjVwhuserIdError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="purRefNo"><b> Reference Number:</b></label>
						</div>
						<div class="col-4">
							<form:input path="purRefNo" id="purRefNo"/>
						</div>
						<div class="col-4" id="purRefNoError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="purQua"><b>Quality Check:</b></label>
						</div>
						<div class="col-4">
							<form:radiobutton path="purQua" value="Required" id="purQua" />
							Required
							<form:radiobutton path="purQua" value="Not Required" id="purQua" />
							Not Required
						</div>
						<div class="col-4" id="purQuaError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="purSts"><b>Default Status:</b></label>
						</div>
						<div class="col-4">
							<form:input id="purStsError" path="purSts" readonly="true" />
						</div>
						<div class="col-4" id="purStsError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="purDesc"><b> Description: </b></label>
						</div>
						<div class="col-4">
							<form:textarea path="purDesc" id="purDesc" />
						</div>
						<div class="col-4" id="purDescError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<input type="submit" value="ProceedMyOrder"
								class="btn btn-success" />
						</div>
						   <div class="col-4">${msg}</div>
						   <div class="col-4">
							<a href="all" class="btn btn-success">AllPurChase</a>
						   </div>
					</div>
		
				</form:form>
			</div>
			<div class="card-footer bg-info"></div>

		</div>
	</div>
</body>
</html>