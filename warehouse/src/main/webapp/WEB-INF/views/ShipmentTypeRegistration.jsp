<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Shipment Type Register Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
			<div class="card">
  				<div class="card-header bg-primary text-white">
    				<h3>Welcome to Shipment Register Page</h3>
  				</div>
  				
  				<div class="card-body ">
    				<form action="send" method="POST" >
  						<div class="row">
  							<div class="col-4 form-group">
    							<label for="smode">Shipment Mode</label>
    						</div>
    						<div class="col-6">
   								<select class="form-control" id="smode" name="stMode">
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
  								<input type="text" class="form-control" id="scode" name="stCode">
  							</div>	
  						</div>
  				
  						<div class="row">
  							<div class="col-4">
  								<label class="" for="enable">Enable Shipment</label>
  							</div>
  							<div class="col-6">
      							<select class="custom-select mr-sm-2" id="enable" name="enableShipment">
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
  						<div class="col-4" >
  							<div class="form-check form-check-inline">
  								<input class="form-check-input" type="radio" name="stGrade" id="gradeA" value="A" name="stGrade">
  								<label class="form-check-label" for="gradeA">A</label>
							</div>
							<div class="form-check form-check-inline">
  								<input class="form-check-input" type="radio" name="stGrade" id="gradeB" value="B" name="stGrade">
  								<label class="form-check-label" for="gradeB">B</label>
							</div>
							<div class="form-check form-check-inline">
  								<input class="form-check-input" type="radio" name="stGrade" id="gradeC" value="C" name="stGrade">
  								<label class="form-check-label" for="gradeC">C</label>
								</div>
  						</div>
  						
  					</div>
  					<div class="row form-group">
  						<div class="col-4">
  							<label for="note">Description</label>
  						</div>
  						<div class="col-6">
  							<textarea class="form-control" id="note" rows="3" name="stNote"></textarea>
  						</div>
    				</div>
    				<div class="row">
    					<div class="col-4"></div>
    					<div class="col-4">
    						<input type="submit" class="btn btn-primary" value="CREATE SHIPMENT" />
    					</div>
    					<div class="col-4"><a href="all" class="btn btn-danger"> View All</a></div>
    				</div>
				</form>
  				</div>
  				<div class="card-footer bg-success text-white">
    				<h3>Successfully Registered</h3>
    				
  				</div>
			</div>
		</div>
</body>
</html>