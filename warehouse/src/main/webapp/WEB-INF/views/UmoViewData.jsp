<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Umo Show All Data page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Welcome to Umo Data Page</h3>
			</div>
			<div class="card-body ">
				<table class="table table-border table-hover">

					<tr>
						<th scope="col">ID</th>
						<th scope="col">TYPE</th>
						<th scope="col">MODEL</th>
						<th scope="col">NOTE</th>
						<th scope="col" colspan="2">OPERATIONS</th>
					</tr>
					<c:forEach items="${list}" var="obj">
						<tr>
							<td><c:out value="${obj.umoId}" /></td>
							<td><c:out value="${obj.umoType}" /></td>
							<td><c:out value="${obj.umoModel}" /></td>
							<td><c:out value="${obj.note}" /></td>
							<th><a href="delete?id=${obj.umoId}" class="btn btn-danger">DELETE</a></th>
							<th><a href="edit?id=${obj.umoId}" class="btn btn-success">EDIT</a></th>
							<%-- <td><a href="view?id=${obj.umoId}" class="btn btn-info"> VIEW</a></td> --%>
							
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class=" row card-footer bg-success text-white ">
				<div class="col-6"> 
					<div class="h3">${msg} </div>
				</div>
				 <div class="col-6">
				 	<a href="regi" class="btn btn-danger float-right mt-2"> REGISTRATION FORM</a>
				 </div>
			</div>
		</div>
	</div>
</body>
</html>