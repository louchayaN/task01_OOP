package com.corporation.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.entity.criteria.SearchCriteria.TabletPC;
import com.corporation.task01.util.NumberUtil;
import com.corporation.task01.util.StringUtil;

public class TabletPCValidator implements ApplianceValidator {

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
		
		if(criterias.containsKey(TabletPC.BATTERY_CAPACITY)) {
			if(NumberUtil.isNotNumber(criterias.get(TabletPC.BATTERY_CAPACITY).toString())) {
				validateErrors.put(TabletPC.BATTERY_CAPACITY.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(TabletPC.DISPLAY_INCHES)) {
			if(NumberUtil.isNotNumber(criterias.get(TabletPC.DISPLAY_INCHES).toString())) {
				validateErrors.put(TabletPC.DISPLAY_INCHES.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(TabletPC.MEMORY_ROM)) {
			if(NumberUtil.isNotNumber(criterias.get(TabletPC.MEMORY_ROM).toString())) {
				validateErrors.put(TabletPC.MEMORY_ROM.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(TabletPC.FLASH_MEMORY_CAPACITY)) {
			if(NumberUtil.isNotNumber(criterias.get(TabletPC.FLASH_MEMORY_CAPACITY).toString())) {
				validateErrors.put(TabletPC.FLASH_MEMORY_CAPACITY.toString(), IS_NOT_NUMBER);
			}
		}
		
		return validateErrors;
	}

}
