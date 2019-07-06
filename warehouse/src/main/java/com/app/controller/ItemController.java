package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Item;
import com.app.model.Order;
import com.app.model.Umo;
import com.app.service.IOrderService;
import com.app.service.IUmoService;
import com.app.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@Autowired
	private IUmoService umoService;
	
	@Autowired
	private IOrderService orderService;
	
	@RequestMapping("/regi")
	public String showItem(Model map) {
		map.addAttribute("item",new Item());
		
		List<Umo> umos=umoService.getAllUmos();
		map.addAttribute("umos",umos);
		
		List<Order> orders=orderService.getAllOrders();
		map.addAttribute("orders",orders);
		
		return "ItemRegistration";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveItem(@ModelAttribute Item item, Model map) {
		
		Integer id=service.saveItem(item);
		map.addAttribute("msg","Item '"+id+"' Stored Successfully");
		map.addAttribute("item",new Item());
		
		List<Umo> umos=umoService.getAllUmos();
		map.addAttribute("umos",umos);
		
		List<Order> orders=orderService.getAllOrders();
		map.addAttribute("orders",orders);
		
		return "ItemRegistration";
	}
	
	@RequestMapping("/viewAll")
	public String viewAllData(Model map) {
		List<Item> ob=service.getAllItems();
		map.addAttribute("list",ob);
		
		return "ItemData";
	}
	
	@RequestMapping("/delete")
	public String deteteItem(@RequestParam Integer id,Model map) {
		
		service.deleteItem(id);
		List<Item> ob=service.getAllItems();
		map.addAttribute("list",ob);
		map.addAttribute("msg","Deleted '"+id+"' Successfully");
		
		return "ItemData";
	}
	
	@RequestMapping("/viewOne")
	public String viewOneRecord(@RequestParam Integer id,Model map) {
		
		Item obs=service.getOneItemById(id);
		map.addAttribute("item",obs);
		
		return "ItemView";
	}
	@RequestMapping("/edit")
	public String editItem(@RequestParam Integer id,Model map) {
		Item obs=service.getOneItemById(id);
		map.addAttribute("item",obs);
		
		List<Umo> umos=umoService.getAllUmos();
		map.addAttribute("umos",umos);
		
		List<Order> orders=orderService.getAllOrders();
		map.addAttribute("orders",orders);
		
		return "ItemEdit";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateItem(@ModelAttribute Item item,Model map) {
		
		service.updateItem(item);
		map.addAttribute("msg","Updated '"+item.getId()+"' Successfully..!!");
		List<Item> ob=service.getAllItems();
		map.addAttribute("list",ob);
		return "ItemData";
	}
}
