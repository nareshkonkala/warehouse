package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Purchase;
import com.app.model.ShipmentType;
import com.app.model.WhUserType;
import com.app.service.IShipmentTypeService;
import com.app.service.PurchaseService;
import com.app.service.WhUserService;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService service;
	
	@Autowired
	private IShipmentTypeService shService;
	
	@Autowired
	private WhUserService whService;
	
	@RequestMapping("/purchaseorder")
	public String showPurchaseOrderPage(@ModelAttribute Purchase purchase,Model map) {
		
		map.addAttribute("purchase",purchase);
		List<ShipmentType> shipmentType=shService.getAllShipmentTypes();
		map.addAttribute("shtypes",shipmentType);
		
		List<WhUserType> whUserType=whService.getAllUserType("Vendor");
		map.addAttribute("whtypes",whUserType);
		return "PurchaseRegistration";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String savePurchaseOrder(@ModelAttribute Purchase purchase,Model map) {
		
		Integer id=service.saveOrder(purchase);
		map.addAttribute("purchase",purchase);
		map.addAttribute("purchase",new Purchase());
		map.addAttribute("msg","Successfully '"+id+"'stored order");
		
		
		
		
		return "PurchaseRegistration";
	}
	
	@RequestMapping("/viewAll")
	public String viewAllPurchaseOrders(Model map) {
		
		List<Purchase> purchaseOrders=service.gerAllPurchaseOrders();
		map.addAttribute("list",purchaseOrders);
		return "PurchaseData";
	}
	
	@RequestMapping("/delete")
	public String deletePurchaseOrder(@RequestParam Integer id,Model map) {
		
		service.deletePurchaseOrder(id);
		map.addAttribute("msg","Deleted '"+id+"' PurchaseOrder..!!");
		
		return "redirect:viewAll";
	}
	
	@RequestMapping("/edit")
	public String editPurchaseOrder(@RequestParam Integer id,Model map) {
		
		Purchase purchase=service.getOnePurchaseOrder(id);
		map.addAttribute("purchase",purchase);
		
		List<ShipmentType> shipmentType=shService.getAllShipmentTypes();
		map.addAttribute("shtypes",shipmentType);
		
		List<WhUserType> whUserType=whService.getAllUserType("Vendor");
		map.addAttribute("whtypes",whUserType);
		
		return "PurchaseEdit";
	}
	
	@RequestMapping("/update")
	public String updatePurchaseOrder(@ModelAttribute Purchase purchase,Model map) {
		
		service.updatePurchaseOrder(purchase);
		map.addAttribute("msg","PurchaseOrder '"+purchase.getPurchaseId()+"' updated successfully");
		List<Purchase> purchaseOrders=service.gerAllPurchaseOrders();
		map.addAttribute("list",purchaseOrders);
		return "PurchaseData";
	}
	@RequestMapping("/viewOne")
	public String viewOnePurchaseOrder(@RequestParam Integer id,Model map) {
		
		Purchase purchase=service.getOnePurchaseOrder(id);
		map.addAttribute("purchase",purchase);
		return "PurchaseView";
	}
	

}
