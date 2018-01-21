package com.corporation.task01.main;

import java.io.IOException;
import java.util.List;

import static com.corporation.task01.entity.criteria.SearchCriteria.*;

import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.criteria.ApplianceType;
import com.corporation.task01.entity.criteria.Criteria;
import com.corporation.task01.service.ApplianceService;
import com.corporation.task01.service.ServiceFactory;

public class Main {

	private static final String FILE_PATH = "/appliances_db.txt";
	
	public static void main(String[] args) {
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ApplianceService applianceService = serviceFactory.getApplianceService();
		
		Criteria<Laptop> criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceType(ApplianceType.LAPTOP);
		criteriaLaptop.add(Laptop.MEMORY_ROM, "8000");
		//criteriaLaptop.add(Laptop.BATTERY_CAPACITY, "4");
		
		List<Appliance> applianceList;
		try {
			applianceList = applianceService.find(criteriaLaptop, FILE_PATH);
			if(applianceList.isEmpty()) {
				System.out.println("Product wasn't found");
			}
			
			for(Appliance appliance: applianceList) {
				System.out.println(appliance);
			}
		} catch (IOException e) {
			//handling an exception depending on program task
			System.out.println("Try later to send a request");
		}
		
	}

}
