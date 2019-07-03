package com.app.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
import com.app.util.ShipmentTypeUtil;
import com.app.view.ShipmentTypeExcelView;
import com.app.view.ShipmentTypePdfView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	
	@Autowired
	private ServletContext context;
	
	@Autowired
	private ShipmentTypeUtil util;
//	#1
	@RequestMapping("/regi")
	public String showRegisterForm() {
		
		return "ShipmentTypeRegistration";
	}
	
//	#2
	  @RequestMapping(value = "/send" , method = RequestMethod.POST)
	  public String showDataPage(@ModelAttribute("shipmentType") ShipmentType shtype, ModelMap map) {
	  
		  service.saveShipmentType(shtype);
		  map.addAttribute("shType",shtype);
		  return "ShipmentTypeData"; 
	  }
	  
//	  #3
	 @RequestMapping("/all")
	 public String getAllShipment(ModelMap map) {
		 List<ShipmentType> ob=service.getAllShipmentTypes();
		 map.addAttribute("list",ob);
		 
		 return "ShipmentTypeData1";
	 }
//	 #4
	 @RequestMapping("/delete")
	 public String deleteShipment(@RequestParam Integer id,ModelMap map) {
		 service.deleteShipmentType(id);
		 List<ShipmentType> obs=service.getAllShipmentTypes();
		 map.addAttribute("list",obs);
		 map.addAttribute("msg","Shipment type "+id+"delete successfully");
		return "ShipmentTypeData1";
		 
	 }
	 
//	 #5
	 @RequestMapping(value = "/edit")
	 public String editShipmentType(@RequestParam Integer id,ModelMap map) {
		 
		 ShipmentType st=service.getOneShipmentType(id);
		 map.addAttribute("shipmentType",st);
		 
		 return "ShipmentTypeEditForm";
	 }
	 
//	 #6
	 @RequestMapping(value = "/update", method = RequestMethod.POST )
	 public String updateShipmentType(@ModelAttribute ShipmentType shipmentType,ModelMap map) {
		 
		service.updateShipmentType(shipmentType); 
		List<ShipmentType> st=service.getAllShipmentTypes();
		map.addAttribute("list",st);
		map.addAttribute("msg","Successfully '"+shipmentType.getStId()+"' Updated");
		return "ShipmentTypeData1";
		 
	 }
//	 #7
	 @RequestMapping("/view")
	 public String showOneRecord(@RequestParam Integer id,ModelMap map) {
		 
		 ShipmentType st=service.getOneShipmentType(id);
		 map.addAttribute("shipmentType",st);
		 
		 return "ShipmentTypeViewOne";
	 }
		 
//	#8
	 @RequestMapping("/excel")
	 public ModelAndView showExcel(@RequestParam(value = "id",required = false)Integer id) {
		 ModelAndView m=new ModelAndView();
		 m.setView(new ShipmentTypeExcelView());
		 
		 if(id!=null) {
			 ShipmentType s=service.getOneShipmentType(id);
			 m.addObject("list",Arrays.asList(s));
		 }else{
			 List<ShipmentType> obs=service.getAllShipmentTypes();
			 m.addObject("list",obs);
		 }
		 
		 return m;
	 }
	 
//	 #9
	 @RequestMapping("/pdf")
	 public ModelAndView showPdf() {
		 
		 ModelAndView m=new ModelAndView();
		 List<ShipmentType> obs=service.getAllShipmentTypes();
		 m.setView(new ShipmentTypePdfView());
		 
		 m.addObject("list",obs);
		return m;
		 
	 }
//	 #10
	 @RequestMapping("/charts")
	 public String generateCharts() {
		 String path=context.getRealPath("/");
		 List<Object[]> list=service.getShipmentTypeModeCount();
		 util.generatePie(path, list);
		 util.generateBar(path, list);
		 
		 return "ShipmentTypeCharts";
	 }
}
