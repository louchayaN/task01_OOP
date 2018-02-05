package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Refrigerator;

public class RefrigeratorEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceResourceParametres) {

		Refrigerator refrigerator = new Refrigerator();

		refrigerator.setPowerConsumption(Double.parseDouble(applianceResourceParametres.get("POWER_CONSUMPTION"))); // длинноватые строки
		// парсинг с внутренностями можно было реализовать красиво отдельным методом
		// и константы в коде должны быть именованы
		refrigerator.setWeight(Double.parseDouble(applianceResourceParametres.get("WEIGHT")));
		refrigerator.setFreezerCapacity(Double.parseDouble(applianceResourceParametres.get("FREEZER_CAPACITY")));
		refrigerator.setOverallCapacity(Double.parseDouble(applianceResourceParametres.get("OVERALL_CAPACITY")));
		refrigerator.setHeight(Double.parseDouble(applianceResourceParametres.get("HEIGHT")));
		refrigerator.setWidth(Double.parseDouble(applianceResourceParametres.get("WIDTH")));

		return refrigerator;
	}

}
