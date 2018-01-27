package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Laptop;

public class LaptopEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceResourceParametres) {

		Laptop laptop = new Laptop();

		laptop.setBatteryCapacity(Double.parseDouble(applianceResourceParametres.get("BATTERY_CAPACITY")));
		laptop.setOs(applianceResourceParametres.get("OS"));
		laptop.setMemoryRom(Double.parseDouble(applianceResourceParametres.get("MEMORY_ROM")));
		laptop.setSystemMemory(Double.parseDouble(applianceResourceParametres.get("SYSTEM_MEMORY")));
		laptop.setCpu(Double.parseDouble(applianceResourceParametres.get("CPU")));
		laptop.setDisplayInchs(Double.parseDouble(applianceResourceParametres.get("DISPLAY_INCHS")));

		return laptop;
	}

}
