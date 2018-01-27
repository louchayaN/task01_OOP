package com.corporation.task01.dao.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.corporation.task01.dao.ApplianceDAO;
import com.corporation.task01.dao.impl.builder.Builder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.util.MapUtil;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws IOException {

		ApplianceType applianceType = criteria.getApplianceType();
		Map<E, Object> criterias = criteria.getCriteria();
		Map<String, String> seachingCriterias = MapUtil.transformMapEntryToString(criterias);

		List<Appliance> appliances = new ArrayList<>();
		ApplianceResourceReader applianceResourceReader = new ApplianceResourceReader();

		String resourseLine;
		try {
			while ((resourseLine = applianceResourceReader.readLine()) != null) {
				Map<String, String> applianceResourceParametres = ApplianceResourceParser.parseLineByApplianceType(applianceType,
						resourseLine);
				if (applianceResourceParametres.entrySet().containsAll(seachingCriterias.entrySet())) {
					appliances.add(new Builder().getEntityBuilder(applianceType).build(applianceResourceParametres));
				}
			}
		} finally {
			applianceResourceReader.close();
		}

		return appliances;
	}

}
