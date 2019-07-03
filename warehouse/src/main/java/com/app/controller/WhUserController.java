package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.WhUserType;
import com.app.service.WhUserService;

@Controller
@RequestMapping("/whuser")
public class WhUserController {
	
	@Autowired
	private WhUserService service;
	
	@RequestMapping("/regi")
	public String showRegister( @ModelAttribute WhUserType whUserType,Model map) {
		
		map.addAttribute("whUserType",new WhUserType());
		return "WhUserRegistrantion";
		
	}
	
	@RequestMapping("/save")
	public String saveWhUser(@ModelAttribute WhUserType whUserType,Model map ) {
		Integer id=service.saveWhUser(whUserType);
		map.addAttribute("msg","Successfully '"+id+"' Record Saved");
		map.addAttribute("whUserType",new WhUserType());
		return "WhUserRegistrantion";
	}
	
	@RequestMapping("/viewAll")
	public String viewWhUserData(Model map) {
		List<WhUserType> whobj=service.gerAllWhUsers();
		map.addAttribute("list",whobj);
		return "WhUserData";
	}
	
	@RequestMapping("/edit")
	public String editOneWhUser(@ModelAttribute WhUserType whUserType,@RequestParam Integer id,Model map) {
		WhUserType whobs=service.gerOneWhUser(id);
		map.addAttribute("whobs",whobs);
		return "WhUserEdit";
		
	}
	
	@RequestMapping("/delete")
	public String deleteWhUser(@RequestParam Integer id,Model map) {
		service.deleteWhUser(id);
		map.addAttribute("msg","Successfully '"+id+"' record deleted");
		return "redirect:viewAll";
		
	}
	@RequestMapping("/update")
	public String updateWhUser(@ModelAttribute WhUserType whUserType,Model map ) {
		service.updateWhUser(whUserType);
		map.addAttribute("msg","Successfully '"+whUserType.getId()+"' updated");
		
		return "redirect:viewAll";
	}
	@RequestMapping("/viewOne")
	public String viewOneWhUser(@RequestParam Integer id,Model map) {
		WhUserType whobj=service.gerOneWhUser(id);
		map.addAttribute("whobj",whobj);
		return "WhUserView";
		
	}

}
