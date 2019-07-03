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
import com.app.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@RequestMapping("/regi")
	public String showItem(Model map) {
		map.addAttribute("item",new Item());
		
		return "ItemRegistration";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveItem(@ModelAttribute Item item, Model map) {
		Integer id=service.saveItem(item);
		map.addAttribute("msg","Item '"+id+"' Stored Successfully");
		map.addAttribute("item",new Item());
		
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
		map.addAttribute("list",obs);
		
		return "ItemEdit";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateItem(@ModelAttribute Item item,Model map) {
		
		service.updateItem(item);
		map.addAttribute("msg","Updated '"+item.getId()+"' Successfully..!!");
		return "redirect:viewAll";
	}
}
