package com.corporation.task01.dao;

import java.util.Map;

import com.corporation.task01.entity.Appliance;

public interface ApplianceEntityBuilder {
	
	Appliance build (Map<String,String> applianceDB);
	
}
