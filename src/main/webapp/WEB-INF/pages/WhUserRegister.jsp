<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-
Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous">
	
</script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-
KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	<div class='container'>
		<div class='card'>
			<div class='card-header bg-primary text-white padding'>
				<h3>WELCOME TO WHUSER REGISTER PAGE !!</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="post" modelAttribute="whUserType">
					<div class="row">
						<div class="col-4">
							<label for="whuserType"><b>User Type</b></label>
						</div>
						<div class="col-4">
							<form:radiobutton path="whuserType" value="Vendor" />
							<b>Vendor</b>
							<form:radiobutton path="whuserType" value="Customer" />
							<b>Customer</b>
						</div>
						<div class="col-4" id="whuserTypeError"></div>
					</div>
					<br>

					<div class="row">
						<div class="col-4">
							<label for="whuserCode">User Code</label>
						</div>
						<div class="col-4">
							<form:input path="whuserCode" class="form-control" />
						</div>
						<div class="col-4" id="whuserCodeError"></div>
					</div>
					<br>

					<div class="row">
						<div class="col-4">
							<label for="whuserFor">User For</label>
						</div>
						<div class="col-4">
							<form:input path="whuserFor" class="form-control" />
						</div>
						<div class="col-4" id="whuserForError"></div>
					</div>
					<br>

					<div class="row">
						<div class="col-4">
							<label for="whuserEmail">User Email</label>
						</div>
						<div class="col-4">
							<form:input path="whuserEmail" class="form-control" />
						</div>
						<div class="col-4" id="whuserEmailError"></div>
					</div>
					<br>

					<div class="row">
						<div class="col-4">
							<label for="whuserCont">User Contact</label>
						</div>
						<div class="col-4">
							<form:input path="whuserCont" class="form-control" />
						</div>
						<div class="col-4" id="whuserContError"></div>
					</div>
					<br>

					<div class="row">
						<div class="col-4">
							<label for="whuserIdType">User ID Type:</label>
						</div>
						<div class="col-4">
							<form:select path="whuserIdType" id="whuserIdType">
								<form:option value="">--select--</form:option>
								<form:option value="PanCard">PanCard</form:option>
								<form:option value="ADHARCard">ADHARCard</form:option>
								<form:option value="PassPort">PassPort</form:option>
								<form:option value="VoterCard">VoterCard</form:option>
								<form:option value="OTHER">OTHER</form:option>
							</form:select>
						</div>
						<div class="col-4" id="whuserIdTypeError"></div>
					</div>
					<br>

					<div class="row">
						<div class="col-4">
							<label for="whuserIfOther">*If Other's</label>
						</div>
						<div class="col-4">
							<form:input path="whuserIfOther" />
						</div>
						<div class="col-4" id="whuserIfOtherError"></div>
					</div>
					<br>

					<div class="row">
						<div class="col-4">
							<label for="whuserIdNum">ID Number</label>
						</div>
						<div class="col-4">
							<form:input path="whuserIdNum" />
						</div>
						<div class="col-4" id="whuserIfNumError"></div>
					</div>
					<br>
					<div class="row">
						<div class="col-4">
							<input type="submit" value="Register" id="register"
								class="btn btn-success" />
						</div>
						<div class="col-4">
							<a href="all">DisplayAllWhUserTypeData's</a><br>
						</div>
					</div>
				</form:form>
			</div>
			<div class="card-footer bg-info text-white"></div>

		</div>
	</div>

	<script>
		$(document).ready(function() {
			$("#whuserCodeError").hide();

		});

		var whuserCodeError = false;

		$("#whuserCodeError").keyup(function() {
			validate_whuserCodeError();
		});

		function validate_whuserCodeError() {
			var val = ("#whuserCode").val();
			if (val == '') {
				$("#whuserCodeError").show();
				$("#whuserCodeError").html("please, enter <b>whuser Code </b>");
				$("#whuserCodeError").css("color", "red");
				whuserCodeError = false;
			} else {
				$("#whuserCodeError").hide();
				whuserCodeError = true;
			}
			return whuserCodeError;
		}
	</script>

</body>
</html>