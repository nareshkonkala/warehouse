package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Grn;
import com.app.model.Order;
import com.app.service.GrnService;
import com.app.service.IOrderService;

@Controller
@RequestMapping("/grn")
public class GrnController {

	@Autowired
	private GrnService service;
	
	@Autowired
	private IOrderService ordService;

	@RequestMapping("/regi")
	public String showRegi(@ModelAttribute Grn grn, Model map) {
		map.addAttribute("grn", new Grn());
		List<Order> orders=ordService.getAllOrders();
		map.addAttribute("orders",orders);
		return "GrnRegistration";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGrnData(@ModelAttribute Grn grn, Model map) {
		Integer id = service.saveGrn(grn);
		map.addAttribute("grn", new Grn());
		map.addAttribute("msg","Successfully '"+id+"' inserted");
		
		return "GrnRegistration";
	}

	@RequestMapping("/viewAll")
	public String viewAllGrn(Model map) {
		List<Grn> list=service.getAllGrns();
		map.addAttribute("list",list);
		return "GrnViewData";
	}
	@RequestMapping("/delete")
	public String deleteGrn(@RequestParam Integer id, Model map) {

		service.deleteGrn(id);
		map.addAttribute("msg","Deleted '"+id+"'Successfully");
		List<Grn> list=service.getAllGrns();
		map.addAttribute("list",list);
		return "GrnViewData";
	}
	
	@RequestMapping("/edit")
	public String editGrn(@RequestParam Integer id,Model map) {
		
		Grn grn=service.gerOneGrn(id);
		map.addAttribute("grn",grn);
		
		List<Order> orders=ordService.getAllOrders();
		map.addAttribute("orders",orders);
		
		return "GrnEdit";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateGrnData(@ModelAttribute Grn grn , Model map) {
		service.updateGrn(grn);
		map.addAttribute("msg","Successfully '"+grn.getGrnId()+"' updated");
		List<Grn> list=service.getAllGrns();
		map.addAttribute("list",list);
		
		return "GrnViewData";
	}
	
	@RequestMapping("/view")
	public String viewOneGrn(@RequestParam Integer id,Model map) {
		
		Grn grn=service.gerOneGrn(id);
		map.addAttribute("grn",grn);
		
		
		return "GrnData";
	}
}
