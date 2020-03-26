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
<body bgcolor="green">
	<div class="container bg-green">
		<div class="card">
			<div class="card-header bg-primary text-white padding ">
				<h3>Welcome To ShipmentType Register Page!!</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="POST" modelAttribute="shipmentType">
					<div class="row">
						<div class="col-4">
							<label for="shipMode"><b>Shipment Mode:</b></label>
						</div>
						<div class="col-4">
							<form:select path="shipMode" id="shipMode">
								<form:option value="">--Select--</form:option>
								<form:option value="Train">Train</form:option>
								<form:option value="Air">Air</form:option>
								<form:option value="Truck">Truck</form:option>
								<form:option value="Ship">Ship</form:option>
							</form:select>
						</div>
						<div class="col-4" id="shipModeError"></div>
					</div>
					
					<div class="row">
						<div class="col-4">
							<label for="shipCode"><b>Shipment Code:</b></label>
						</div>
						<div class="col-4">
							<form:input id="shipCode" path="shipCode" />
							<br>
						</div>
						<div class="col-4" id="shipCodeError"></div>
					</div>
					
					<div class="row">
						<div class="col-4">
							<label for="enabShip"><b>Enable Shipment:</b></label>
						</div>
						<div class="col-4">
							<form:select path="enabShip">
								<form:option value="--Select--">--Select--</form:option>
								<form:option value="Yes">Yes</form:option>
								<form:option value="No">No</form:option>
							</form:select>
							
						</div>
						<div class="col-4" id="enabShipError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipGrade"><b> Shipment Grade: </b></label>
						</div>
						<div class="col-4">
							<form:radiobutton path="shipGrade" value="A" />
							A
							<form:radiobutton path="shipGrade" value="B" />
							B
							<form:radiobutton path="shipGrade" value="C" />
							C <br>
						</div>
						<div class="col-4" id="shipGradeError"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipDesc"><b>Description:</b></label>
						</div>
						<div class="col-4">
							<form:textarea path="shipDesc"></form:textarea>
							<br>
						</div>
						<div class="col-4" id="shipDescError"></div>
					</div>

					<input type="submit" value="CREATE SHIPMENT" class="btn btn-success" />
				</form:form>
			</div>
			<div class="card-footer bg-info text-white"></div>
		</div>
	</div>
</body>
</html>