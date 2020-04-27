package com.capgemini.springmvcpractice.dao;

import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;

public interface EmployeeDAO {
	
	EmployeeInfoBean getEmployeeDetails(int id);
	boolean addEmployee(EmployeeInfoBean info);

}
