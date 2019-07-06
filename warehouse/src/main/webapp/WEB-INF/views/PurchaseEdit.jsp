<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-6">
				<div class="h3 text-success ">Welcome to the Purchase Page</div>
			</div>
		</div>
		<br>
		<form:form action="save" method="POST" modelAttribute="purchase">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="purchaseId">Order ID : </form:label>
				</div>
				<div class="col-4">
					<form:input path="purchaseId" class="form-control" value="${purchase.purchaseId}" readonly="true" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="purCode">Order Code : </form:label>
				</div>
				<div class="col-4">
					<form:input path="purCode" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="shtOb.stId">Shipment Code :</form:label>
				</div>
				<div class="col-4">
					<form:select path="shtOb.stId" class="form-control" >
						<form:option value="">--SELECT--</form:option>
						<form:options items="${shtypes}" itemLabel="stCode" itemValue="stId"/>
					</form:select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="whuOb.id">Vendor :</form:label>
				</div>
				<div class="col-4">
					<form:select path="whuOb.id" class="form-control" >
						<form:option value="">--SELECT--</form:option>
						<form:options items="${whtypes}" itemLabel="whCode" itemValue="id"/>
					</form:select>
				</div>
			</div>
			<br> 
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="refNum">Reference Number : </form:label>
				</div>
				<div class="col-4">
					<form:input path="refNum" class="form-control" />
				</div>
			</div>
				<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="quality">Quality Check : </form:label>
				</div>
				<div class="col-2">
					<form:radiobutton path="quality" value="Required"  />Required
				</div>
				<div class="col-2">
					<form:radiobutton path="quality" value="Not Required"  />NOt Required
				</div>
			</div>
			<br>
			 <br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="status">Default Status : </form:label>
				</div>
				<div class="col-4">
					<form:input path="status" class="form-control" value="Open" readonly="true" />
				</div>
			</div>
			 <br>
			 <div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="note">Description : </form:label>
				</div>
				<div class="col-4">
					<form:textarea path="note" class="form-control" />
				</div>
			</div>
			 <br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-4">
					<input type="submit" class="btn btn-primary" value="PLACE ORDER" />
				</div>
				<div class="col-4">
					<a class="btn btn-primary ml-5" href="viewAll"> View All</a>
				</div>
				<div class="col-2"></div>
			</div>
			<div class="row mt-3">
				<div class="col-3"></div>
				<div class=" h4 text-success">${msg}</div>
			</div>
		</form:form>
	</div>
</body>
</html>