package com.corporation.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.entity.criteria.SearchCriteria.Oven;
import com.corporation.util.NumberUtil;
import com.corporation.util.StringUtil;

public class OvenValidator implements ApplianceValidator {

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
		
		if(criterias.containsKey(Oven.POWER_CONSUMPTION)) {
			if(NumberUtil.isNotNumber(criterias.get(Oven.POWER_CONSUMPTION).toString())) {
				validateErrors.put(Oven.POWER_CONSUMPTION.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Oven.WEIGHT)) {
			if(NumberUtil.isNotNumber(criterias.get(Oven.WEIGHT).toString())) {
				validateErrors.put(Oven.WEIGHT.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Oven.CAPACITY)) {
			if(NumberUtil.isNotNumber(criterias.get(Oven.CAPACITY).toString())) {
				validateErrors.put(Oven.CAPACITY.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Oven.DEPTH)) {
			if(NumberUtil.isNotNumber(criterias.get(Oven.DEPTH).toString())) {
				validateErrors.put(Oven.DEPTH.toString(), IS_NOT_NUMBER);
			}
		}
	
		if(criterias.containsKey(Oven.HEIGHT)) {
			if(NumberUtil.isNotNumber(criterias.get(Oven.HEIGHT).toString())) {
				validateErrors.put(Oven.HEIGHT.toString(), IS_NOT_NUMBER);
			}	
		}
		
		if(criterias.containsKey(Oven.WIDTH)) {
			if(NumberUtil.isNotNumber(criterias.get(Oven.WIDTH).toString())) {
				validateErrors.put(Oven.WIDTH.toString(), IS_NOT_NUMBER);
			}	
		}
		
		return validateErrors;
	}

}
