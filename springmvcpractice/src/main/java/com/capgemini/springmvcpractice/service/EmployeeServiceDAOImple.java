package com.capgemini.springmvcpractice.service;

import com.capgemini.springmvcpractice.dao.EmployeeDAO;
import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;

public class EmployeeServiceDAOImple implements EmployeeServiceDao {
	
	private EmployeeDAO dao;

	@Override
	public EmployeeInfoBean getEmployeeDetails(int id) {
		
		return dao.getEmployeeDetails(id);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean info) {
		
		return dao.addEmployee(info);
	}

}
