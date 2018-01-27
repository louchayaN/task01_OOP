package com.corporation.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.entity.criteria.SearchCriteria.Laptop;
import com.corporation.task01.util.NumberUtil;
import com.corporation.task01.util.StringUtil;

public class LaptopValidator implements ApplianceValidator {

	private static final String IS_EMPTY = "can't be empty"; 
	private static final String IS_NOT_NUMBER = "should be number"; 
	
	@Override
	public <E> Map<String, String> validate(Criteria<E> criteria) {
		
		ApplianceType applianceType = criteria.getApplianceType();
		Map<E, Object> criterias = criteria.getCriteria();
		
		Map<String, String> validateErrors = new HashMap<>();
		
		if(StringUtil.isBlank(applianceType.toString())) {
			validateErrors.put("Appliance type", IS_EMPTY);
		}
		
		if(criterias.containsKey(Laptop.BATTERY_CAPACITY)) {
			if(NumberUtil.isNotNumber(criterias.get(Laptop.BATTERY_CAPACITY).toString())) {
				validateErrors.put(Laptop.BATTERY_CAPACITY.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Laptop.MEMORY_ROM)) {
			if(NumberUtil.isNotNumber(criterias.get(Laptop.MEMORY_ROM).toString())) {
				validateErrors.put(Laptop.MEMORY_ROM.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Laptop.SYSTEM_MEMORY)) {
			if(NumberUtil.isNotNumber(criterias.get(Laptop.SYSTEM_MEMORY).toString())) {
				validateErrors.put(Laptop.SYSTEM_MEMORY.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Laptop.CPU)) {
			if(NumberUtil.isNotNumber(criterias.get(Laptop.CPU).toString())) {
				validateErrors.put(Laptop.CPU.toString(), IS_NOT_NUMBER);
			}
		}
	
		if(criterias.containsKey(Laptop.DISPLAY_INCHES)) {
			if(NumberUtil.isNotNumber(criterias.get(Laptop.DISPLAY_INCHES).toString())) {
				validateErrors.put(Laptop.DISPLAY_INCHES.toString(), IS_NOT_NUMBER);
			}	
		}
		
		return validateErrors;
	}

	
}
