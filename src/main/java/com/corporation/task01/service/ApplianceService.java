package com.corporation.task01.service;

import java.io.IOException;
import java.util.List;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.Criteria;

public interface ApplianceService {
	
	<E> List<Appliance> find(Criteria<E> criteria, String filePath) throws IOException;
}
