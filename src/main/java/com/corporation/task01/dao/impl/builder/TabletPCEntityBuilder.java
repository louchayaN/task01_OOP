package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.TabletPC;

public class TabletPCEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceResourceParametres) {

		TabletPC tabletPC = new TabletPC();

		tabletPC.setBatteryCapacity(Double.parseDouble(applianceResourceParametres.get("BATTERY_CAPACITY")));
		tabletPC.setDisplayInches(Double.parseDouble(applianceResourceParametres.get("DISPLAY_INCHES")));
		tabletPC.setMemoryRom(Double.parseDouble(applianceResourceParametres.get("MEMORY_ROM")));
		tabletPC.setFlashMemoryCapacity(Double.parseDouble(applianceResourceParametres.get("FLASH_MEMORY_CAPACITY")));
		tabletPC.setColor(applianceResourceParametres.get("COLOR"));

		return tabletPC;
	}

}
