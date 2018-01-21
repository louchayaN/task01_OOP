package com.corporation.task01.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.corporation.task01.dao.ApplianceDAO;
import com.corporation.task01.dao.DAOFactory;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.service.ApplianceService;
import com.corporation.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria, String filePath) throws IOException {
		
		Map<String, String> validateErrors = Validator.criteriaValidator(criteria);
		if(! validateErrors.isEmpty()) {
			for (Entry<String, String> entry : validateErrors.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());			
			} 
			throw new RuntimeException("Data validation was failed!");
		}
		
		DAOFactory instance = DAOFactory.getInstance();
		ApplianceDAO applianceDao = instance.getApplienceDao();
		
		List<Appliance> applianceList = applianceDao.find(criteria, filePath);
		return applianceList;
	}

}
