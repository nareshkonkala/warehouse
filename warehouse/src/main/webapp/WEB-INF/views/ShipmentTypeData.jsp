<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
			<div class="card">
				<div class="card-header bg-primary text-white">
					<h3>Welcome to Shipment Data Page</h3>
				</div>
				<div class="card-body ">
					<table class="table table-border table-hover">
  						<thead >
						    <tr class="bg-dark text-white">
						      
						      <th scope="col">MODE</th>
						      <th scope="col">CODE</th>
						      <th scope="col">STATUS</th>
						      <th scope="col">GRADE</th>
						      <th scope="col">NOTE</th>
						      
						    </tr>
						 </thead>
						  <tbody>
						    <tr>
						      
						      <td>${shType.stMode}</td>
						      <td>${shType.stCode}</td>
						      <td>${shType.enableShipment}</td>
						      <td>${shType.stGrade}</td>
						      <td>${shType.stNote}</td>
						      
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