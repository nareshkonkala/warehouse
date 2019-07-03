<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<h3>Welcome to Shipment Edit Register Page</h3>
			</div>

			<div class="card-body ">
				<form action="update" method="POST">
					<div class="row form-group">
						<div class="col-4">
							<label for="shipId">Shipment ID</label>
						</div>
						<div class="col-6">
							<input type="text" class="form-control" name="stId" id="shipId" value="${shipmentType.stId}" readonly >
						</div>
					</div>
					<div class="row">
						<div class="col-4 form-group">
							<label for="smode">Shipment Mode</label>
						</div>
						<div class="col-6">
							<select class="form-control" id="smode" name="stMode" >
								<option value="">-SELECT-</option>
								<option value="AIR">Air</option>
								<option value="TRUCK">Truck</option>
								<option value="SHIP">Ship</option>
								<option value="TRAIN">Train</option>
							</select>
						</div>
					</div>

					<div class="row form-group">
						<div class="col-4">
							<label for="scode">Shipment Code</label>
						</div>
						<div class="col-6">
							<input type="text" class="form-control" name="stCode" id="scode" value="${shipmentType.stCode}" readonly="readonly">
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label class="" for="enable">Enable Shipment</label>
						</div>
						<div class="col-6">
							<select class="custom-select mr-sm-2" name="enableShipment" id="enable" >
								<option selected>Choose..</option>
								<option value="YES">Yes</option>
								<option value="NO">No</option>
							</select>
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="scode">Shipment Grade</label>
						</div>
						<div class="col-4">
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="stGrade"
									id="gradeA" value="A"> <label
									class="form-check-label" for="gradeA">A</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="stGrade"
									id="gradeB" value="B"> <label
									class="form-check-label" for="gradeB">B</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="stGrade"
									id="gradeC" value="C"> <label
									class="form-check-label" for="gradeC">C</label>
							</div>
						</div>
					</div>
					<div class="row form-group">
						<div class="col-4">
							<label for="note">Description</label>
						</div>
						<div class="col-6">
							<textarea class="form-control" name="stNote" id="note" rows="3" ></textarea>
						</div>
					</div>
					<div class="row">
						<div class="col-4"></div>
						<div class="col-4">
							<input type="submit" class="btn btn-primary"
								value="UPDATE" />
						</div>
						<div class="col-4"></div>
					</div>
				</form>
			</div>
			<div class="card-footer bg-success text-white">
				<h3>Successfully Edited</h3>
			</div>
		</div>
	</div>
</body>
</html>