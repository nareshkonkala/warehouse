<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item Data Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome to Item Data Page</h3>
			</div>
			<div class="card-body ">
				<table class="table table-border table-hover">
					<thead>
						<tr class="bg-dark text-white">
							<th scope="col">ID</th>
							<th scope="col">CODE</th>
							<th scope="col">WIDTH</th>
							<th scope="col">LENGTH</th>
							<th scope="col">HEIGHT</th>
							<th scope="col">BASE-COST</th>
							<th scope="col">BASE-CURRENCY</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${item.id}</td>
							<td>${item.itemCode}</td>
							<td>${item.itemWidth}</td>
							<td>${item.itemLength}</td>
							<td>${item.itemHeight}</td>
							<td>${item.itemCost}</td>
							<td>${item.baseCurrency}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="card-footer row bg-success text-white ">
				<div class="col-4"></div>
				<div class="col-2">
					<a href="regi" class="btn btn-danger"> Registration</a>
				</div>
				<div class="col-2">
					<a href="viewAll" class="btn btn-danger float-right"> View All</a>
				</div>
			</div>
			<div class="col-4"></div>
		</div>
	</div>
</body>
</html>