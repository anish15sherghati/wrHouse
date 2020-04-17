<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="green">
	<%@include file="usermenu.jsp"%>
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
							<label for="whuserFor">User For</label>
						</div>
						<div class="col-4">
							<form:input path="whuserFor" class="form-control" readonly="true"/>
						</div>
						<div class="col-4" id="whuserForError"></div>
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
							<form:select path="whuserIdType" >
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
							<form:input path="whuserIfOther" class="form-control" readonly="true" />
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
							<label for="note"> NOTE</label>
						</div>
						<div class="col-4">
							<form:textarea path="note" class="form-control" />
						</div>
						<div class="col-4" id="noteError"></div>
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
			<div class="card-footer bg-info text-white">
			${msgs}
			</div>

		</div>
	</div>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$("#whuserTypeError").hide();
							$("#whuserCodeError").hide();
							$("#whuserEmailError").hide();
							$("#whuserContError").hide();
							$("#whuserIdTypeError").hide();
							$("#whuserIdNumError").hide();
							$("#noteError").hide();

							var whuserTypeError = false;
							var whuserCodeError = false;
							var whuserEmailError = false;
							var whuserContError = false;
							var whuserIdTypeError = false;
							var whuserIdNumError = false;
							var noteError = false;

							$('input[type="radio"][name="whuserType"]').change(
									function() {
										validate_userType();
										autoFill_userFor();
									});
							$("#whuserCode").keyup(function() {
								validate_userCode();
							});

							$("#whuserEmail").keyup(function() {
								validate_userMail();
							});

							$("#whuserCont").keyup(function() {
								validate_userContact();
							});

							$("#whuserIdType").change(function() {
								validate_idType();
							});

							$("#whuserIdNum").keyup(function() {
								validate_idNum();
							});

							$("#note").keyup(function() {
								validate_note();
							});

							function autoFill_userFor() {
								var val = $(
										'input[type="radio"][name="whuserType"]:checked')
										.val();
								if (val == 'Vendor') {
									$("#whuserFor").val("Purchase");
									$("#whuserFor").css("color", "blue");
								} else if (val == 'Customer') {
									$("#whuserFor").val("Sale");
									$("#whuserFor").css("color", "green");
								}
							}

							function validate_userType() {
								var val = $('input[type="radio"][name="whuserType"]:checked').length;
								//if one radio button is selected then length=1 else length is zero
								if (val == 0) {
									$("#whuserTypeError").show();
									$("#whuserTypeError").html(
											"Please choose <b>User Type</b>");
									$("#whuserTypeError").css("color", "red");
									whuserTypeError = false;
								} else {
									$("#whuserTypeError").hide();
									whuserTypeError = true;
								}
								return whuserTypeError;
							}

							function validate_userCode() {
								var val = $("#whuserCode").val();
								var exp = /^[A-Z]{2,8}$/;
								if (val == '') {
									$("#whuserCodeError").show();
									$("#whuserCodeError").html(
											"Enter <b>WhUser Code</b>");
									$("#whuserCodeError").css("color", "red");
									whuserCodeError = false;
								} else if (!exp.test(val)) {
									$("#whuserCodeError").show();
									$("#whuserCodeError")
											.html(
													"Enter <b>Upper Case (2-8)</b> letters only");
									$("#whuserCodeError").css("color", "red");
									whuserCodeError = false;
								} else {
									$("#whuserCodeError").hide();
									whuserCodeError = true;
								}
								return whuserCodeError;
							}

							function validate_userMail() {
								var val = $("#whuserEmail").val();
								var exp = /^[a-zA-Z0-9-_]+\@[a-zA-Z]{2,8}\.[a-z]{2,6}$/;
								if (val == '') {
									$("#whuserEmailError").show();
									$("#whuserEmailError").html(
											"Enter <b> User Mail</b>");
									$("#whuserEmailError").css("color", "red");
									whuserEmailError = false;
								} else if (!exp.test(val)) {
									$("#whuserEmailError").show();
									$("#whuserEmailError").html(
											"Not a Valid <b> User Mail</b>");
									$("#whuserEmailError").css("color", "red");
									whuserEmailError = false;

								} else {
									$("#whuserEmailError").hide();
									whuserEmailError = true;

								}
								return whuserEmailError;
							}

							function validate_userContact() {
								var val = $("#whuserCont").val();
								var exp = /^(\+91)?[6-9][0-9]{9}$/;
								if (val == '') {
									$("#whuserContError").show();
									$("#whuserContError").html(
											"Enter <b>User Contact</b>");
									$("#whuserContError").css("color", "red");
									whuserContError = false;
								} else if (!exp.test(val)) {
									$("#whuserContError").show();
									$("#whuserContError").html(
											"Invaild <b>User Contact</b>");
									$("#whuserContError").css("color", "red");
									whuserContError = false;
								} else {
									$("#whuserContError").hide();
									whuserContError = true;
								}
								return whuserContError;
							}

							function validate_idType() {
								var val = $("#whuserIdType").val();
								if (val == '') {
									$("#whuserIdTypeError").show();
									$("#whuserIdTypeError").html(
											"Choose <b>ID Type </b>");
									$("#whuserIdTypeError").css("color", "red");
									whuserIdTypeError = false;
								} else {
									$("#whuserIdTypeError").hide();
									whuserIdTypeError = true;

									if (val == 'OTHER') {
										$("#whuserIfOther").attr("readonly", false);
									} else {
										$("#whuserIfOther").val('');
										$("#whuserIfOther").attr("readonly", true);
									}
								}
								return whuserIdTypeError;
							}

							function validate_idNum() {
								var val = $("#whuserIdNum").val();
								var exp = /^[A-Za-z0-9-._]{4,20}$/;
								if (val == '') {
									$("#whuserIdNumError").show();
									$("#whuserIdNumError").html(
											"Enter <b>ID Number</b>");
									$("#whuserIdNumError").css("color", "red");
									idNumError = false;
								} else if (!exp.test(val)) {
									$("#whuserIdNumError").show();
									$("#whuserIdNumError").html(
											"Invaild <b>ID Number</b>");
									$("#whuserIdNumError").css("color", "red");
									whuserIdNumError = false;

								} else {
									$("#whuserIdNumError").hide();
									whuserIdNumError = true;
								}
								return whuserIdNumError;
							}

							function validate_note() {
								var val = $("#note").val();
								if (val == '') {
									$("#noteError").show();
									$("#noteError").html("Enter <b>Note </b>");
									$("#noteError").css("color", "red");
									noteError = false;
								} else {
									$("#noteError").hide();
									noteError = true;
								}
								return noteError;
							}

							// **************on click submit button****************
							$("#register").click(
									function() {
										whuserTypeError = false;
										whuserCodeError = false;
										whuserEmailError = false;
										whuserContError = false;
										whuserIdTypeError = false;
										whuserIdNumError = false;
										noteError = false;

										validate_userType();
										validate_userCode();
										validate_userMail();
										validate_userContact();
										validate_idType();
										validate_idNum();
										validate_note();

										if (whuserTypeError && whuserCodeError
												&& whuserEmailError && whuserContError
												&& whuserIdTypeError && whuserIdNumError
												&& noteError)
											return true;
										else
											return false;

									});
							// ******************  (^^)  **************************

						});
	</script>
</body>
</html>