package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.dao.ApplianceEntityBuilder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Laptop;

public class LaptopEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceDB) {
		
		Laptop laptop = new Laptop();
		  
		laptop.setBatteryCapacity(Double.parseDouble(applianceDB.get("BATTERY_CAPACITY")));
		laptop.setOs(applianceDB.get("OS"));
		laptop.setMemoryRom(Double.parseDouble(applianceDB.get("MEMORY_ROM")));
		laptop.setSystemMemory(Double.parseDouble(applianceDB.get("SYSTEM_MEMORY")));
		laptop.setCpu(Double.parseDouble(applianceDB.get("CPU")));
		laptop.setDisplayInchs(Double.parseDouble(applianceDB.get("DISPLAY_INCHS")));
		
		return laptop;
	}
	
	
	
}
