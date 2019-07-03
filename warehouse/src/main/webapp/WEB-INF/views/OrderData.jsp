<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Data Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-4"><a href="charts">CHARTS</a></div>
			<div class="col-4">
				<a class="mr-2" href="excel"> <img src="../resources/images/excel.png" height="60" width="60"></a>
				<a class="ml-2" href="pdf"> <img src="../resources/images/pdf.png" height="50" width="40"></a>
			</div>
			<div class="col-2"></div>
		</div>
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome to Order Data Page</h3>
			</div>
			<div class="card-body ">
				<table class="table table-border table-hover">

					<tr>
						<th scope="col">ID</th>
						<th scope="col">MODE</th>
						<th scope="col">CODE</th>
						<th scope="col">TYPE</th>
						<th scope="col">ACCEPT</th>
						<th scope="col" colspan="3">OPERATIONS</th>
					</tr>
					<c:forEach items="${list}" var="obj">
						<tr>
							<td><c:out value="${obj.orderId}" /></td>
							<td><c:out value="${obj.orderMode}" /></td>
							<td><c:out value="${obj.orderCode}" /></td>
							<td><c:out value="${obj.orderType}" /></td>
							<td><c:out value="${obj.orderAccept}" /></td>
							<th><a href="delete?id=${obj.orderId}" class=""><img src="../resources/images/delete.png" height="50" width="60"></a></th>
							<th><a href="edit?id=${obj.orderId}" class=""><img src="../resources/images/edit.png" height="50" width="50"></a></th>
							<td><a href="viewOne?id=${obj.orderId}" class=""> <img src="../resources/images/search.png" height="50" width="50"></a></td>
							
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="row card-footer bg-success text-white ">
				<div class="col-6"> 
					<div class="h3">${msg} </div>
				</div>
				 <div class="col-6">
				 	<a href="show" class="btn btn-danger float-right mt-2"> REGISTRATION FORM</a>
				 </div>
			</div>
		</div>
	</div>
</body>
</html>