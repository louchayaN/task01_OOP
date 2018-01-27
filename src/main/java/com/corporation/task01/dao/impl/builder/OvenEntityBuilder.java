package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Oven;

public class OvenEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceResourceParametres) {
		Oven oven = new Oven();

		oven.setPowerConsumption(Double.parseDouble(applianceResourceParametres.get("POWER_CONSUMPTION")));
		oven.setWeight(Double.parseDouble(applianceResourceParametres.get("WEIGHT")));
		oven.setCapacity(Double.parseDouble(applianceResourceParametres.get("CAPACITY")));
		oven.setDepth(Double.parseDouble(applianceResourceParametres.get("DEPTH")));
		oven.setWidth(Double.parseDouble(applianceResourceParametres.get("WIDTH")));

		return oven;
	}

}
