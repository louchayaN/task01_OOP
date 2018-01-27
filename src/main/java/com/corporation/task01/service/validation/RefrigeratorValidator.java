package com.corporation.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.entity.criteria.SearchCriteria.Refrigerator;
import com.corporation.task01.util.NumberUtil;
import com.corporation.task01.util.StringUtil;

public class RefrigeratorValidator implements ApplianceValidator {

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
		
		if(criterias.containsKey(Refrigerator.POWER_CONSUMPTION)) {
			if(NumberUtil.isNotNumber(criterias.get(Refrigerator.POWER_CONSUMPTION).toString())) {
				validateErrors.put(Refrigerator.POWER_CONSUMPTION.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Refrigerator.WEIGHT)) {
			if(NumberUtil.isNotNumber(criterias.get(Refrigerator.WEIGHT).toString())) {
				validateErrors.put(Refrigerator.WEIGHT.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Refrigerator.FREEZER_CAPACITY)) {
			if(NumberUtil.isNotNumber(criterias.get(Refrigerator.FREEZER_CAPACITY).toString())) {
				validateErrors.put(Refrigerator.FREEZER_CAPACITY.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Refrigerator.OVERALL_CAPACITY)) {
			if(NumberUtil.isNotNumber(criterias.get(Refrigerator.OVERALL_CAPACITY).toString())) {
				validateErrors.put(Refrigerator.OVERALL_CAPACITY.toString(), IS_NOT_NUMBER);
			}
		}
	
		if(criterias.containsKey(Refrigerator.HEIGHT)) {
			if(NumberUtil.isNotNumber(criterias.get(Refrigerator.HEIGHT).toString())) {
				validateErrors.put(Refrigerator.HEIGHT.toString(), IS_NOT_NUMBER);
			}	
		}
		
		if(criterias.containsKey(Refrigerator.WIDTH)) {
			if(NumberUtil.isNotNumber(criterias.get(Refrigerator.WIDTH).toString())) {
				validateErrors.put(Refrigerator.WIDTH.toString(), IS_NOT_NUMBER);
			}	
		}
		
		return validateErrors;
	}

}
