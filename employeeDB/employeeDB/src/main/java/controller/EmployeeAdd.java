package controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDB.entity.EmployeeDetails;
import com.employeeDB.service.EmployeeAddService;

@RestController
public class EmployeeAdd {

	@Autowired
	private EmployeeAddService addService;
	
	@PostMapping(path = "/addEmployee")
	public String saveEmployee(EmployeeDetails employee) {
		return addService.saveEmployee(employee);
	}
	
	
}
