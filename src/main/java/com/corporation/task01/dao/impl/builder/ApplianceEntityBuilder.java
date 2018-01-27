package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.entity.Appliance;

public interface ApplianceEntityBuilder {

	Appliance build(Map<String, String> applianceResourceParametres);

}
