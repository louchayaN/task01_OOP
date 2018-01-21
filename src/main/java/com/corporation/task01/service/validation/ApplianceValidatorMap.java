package com.corporation.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;

public class ApplianceValidatorMap {
	
private static final Map<ApplianceType, ApplianceValidator> applianceValidator = new HashMap<>();
	
	public ApplianceValidatorMap(){
		
		applianceValidator.put(ApplianceType.OVEN, new OvenValidator());
		applianceValidator.put(ApplianceType.LAPTOP, new LaptopValidator());
		applianceValidator.put(ApplianceType.REFRIGERATOR, new RefrigeratorValidator());
		applianceValidator.put(ApplianceType.VACUUMCLEANER, new VacuumCleanerValidator());
		applianceValidator.put(ApplianceType.TABLETPC, new TabletPCValidator());
		applianceValidator.put(ApplianceType.SPEAKERS, new SpeakersValidator());
	}
	
	public ApplianceValidator getApplianceValidator (ApplianceType applianceType){				
		
		return applianceValidator.get(applianceType);			
	}
}
