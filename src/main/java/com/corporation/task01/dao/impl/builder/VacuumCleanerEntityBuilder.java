package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.VacuumCleaner;

public class VacuumCleanerEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceResourceParametres) {

		VacuumCleaner vacuumCleaner = new VacuumCleaner();

		vacuumCleaner.setPowerConsumption(Double.parseDouble(applianceResourceParametres.get("POWER_CONSUMPTION")));
		vacuumCleaner.setFilterType(applianceResourceParametres.get("FILTER_TYPE"));
		vacuumCleaner.setBagType(applianceResourceParametres.get("BAG_TYPE"));
		vacuumCleaner.setWandType(applianceResourceParametres.get("WAND_TYPE"));
		vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(applianceResourceParametres.get("MOTOR_SPEED_REGULATION")));
		vacuumCleaner.setCleaningWidth(Double.parseDouble(applianceResourceParametres.get("CLEANING_WIDTH")));

		return vacuumCleaner;
	}

}
