package com.capgemini.springmvcpractice.service;

import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;

public interface EmployeeServiceDao {
	
	EmployeeInfoBean getEmployeeDetails(int id);
	boolean addEmployee(EmployeeInfoBean info);


}
