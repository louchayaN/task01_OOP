package com.corporation.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.entity.criteria.SearchCriteria.VacuumCleaner;
import com.corporation.util.NumberUtil;
import com.corporation.util.StringUtil;

public class VacuumCleanerValidator implements ApplianceValidator {

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
		
		if(criterias.containsKey(VacuumCleaner.POWER_CONSUMPTION)) {
			if(NumberUtil.isNotNumber(criterias.get(VacuumCleaner.POWER_CONSUMPTION).toString())) {
				validateErrors.put(VacuumCleaner.POWER_CONSUMPTION.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(VacuumCleaner.MOTOR_SPEED_REGULATION)) {
			if(NumberUtil.isNotNumber(criterias.get(VacuumCleaner.MOTOR_SPEED_REGULATION).toString())) {
				validateErrors.put(VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), IS_NOT_NUMBER);
			}
		}
		
		if(criterias.containsKey(VacuumCleaner.CLEANING_WIDTH)) {
			if(NumberUtil.isNotNumber(criterias.get(VacuumCleaner.CLEANING_WIDTH).toString())) {
				validateErrors.put(VacuumCleaner.CLEANING_WIDTH.toString(), IS_NOT_NUMBER);
			}
		}
	
		return validateErrors;
	}

}
