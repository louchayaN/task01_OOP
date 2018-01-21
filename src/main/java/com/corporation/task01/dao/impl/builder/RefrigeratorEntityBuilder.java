package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.dao.ApplianceEntityBuilder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Refrigerator;

public class RefrigeratorEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceCharacteristics) {

		Refrigerator refrigerator = new Refrigerator();
		
		refrigerator.setPowerConsumption(Double.parseDouble(applianceCharacteristics.get("POWER_CONSUMPTION")));
		refrigerator.setWeight(Double.parseDouble(applianceCharacteristics.get("WEIGHT")));
		refrigerator.setFreezerCapacity(Double.parseDouble(applianceCharacteristics.get("FREEZER_CAPACITY")));
		refrigerator.setOverallCapacity(Double.parseDouble(applianceCharacteristics.get("OVERALL_CAPACITY")));
		refrigerator.setHeight(Double.parseDouble(applianceCharacteristics.get("HEIGHT")));
		refrigerator.setWidth(Double.parseDouble(applianceCharacteristics.get("WIDTH")));
		
		return refrigerator;
	}

}
