package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDB.entity.EmployeeDetails;

import employeeTaxService.TaxService;

@RestController
public class TaxController {
	
	@Autowired
	private TaxService taxService;
	
	@GetMapping("/Salary/{id}")
	public int EmployeeTax (EmployeeDetails employee) {
		return taxService.employeeTax(employee);
		
	}
}
