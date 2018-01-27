package com.corporation.task01.dao.impl.builder;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;

public class Builder {

	private static final Map<ApplianceType, ApplianceEntityBuilder> applianceBuilderMap = new HashMap<>();

	public Builder() {

		applianceBuilderMap.put(ApplianceType.OVEN, new OvenEntityBuilder());
		applianceBuilderMap.put(ApplianceType.LAPTOP, new LaptopEntityBuilder());
		applianceBuilderMap.put(ApplianceType.REFRIGERATOR, new RefrigeratorEntityBuilder());
		applianceBuilderMap.put(ApplianceType.VACUUMCLEANER, new VacuumCleanerEntityBuilder());
		applianceBuilderMap.put(ApplianceType.TABLETPC, new TabletPCEntityBuilder());
		applianceBuilderMap.put(ApplianceType.SPEAKERS, new SpeakersEntityBuilder());
	}

	public ApplianceEntityBuilder getEntityBuilder(ApplianceType applienceType) {

		return applianceBuilderMap.get(applienceType);
	}

}
