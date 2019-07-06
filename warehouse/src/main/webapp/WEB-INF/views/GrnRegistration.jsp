<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GRN Registration Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-6">
				<div class="h3 text-success ">Welcome to the GRN Registration
					Page</div>
			</div>
		</div>
		<br>
		<form:form action="save" method="POST" modelAttribute="grn">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="grnCode">Grn Code : </form:label>
				</div>
				<div class="col-4">
					<form:input path="grnCode" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="grnType">Grn Type : </form:label>
				</div>
				<div class="col-4">
					<form:input path="grnType" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="ordObj.orderId">Order Code :</form:label>
				</div>
				<div class="col-4">
					<form:select path="ordObj.orderId" class="form-control" name="type">
						<form:option value=" ">--SELECT--</form:option>
						<form:options items="${orders}" itemLabel="orderCode" itemValue="orderId"/>
					</form:select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="note">Description : </form:label>
				</div>
				<div class="col-4">
					<form:textarea path="note" class="form-control" name="note" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-4">
					<input type="submit" class="btn btn-primary" value="CREATE GRN" />
				</div>
				<div class="col-4">
					<a href="viewAll" class="btn btn-danger"> View All</a>
				</div>
				<div class="col-2"> </div>
			</div>
			<div class="row">
				<div class="col-4"></div>
				<div class="col-4 text-success">${msg}</div>
				<div class="col-4"></div>
			</div>
		</form:form>
	</div>
</body>
</html>