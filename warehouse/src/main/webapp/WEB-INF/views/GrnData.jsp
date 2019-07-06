<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GRN Data page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome to GRN Data Page</h3>
			</div>
			<div class="card-body ">
				<table class="table table-border table-hover">
					<thead>
						<tr class="bg-dark text-white">
							<th scope="col">CODE</th>
							<th scope="col">TYPE</th>
							<th scope="col">ORDER CODE</th>
							<th scope="col">DESECRIPTION</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${grn.grnCode}</td>
							<td>${grn.grnType}</td>
							<td>${grn.ordObj.orderCode}</td>
							<td>${grn.note}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="card-footer bg-success text-white ">
				<a href="viewAll" class="btn btn-danger"> View All</a>
			</div>
		</div>
	</div>
</body>
</html>