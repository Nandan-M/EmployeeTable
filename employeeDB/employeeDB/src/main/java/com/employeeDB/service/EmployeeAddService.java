package com.employeeDB.service;

import com.employeeDB.entity.EmployeeDetails;

public interface EmployeeAddService {

	EmployeeDetails getEmployee(Long Employee_Id);
	
	String saveEmployee(EmployeeDetails employee);
	
	
}
