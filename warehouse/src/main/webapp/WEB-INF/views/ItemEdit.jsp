<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item Edit Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-6">
				<div class="h3 text-success ">Welcome to the Item Edit Page</div>
			</div>
		</div>
		<br>
		<form:form action="update" method="POST" modelAttribute="item">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="id">Item ID : </form:label>
				</div>
				<div class="col-4">
					<form:input path="id" class="form-control" value="${item.id}" readonly="true"/>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="itemCode">Item Code : </form:label>
				</div>
				<div class="col-4">
					<form:input path="itemCode" class="form-control" value="${item.itemCode}" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					Item Dimentions : 
				</div>
				<div class="col-4">
				<div class="row">
				<div class="col-4">
					<form:input path="itemWidth" class="form-control" value="${item.itemWidth}" placeholder="Width"/>
				</div>
				<div class="col-4">
					<form:input path="itemLength" class="form-control" value="${item.itemLength}" placeholder="Length" />
				</div>
				<div class="col-4">
					<form:input path="itemHeight" class="form-control" value="${item.itemHeight}" placeholder="Height"/>
				</div>
				</div>
				</div>
				<!-- <div class="col-4"></div> -->
			</div><br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="itemCost">Base Cost : </form:label>
				</div>
				<div class="col-4">
					<form:input path="itemCost" class="form-control" value="${item.itemCost}"/>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<form:label path="baseCurrency">Base Currency :</form:label>
				</div>
				<div class="col-4">
					<form:select path="baseCurrency" class="form-control" >
						<form:option value="">--SELECT--</form:option>
						<form:option value="INR">INR</form:option>
						<form:option value="USD">USD</form:option>
						<form:option value="AUD">AUD</form:option>
						<form:option value="ERO">ERO</form:option>
					</form:select>
				</div>
			</div>
			<br>
		
			<div class="row">
				<div class="col-2"></div>
				<div class="col-4"></div>
				<div class="col-4">
					<input type="submit" class="btn btn-primary" value="UPDATE ITEM" />
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