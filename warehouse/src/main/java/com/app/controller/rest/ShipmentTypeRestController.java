package com.app.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;

@RestController
@RequestMapping("/rest/shipment")
public class ShipmentTypeRestController {
	
	@Autowired
	private IShipmentTypeService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		
		ResponseEntity<?> res=null;
		List<ShipmentType> st=service.getAllShipmentTypes();
		
		if(st != null && !st.isEmpty()) {
			res=new ResponseEntity<List<ShipmentType>>(st, HttpStatus.OK);
		}else {
			res=new ResponseEntity<String>("Records not Found...!!!",HttpStatus.BAD_REQUEST);
		}
		
		return res;
		
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOne(@PathVariable Integer id){
		
		ResponseEntity<?> res=null;
		ShipmentType st=service.getOneShipmentType(id);
		
		if(st !=null) {
			res=new ResponseEntity<ShipmentType>(st,HttpStatus.OK);
		}else {
			res=new ResponseEntity<String>("Record'"+id+"'is not Found", HttpStatus.BAD_REQUEST);
		}
		return res;
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		
		ResponseEntity<String> res=null;
		
		try{
			service.deleteShipmentType(id);
			res=new ResponseEntity<String>("Record '"+id+"'deleted successfully",HttpStatus.OK);
		}catch (Exception e) {
			res=new ResponseEntity<String>("Record '"+id+"' Not Found",HttpStatus.BAD_REQUEST);
			e.printStackTrace();
		}
		return res;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody ShipmentType shipmentType){
		
		Integer id=service.saveShipmentType(shipmentType);
		return new ResponseEntity<String>("Successfull '"+id+"' Redcord inserted",HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateData(@RequestBody ShipmentType shipmentType){
		ResponseEntity<String> res=null;
		try {
			service.updateShipmentType(shipmentType);
			res=new ResponseEntity<String>("Updated record success fully",HttpStatus.OK);
		}catch(Exception e) {
			res=new ResponseEntity<String>("Record Not Found",HttpStatus.BAD_REQUEST);
		}
		return res;
	}

}
