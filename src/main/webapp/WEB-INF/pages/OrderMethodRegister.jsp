<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OrderMethod</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body bgcolor="orange">
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<H3>WELCOME TO METHOD ORDER REGISTER PAGES !!</H3>
			</div>
			<div class="card-body">
				<form:form action="save" method="POST" modelAttribute="orderMethod">
					<div class="row">
						<div class="col-4">
							<label for="ordMode"><b>Order Mode: </b></label>
						</div>
						<div class="col-4">
							<form:radiobutton path="ordMode" value="Sale" />
							Sale
							<form:radiobutton path="ordMode" value="Purchase" />
							Purchase
						</div>
						<div class="col-4" id="ordMode"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="ordCode"><b>Order Code:</b></label>
						</div>
						<div class="col-4">
							<form:input path="ordCode" />
						</div>
						<div class="col-4" id="ordCode"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="ordMethod"><b>Order Method: </b></label>
						</div>
						<div class="col-4">
							<form:select path="ordMethod">
								<form:option value="">-select-</form:option>
								<form:option value="FIFO">FIFO</form:option>
								<form:option value="LIFO">LIFO</form:option>
								<form:option value="FCFO">FCFO</form:option>
								<form:option value="FEFO">FEFO</form:option>
							</form:select>
						</div>
						<div class="col-4" id="ordMethod"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="ordAccept"><b>Order Accept:</b></label>
						</div>
						<div class="col-4">
							<form:checkbox path="ordAccept" value="Multi-Model" />
							Multi-Model
							<form:checkbox path="ordAccept" value="Accept Return" />
							Accept Return
						</div>
						<div class="col-4" id="ordAccept"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="ordDesc"><b> Description: </b></label>
						</div>
						<div class="col-4">
							<form:textarea path="ordDesc"></form:textarea>
						</div>
						<div class="col-4" id="ordDesc"></div>
					</div>
					
					<div class="row">
						<div class="col-4">
								<input type="submit" name="Create Order Method" class="btn btn-success">
						</div>
						<div class="col-4">
								${msg}
						</div>
					</div>

				</form:form>
			</div>
			<div class="card-footer bg-info">
			</div>
		</div>
	</div>
	
</body>
</html>