<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Umo Edit Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">


		<div class="row">
			<div class="col-2"></div>
			<div class="col-6">
				<div class="h3 text-success ">Welcome to the UMO EDIT
					Page</div>
			</div>
		</div>
		<br>
		<form:form action="update" method="POST" modelAttribute="umoregi">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="umoId">Umo Id : </form:label>
				</div>
				<div class="col-4">
					<form:input path="umoId" class="form-control" value="${umo.umoId}"  readonly="true"/>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="umoType">Umo Type :</form:label>
				</div>
				<div class="col-4">
					<form:select path="umoType" class="form-control">
						<form:option value=" ">--SELECT--</form:option>
						<form:option value="PACKING">PACKING</form:option>
						<form:option value="NO-PAKING">NO-PAKING</form:option>
						<form:option value="-NA-">-NA-</form:option>
					</form:select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="umoModel">Umo Model : </form:label>
				</div>
				<div class="col-4">
					<form:input path="umoModel" class="form-control" value="${umo.umoModel}" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="note">Description : </form:label>
				</div>
				<div class="col-4">
					<form:textarea path="note" class="form-control" value="${umo.note}" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-4">
					<input type="submit" class="btn btn-primary" value="UPDATE" />
				</div>

				<div class="col-4">
					<a href="all" class="btn btn-danger"> View All</a>
				</div>
				<div class="col-2"></div>
			</div>
		</form:form>
	</div>
</body>
</html>