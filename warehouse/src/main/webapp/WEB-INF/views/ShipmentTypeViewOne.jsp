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
					<h3>Welcome to ShipmentType View Page</h3>
				</div>
				<div class="card-body ">
					<table class="table table-border table-hover">
  						<thead >
						    <tr class="bg-dark text-white">
						   	  <th scope="col">ID</th>
						      <th scope="col">MODE</th>
						      <th scope="col">CODE</th>
						      <th scope="col">STATUS</th>
						      <th scope="col">GRADE</th>
						      <th scope="col">NOTE</th>
						      <th scope="col" colspan="2">OPARATIONS</th>
						      
						    </tr>
						 </thead>
						  <tbody>
						    <tr>
						      <td>${shipmentType.stId}</td>
						      <td>${shipmentType.stMode}</td>
						      <td>${shipmentType.stCode}</td>
						      <td>${shipmentType.enableShipment}</td>
						      <td>${shipmentType.stGrade}</td>
						      <td>${shipmentType.stNote}</td>
						      <th><a href="delete?id=${shipmentType.stId}" class="btn btn-danger">DELETE</a></th>
							  <th><a href="edit?id=${shipmentType.stId}" class="btn btn-success">EDIT</a></th>
							  <%-- <td><a href="view?id=${ShipmentType.stId}" class="btn btn-danger"> VIEW</a></td> --%>
						    </tr>
						  </tbody>
					</table>
				</div>
				<div class="card-footer bg-success text-white ">
					<h3 class="center"></h3>
					<a href="all" class="btn btn-danger"> View All</a>
				</div>
			</div>
		</div>	
</body>
</html>