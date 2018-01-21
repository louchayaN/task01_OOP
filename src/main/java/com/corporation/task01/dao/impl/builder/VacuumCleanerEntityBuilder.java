package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.dao.ApplianceEntityBuilder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.VacuumCleaner;

public class VacuumCleanerEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceCharacteristics) {
		
		VacuumCleaner vacuumCleaner = new VacuumCleaner();
		
		vacuumCleaner.setPowerConsumption(Double.parseDouble(applianceCharacteristics.get("POWER_CONSUMPTION")));
		vacuumCleaner.setFilterType(applianceCharacteristics.get("FILTER_TYPE"));
		vacuumCleaner.setBagType(applianceCharacteristics.get("BAG_TYPE"));
		vacuumCleaner.setWandType(applianceCharacteristics.get("WAND_TYPE"));
		vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(applianceCharacteristics.get("MOTOR_SPEED_REGULATION")));
		vacuumCleaner.setCleaningWidth(Double.parseDouble(applianceCharacteristics.get("CLEANING_WIDTH")));
		
		return vacuumCleaner;
	}

}
