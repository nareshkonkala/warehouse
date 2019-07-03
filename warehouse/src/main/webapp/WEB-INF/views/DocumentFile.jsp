<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Document Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"> 
<link href="../WEB-INF/lib/css/bootstrap.css">
</head>
<body>
	<div class="container ">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-6 mt-5 h3 text-success">Welcome to Document
				Upload Page!!</div>
			<div class="col-2"></div>
		</div>
		<form class="mt-3" action="upload" method="post"
			enctype="multipart/form-data">
		
			<br>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-2">
					<label for="doc">Document :</label>
				</div>
				<div class="col-4">
					<input type="file" class="form-control" name="multipartFile"
						id="doc" />
				</div>
				<div class="col-2"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-4"></div>
				<div class="col-4">
					<input type="submit" class="btn btn-secondary" value="UPLOAD">
				</div>
				<div class="col-4"></div>
			</div>
		</form>
		<hr>

		<div class="row">
			<div class="col-2"></div>
			<div class="col-6">
				<div class="card-header bg-primary text-white">
					<div class="text-center h3">Uploaded Documents</div>
				</div>
				<table class="table table-border table-hover">

					<tr>
						<th scope="col">FILE NAME</th>
						<th scope="col">LINK</th>

					</tr>
					<c:forEach items="${list}" var="obj">
						<tr>
							<td><c:out value="${obj[1]}" /></td>
							<td><a href="download?fileId=${obj[0]}"><img
									alt="DOWNLOAD" src="../resources/images/download.png"
									width="50" height="50"></a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<div class="col-2"></div>
</body>
</html>