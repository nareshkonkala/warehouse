package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Order;
import com.app.service.IOrderService;
import com.app.view.OrderExcelDocument;
import com.app.view.OrderPdfDocument;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private IOrderService service;

	@RequestMapping("/show")
	public String showOrderForm(Model m) {
		
		m.addAttribute("order",new Order());
		
		return "OrderRegistration";
		
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveOrder(@ModelAttribute Order order,Model m) {
		
		service.saveOrder(order);
		m.addAttribute("msg","Successfully register order");
		m.addAttribute("order",new Order());
		
		return "OrderRegistration";
	}
	
	@RequestMapping("/viewall")
	public String viewAllRecords(Model m) {
		
		List<Order> obs=service.getAllOrders();
		m.addAttribute("list",obs);
		
		return "OrderData";
	}
	@RequestMapping("/viewOne")
	public String viewOneRecord(@RequestParam Integer id,Model m) {
		Order obs=service.getOneOrder(id);
		m.addAttribute("list",obs);
		
		return "OrderView";
		
	}
	
	@RequestMapping("/delete")
	public String deleteRecord(@RequestParam Integer id,Model m) {
		System.out.println("From delete block");
		service.deleteOrder(id);
		List<Order> obs=service.getAllOrders();
		m.addAttribute("list",obs);
		m.addAttribute("msg","Delete '"+id+"'Record Successfully");
		
		return "OrderData";
	}
	
	@RequestMapping("/edit")
	public String viewFullData(@RequestParam Integer id,Model m) {
		
		Order ob=service.getOneOrder(id);
		m.addAttribute("order",ob);
		
		return "OrderEdit";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String  modifyData(@ModelAttribute Order o,Model m) {
		
		service.updateOrder(o);
		List<Order> obs=service.getAllOrders();
		m.addAttribute("list",obs);
		m.addAttribute("msg","Record Updated Successfully");
		
		return "OrderData";
	}
	
	 @RequestMapping("/pdf")
	 public ModelAndView downloadOrderPdf() {
		 
		 ModelAndView m=new ModelAndView();
		 List<Order> obs=service.getAllOrders();
		 m.setView(new OrderPdfDocument());
		 
		 m.addObject("list",obs);
		return m;
		 
	 }
	 
	 @RequestMapping("/excel")
	 public ModelAndView downloadOrderExcel() {
		 
		 ModelAndView m=new ModelAndView();
		 List<Order> obs=service.getAllOrders();
		 m.setView(new OrderExcelDocument());
		 
		 m.addObject("list",obs);
		return m;
		 
	 }
	 
	
}
