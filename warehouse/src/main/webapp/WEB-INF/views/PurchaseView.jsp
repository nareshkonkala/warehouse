<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase Data Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome to Purchase Data Page</h3>
			</div>
			<div class="card-body ">
				<table class="table table-border table-hover">
					<thead>
						<tr class="bg-dark text-white">
							<th >ID</th>
							<th >CODE</th>
							<!-- <th >SHIPMENT CODE</th>
							<th >VENDORE</th> -->
							<th >REF-NUM</th>
							<th >QUALITY</th>
							<th >STATUS</th>
							<th >NOTE</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${purchase.purchaseId}</td>
							<td>${purchase.purCode}</td>
							<%-- <td>${purchase.itemWidth}</td>
							<td>${purchase.itemLength}</td> --%>
							<td>${purchase.refNum}</td>
							<td>${purchase.quality}</td>
							<td>${purchase.status}</td>
							<td>${purchase.note}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="card-footer row bg-success text-white ">
				<div class="col-4"></div>
				<div class="col-2">
					<a href="purchaseorder" class="btn btn-danger"> ORDER FORM</a>
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