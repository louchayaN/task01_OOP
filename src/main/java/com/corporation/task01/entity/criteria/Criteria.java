package com.corporation.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
	
	private ApplianceType applianceType;

	private Map<E, Object> criteria  = new HashMap<>();
	
	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public ApplianceType getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(ApplianceType applianceType) {
		this.applianceType = applianceType;
	}

}
