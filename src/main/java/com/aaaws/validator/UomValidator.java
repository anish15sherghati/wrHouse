package com.aaaws.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.aaaws.model.Uom;
import com.aaaws.service.IUomService;

@Component
public class UomValidator implements Validator {
	@Autowired
	private IUomService service;

	public boolean supports(Class<?> clazz) {
		return Uom.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Uom uom = (Uom) target;
		if (service.isUomModelExist(uom.getUomModel())) {
			errors.rejectValue("uomModel", null, "Uom Model '" + uom.getUomModel() + "' already exist");
		}

	}

}
