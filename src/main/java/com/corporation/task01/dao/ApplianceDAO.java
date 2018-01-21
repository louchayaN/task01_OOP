package com.corporation.task01.dao;

import java.io.IOException;
import java.util.List;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	
	<E> List<Appliance> find(Criteria<E> criteria, String filePath) throws IOException;
}
