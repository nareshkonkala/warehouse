<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WH-User Edit Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-6">
				<div class="h3 text-success ">Welcome to the WH-User Edit Page</div>
			</div>
		</div>
		<br>
		<form:form action="update" method="POST" modelAttribute="whUserType">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="id">User ID : </form:label>
				</div>
				<div class="col-4">
					<form:input path="id" class="form-control" value="${whobs.id}" readonly="true"/>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="whCode">User Code : </form:label>
				</div>
				<div class="col-4">
					<form:input path="whCode" class="form-control" value="${whobs.whCode}"/>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="whFor">User For :</form:label>
				</div>
				<div class="col-4">
					<form:select path="whFor" class="form-control" >
						<form:option value="">--SELECT--</form:option>
						<form:option value="SALE">SALE</form:option>
						<form:option value="PURCHASE">PURCHASE</form:option>
					</form:select>
				</div>
			</div>
			<br>
			
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="whEmail">User Email : </form:label>
				</div>
				<div class="col-4">
					<form:input path="whEmail" class="form-control" value="${whobs.whEmail}"/>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="whcontact">User Contact : </form:label>
				</div>
				<div class="col-4">
					<form:input path="whcontact" class="form-control" value="${whobs.whcontact}"/>
				</div>
			</div>
			<br>	
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="whIdType">User ID Type :</form:label>
				</div>
				<div class="col-4">
					<form:select path="whIdType" class="form-control" >
						<form:option value="">--SELECT--</form:option>
						<form:option value="PAN">PAN</form:option>
						<form:option value="AADHAR">AADHAR</form:option>
						<form:option value="VOTER-ID">VOTER-ID</form:option>
						<form:option value="OTHTER">OTHTER</form:option>
					</form:select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="whIdNum">ID NUM : </form:label>
				</div>
				<div class="col-4">
					<form:input path="whIdNum" class="form-control" value="${whobs.whIdNum}"/>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-4">
					<input type="submit" class="btn btn-primary" value="UPDATE" />
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