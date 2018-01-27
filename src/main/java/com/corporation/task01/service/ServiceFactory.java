package com.corporation.task01.service;

import com.corporation.task01.service.impl.ApplianceServiceImpl;

public class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();
	private static final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}
	
	public static ServiceFactory getInstance() {
		return instance;
	}

	public ApplianceService getApplianceService() {
		return applianceService;
	}
}
