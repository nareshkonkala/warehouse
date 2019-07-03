package com.app.validate;

import java.util.regex.Pattern;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Umo;

public class UmoValidator implements Validator {

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
		
		if(!Pattern.matches("[A-Za-z0-9\\\\s]{2-15}", u.getUmoModel())) {
			errors.rejectValue("model", null, "Please Enter Valid Text");
		}
		
		if(!Pattern.matches("[A-Za-z]{10,250}", u.getNote())) {
			errors.rejectValue("note", null, "Enter valid Text");	
		}
	}

}
