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
			
			<div class="card-header bg-primary text-white">
				<h1>Welcome SaleOrder Register !!</h1>
			</div>

			<div class="card-body ">
				<form:form action="save" method="post" modelAttribute="saleOrder">
				
					<div class="row">
						<div class="col-4"><label for="salCode"><b>Order Code:</b></label></div>
						<div class="col-4"><form:input path="salCode"/></div>	
						<div class="col-4" id="salCodeError"></div>
					</div>
					
					<div class="row">
						<div class="col-4">
								<label for="shipObj.shipId"><b>Shipment Code:</b></label>
							</div>
						<div class="col-4">
                              <form:select path="shipObj.shipId"
									id="shipObj.shipId">
									<form:option value="">-select-</form:option>
									<form:options items="${shipCodeMap}" />
							  </form:select>

							</div>
						<div class="col-4" id="shipObjshipIdError"></div>
					</div>
					
					<div class="row">
						<div class="col-4">
								<label for="whTypeCust.whuserId"><b>Customer Code:</b></label>
						</div>
						<div class="col-4">
								<form:select path="whTypeCust.whuserId">
								<form:option value="">-select-</form:option>
								<form:options items="${custCodeMap}" />
								</form:select>
						</div>
						<div class="col-4" id="whTypeCustwhuserIdError"></div>
					</div>
					
					
					<div class="row">
						<div class="col-4">
								<label for="salRefNo"><b>Ref Number:</b></label>
							</div>
						<div class="col-4">
								<form:input path="salRefNo" id="salRefNo" />
							</div>
						<div class="col-4" id="salRefNoError"></div>
					</div>
					
					
					<div class="row">
						<div class="col-4">
								<label for="stockMode"><b>Stock Mode: </b></label>
							</div>
						<div class="col-4"> <form:radiobutton path="stockMode"
									id="stockMode" value="Grade" />Grade   <form:radiobutton
									path="stockMode" value="Margin" />Margin</div>
						<div class="col-4" id="stockModeError"></div>
					</div>
					
					
					<div class="row">
						<div class="col-4">
								<label for="stockSource"><b>Stock Source:</b></label>
							</div>
						<div class="col-4">
								<form:select path="stockSource" id="stockSource">
									<form:option value="">-select-</form:option>
									<form:option value="Open">Open</form:option>
									<form:option value="Avail">Avail</form:option>
									<form:option value="Refund">Refund</form:option>
								</form:select>
							</div>
						<div class="col-4" id="stockSourceError"></div>
					</div>
					
					<div class="row">
						<div class="col-4">
								<label for="salStatus"><b>Default status:</b></label>
							</div>
						<div class="col-4"><form:input path="salStatus"  id="salStatus" readonly="readOnly" /></div>
						<div class="col-4" id="salStatusError"></div>
					</div>
					
					
					<div class="row"> 
						<div class="col-4"><label for="salDesc"><b>Description:</b></label></div>
						<div class="col-4"><form:textarea path="salDesc" id="salDesc"></form:textarea></div>
						<div class="col-4" id="salDescError"></div>
					</div>
					
					<input type="submit" value="Register" class="btn btn-success"/>
					
				</form:form>		
			</div>
			
			<div class="card-footer bg-info"></div>
		</div>
	</div>


</body>
</html>
