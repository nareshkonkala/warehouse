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
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome to Order Data Page</h3>
			</div>
			<div class="card-body ">
				<table class="table table-border table-hover">
					<thead>
						<tr class="bg-dark text-white">
							<th scope="col">ID</th>
							<th scope="col">MODE</th>
							<th scope="col">CODE</th>
							<th scope="col">TYPE</th>
							<th scope="col">ACCEPT</th>
							<th scope="col">NOTE</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${list.orderId}</td>
							<td>${list.orderMode}</td>
							<td>${list.orderCode}</td>
							<td>${list.orderType}</td>
							<td>${list.orderAccept}</td>
							<td>${list.note}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="card-footer row bg-success text-white ">
				<div class="col-4"></div>
				<div class="col-2">
					<a href="show" class="btn btn-danger"> Registration</a>
				</div>
				<div class="col-2">
					<a href="viewall" class="btn btn-danger float-right"> View All</a>
				</div>
			</div>
			<div class="col-4"></div>
		</div>
	</div>
</body>
</html>