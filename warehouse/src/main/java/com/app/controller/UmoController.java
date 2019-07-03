package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Umo;
import com.app.service.IUmoService;

@Controller
@RequestMapping("/umo")
public class UmoController {
	@Autowired
	private IUmoService service;
		

	@SuppressWarnings("unused")
	@RequestMapping("/regi")
	public String showUmoForm(@ModelAttribute("umoregi") Umo u,ModelMap map) {

		map.addAttribute("umo",u);

		return "UomRigister";	
	}

	@RequestMapping(value = "/send", method = RequestMethod.POST )
	public String insertDataUmoRegiPage(@ModelAttribute Umo umo ,ModelMap map ) {
		
		service.saveUmo(umo);
		map.addAttribute("umo",umo);
		return "UmoData";

	}

	/*
	 * @RequestMapping(value = "/send", method = RequestMethod.POST ) public String
	 * insertDataUmoRegiPage(@ModelAttribute Umo umo ,ModelMap map ,Errors errors) {
	 * 
	 * String str=new String(); validator.validate(umo, errors);
	 * 
	 * if(errors.hasErrors()) { str="UomRigister"; }else {
	 * map.addAttribute("umo",umo); service.saveUmo(umo); str="UmoData"; }
	 * 
	 * return str;
	 * 
	 * }
	 */
	@RequestMapping("/all")
	public String showAllRecords(ModelMap map) {
		
		List<Umo> objs=service.getAllUmos();
		map.addAttribute("list",objs);
		return "UmoViewData";
	}
	@RequestMapping("/delete")
	public String deleteUmoData(@RequestParam Integer id,ModelMap map) {
		
		service.deleteUmo(id);
		List<Umo> objs=service.getAllUmos();
		map.addAttribute("list",objs);
		map.addAttribute("msg","Successfully deleted '"+id+"' Recodrd");
		return "UmoViewData";
	}
	@RequestMapping("/edit")
	public String editUmo(@RequestParam Integer id,ModelMap map,@ModelAttribute("umoregi") Umo u) {
		Umo ob=service.getOneUmo(id);
		map.addAttribute("umo",ob);
		map.addAttribute("u",u);
		return "UmoEdit";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String deleteUmoOneRecord(ModelMap map,@ModelAttribute Umo umo) {
		
		service.updateUmo(umo);
		List<Umo> umo1=service.getAllUmos();
		map.addAttribute("list",umo1);
		map.addAttribute("msg","Successfully '"+umo.getUmoId()+"' Updated");
		
		return "UmoViewData";
	}
	

}
