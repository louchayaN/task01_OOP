package com.corporation.task01.main;

import java.io.IOException;
import java.util.List;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.entity.criteria.SearchCriteria.Laptop;
import com.corporation.task01.service.ApplianceService;
import com.corporation.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ApplianceService applianceService = serviceFactory.getApplianceService();

		Criteria<Laptop> criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceType(ApplianceType.LAPTOP);
		criteriaLaptop.add(Laptop.MEMORY_ROM, 8000);

		List<Appliance> applianceList;
		try {
			applianceList = applianceService.find(criteriaLaptop);
			if (applianceList.isEmpty()) {
				System.out.println("Product wasn't found");
			}

			for (Appliance appliance : applianceList) {
				PrintApplianceInfo.print(appliance);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
