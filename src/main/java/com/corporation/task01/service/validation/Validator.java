package com.corporation.task01.service.validation;

import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;

public class Validator {

	public static <E> Map<String, String> criteriaValidator (Criteria<E> criteria) {	
		
		ApplianceType applianceType = criteria.getApplianceType();	
		
		Map<String, String> validateErrors = new ApplianceValidatorMap().getApplianceValidator(applianceType).validate(criteria);

		return validateErrors;			
	}
	
}
