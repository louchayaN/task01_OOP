package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.dao.ApplianceEntityBuilder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.TabletPC;

public class TabletPCEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceCharacteristics) {
		
		TabletPC tabletPC = new TabletPC();
		
		tabletPC.setBatteryCapacity(Double.parseDouble(applianceCharacteristics.get("BATTERY_CAPACITY")));
		tabletPC.setDisplayInches(Double.parseDouble(applianceCharacteristics.get("DISPLAY_INCHES")));
		tabletPC.setMemoryRom(Double.parseDouble(applianceCharacteristics.get("MEMORY_ROM")));
		tabletPC.setFlashMemoryCapacity(Double.parseDouble(applianceCharacteristics.get("FLASH_MEMORY_CAPACITY")));
		tabletPC.setColor(applianceCharacteristics.get("COLOR"));
		
		return tabletPC;
	}

}
