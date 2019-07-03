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
							<th scope="col">TYPE</th>
							<th scope="col">CODE</th>
							<th scope="col">FOR</th>
							<th scope="col">EMAIL</th>
							<th scope="col">CONTACT</th>
							<th scope="col">ID-TYPE</th>
							<th scope="col">ID-NUM</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${whobj.id}</td>
							<td>${whobj.whType}</td>
							<td>${whobj.whCode}</td>
							<td>${whobj.whFor}</td>
							<td>${whobj.whEmail}</td>
							<td>${whobj.whcontact}</td>
							<td>${whobj.whIdType}</td>
							<td>${whobj.whIdNum}</td>
							
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