package com.employeeDB.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeDB.entity.EmployeeDetails;

import employeeRepo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeAddService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public EmployeeDetails getEmployee(Long Employee_Id) {
		return employeeRepo.findById(Employee_Id).orElseThrow();
	}

	@Override
	public String saveEmployee(EmployeeDetails employee) {
		
		EmployeeDetails ExistingEmployee = employeeRepo.findById(employee.getEmployee_Id()).orElse(null);
		
		if(ExistingEmployee == null)
			employeeRepo.save(employee);
		
		return "Employee Data Saved Successfully";
	}

}
