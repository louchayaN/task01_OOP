package com.corporation.task01.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.corporation.task01.dao.ApplianceDAO;
import com.corporation.task01.dao.DAOFactory;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.service.ApplianceService;
import com.corporation.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws IOException {

		Map<String, String> validationErrors = Validator.validateCriteria(criteria);
		if (!validationErrors.isEmpty()) {
			throw new IllegalArgumentException(validationErrors.toString());
		}

		DAOFactory instance = DAOFactory.getInstance();
		ApplianceDAO applianceDao = instance.getApplienceDao();

		List<Appliance> appliances = applianceDao.find(criteria);
		return appliances;
	}

}
