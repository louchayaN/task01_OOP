package com.corporation.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.entity.criteria.SearchCriteria.Speakers;
import com.corporation.task01.util.NumberUtil;
import com.corporation.task01.util.StringUtil;

public class SpeakersValidator implements ApplianceValidator {

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
		
		if(criterias.containsKey(Speakers.POWER_CONSUMPTION)) {
			if(NumberUtil.isNotNumber(criterias.get(Speakers.POWER_CONSUMPTION).toString())) {
				validateErrors.put(Speakers.POWER_CONSUMPTION.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Speakers.NUMBER_OF_SPEAKERS)) {
			if(NumberUtil.isNotNumber(criterias.get(Speakers.NUMBER_OF_SPEAKERS).toString())) {
				validateErrors.put(Speakers.NUMBER_OF_SPEAKERS.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(Speakers.CORD_LENGTH)) {
			if(NumberUtil.isNotNumber(criterias.get(Speakers.CORD_LENGTH).toString())) {
				validateErrors.put(Speakers.CORD_LENGTH.toString(), IS_NOT_NUMBER);
			}
		}
	
		return validateErrors;
	}

}
