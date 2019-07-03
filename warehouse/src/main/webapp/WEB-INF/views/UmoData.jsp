<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Umo Data page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
			<div class="card">
				<div class="card-header bg-primary text-white">
					<h3>Welcome to Umo Data Page</h3>
				</div>
				<div class="card-body ">
					<table class="table table-border table-hover">
  						<thead >
						    <tr class="bg-dark text-white">
						      
						      <th scope="col">TYPE</th>
						      <th scope="col">MODEL</th>
						      <th scope="col">DESECRIPTION</th>
						     
						      
						    </tr>
						 </thead>
						  <tbody>
						    <tr>
						      
						      <td>${umo.umoType}</td>
						      <td>${umo.umoModel}</td>
						      <td>${umo.note}</td>
						      
						      
						    </tr>
						    
						  </tbody>
					</table>
				</div>
				<div class="card-footer bg-success text-white ">
					<h3 class="center">Successfully Inserted</h3>
					<a href="all" class="btn btn-danger"> View All</a>
				</div>
			</div>
		</div>	
</body>
</html>