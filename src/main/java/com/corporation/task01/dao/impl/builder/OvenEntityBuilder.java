package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.dao.ApplianceEntityBuilder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Oven;

public class OvenEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceCharacteristics) {
		Oven oven = new Oven();
		
		oven.setPowerConsumption(Double.parseDouble(applianceCharacteristics.get("POWER_CONSUMPTION")));
		oven.setWeight(Double.parseDouble(applianceCharacteristics.get("WEIGHT")));
		oven.setCapacity(Double.parseDouble(applianceCharacteristics.get("CAPACITY")));
		oven.setDepth(Double.parseDouble(applianceCharacteristics.get("DEPTH")));
		oven.setWidth(Double.parseDouble(applianceCharacteristics.get("WIDTH")));
		
		return oven;
	}

}
