package com.corporation.task01.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.corporation.task01.dao.ApplianceDAO;
import com.corporation.task01.dao.impl.builder.Builder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria, String filePath) throws IOException {
			
		InputStream stream = getClass().getResourceAsStream(filePath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		
		Map<String,String> criteriaToString = new HashMap<String,String>();
		for (Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
			criteriaToString.put(entry.getKey().toString(), entry.getValue().toString());
		}
		
		String line;
		List<Appliance> appliance = new ArrayList<>();
		while ((line=reader.readLine()) != null) {
			if(line.matches("^(?i)" + criteria.getApplianceType() + ".+")) { 
				line = line.replaceAll("^.+: " , "");
				Map<String,String> applianceCharacteristics = new HashMap<>();
				for(String s : line.split(", ")) {
					String[] pair = s.split("=");
					applianceCharacteristics.put(pair[0], pair[1]);
				}
				if (applianceCharacteristics.entrySet().containsAll(criteriaToString.entrySet())) {
					appliance.add(new Builder().getEntityBuilder(criteria.getApplianceType()).build(applianceCharacteristics));
				}
			}
		}
		return appliance;
	}
	
		
}
