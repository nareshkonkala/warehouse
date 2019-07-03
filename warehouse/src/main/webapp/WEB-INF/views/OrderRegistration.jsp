<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Registration Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-6">
				<div class="h3 text-success ">Welcome to the Order
					Registration Page</div>
			</div>
		</div>
		<br>
		<form:form action="save" method="POST" modelAttribute="order">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="orderMode">Order Mode : </form:label>
				</div>
				<div class="col-4">
					<form:radiobutton path="orderMode" value="sale" />
					Sale
					<form:radiobutton path="orderMode" value="purchase" />
					Purchase
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="orderCode">Order Code : </form:label>
				</div>
				<div class="col-4">
					<form:input path="orderCode" class="form-control" name="model" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="orderType">Execute Type :</form:label>
				</div>
				<div class="col-4">
					<form:select path="orderType" class="form-control" name="type">
						<form:option value=" ">--SELECT--</form:option>
						<form:option value="FICO">FICO</form:option>
						<form:option value="LIFO">LIFO</form:option>
						<form:option value="FCFO">FCFO</form:option>
						<form:option value="FEFO">FEFO</form:option>
					</form:select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="orderAccept">Order Accept : </form:label>
				</div>
				<div class="col-4">
					<form:checkbox path="orderAccept" class="form-control"
						value="Multi Model" />
					<span>Multi Model</span>
					<form:checkbox path="orderAccept" class="form-control"
						value="Accept Return" />
					Accept Return
					<form:checkbox path="orderAccept" class="form-control"
						value="Service Exted" />
					Service Exted
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
					<input type="submit" class="btn btn-primary" value="CREATE" />
				</div>

				<div class="col-4">
					<div class="h4">${msg}</div>
					<a class="btn btn-primary " href="viewall"> View All</a>
				</div>
				<div class="col-2"></div>
			</div>
		</form:form>
	</div>
</body>
</html>