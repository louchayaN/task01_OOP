package com.corporation.task01.dao;

import com.corporation.task01.dao.impl.ApplianceDAOImpl;

public class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
	private static final ApplianceDAO applienceDao = new ApplianceDAOImpl();
	
	private DAOFactory() {}
	
	public static DAOFactory getInstance() {
		return instance;
	}
	
	public ApplianceDAO getApplienceDao() {
		return applienceDao;
	}
	
}
