package com.app.validate;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Umo;
import com.app.service.IUmoService;

@Component
public class UmoValidator implements Validator {
	@Autowired
	private IUmoService umoService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Umo.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Umo u=(Umo) target;
		
		if(!StringUtils.hasText(u.getUmoType())) {
			errors.rejectValue("type", null, "Please Select valid ModelType ");
		}
		
		/*
		 * if(!Pattern.matches("[A-Za-z]{2-15}" , u.getUmoModel())) {
		 * errors.rejectValue("model", null, "Please Enter Valid Text"); }
		 */		
		if(!Pattern.matches("[A-Za-z]{10,250}", u.getNote())) {
			errors.rejectValue("note", null, "Enter valid Text");	
		}
		
		if(umoService.isUmoModelExist(u.getUmoModel())) {
			errors.rejectValue("umoModel", null, u.getUmoModel()+"Already exist");
		}
		
	}

}
