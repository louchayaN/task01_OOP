package com.corporation.task01.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.corporation.task01.entity.criteria.ApplianceType;

public class ApplianceResourceParser {

	public static Map<String, String> parseLineByApplianceType(ApplianceType applianceType, String resourseLine) {

		Map<String, String> applianceResourceParametres = new HashMap<>();

		if (resourseLine.matches("^(?i)" + applianceType + ".+")) {// многовато лишних объектов String плодим
			resourseLine = resourseLine.replaceAll("^.+: ", "");
			for (String s : resourseLine.split(", ")) {
				String[] parametres = s.split("=");
				applianceResourceParametres.put(parametres[0], parametres[1]);
			}
		}
		return applianceResourceParametres;

	}

}
