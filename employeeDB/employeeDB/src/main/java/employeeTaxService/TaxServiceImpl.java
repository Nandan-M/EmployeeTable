package employeeTaxService;

import com.employeeDB.entity.EmployeeDetails;

import employeeRepo.EmployeeRepo;

public class TaxServiceImpl implements TaxService {

	private EmployeeRepo employeeRepo;
	@Override
	public int employeeTax(EmployeeDetails employee) {
		
	EmployeeDetails employeeDetails = getEmployee(employee.getEmployee_Id());
		
		int salary = employeeDetails.getSalary();
		
		int yearlySalary = salary *12;
		int taxForFive = (int) (250000 * 0.05);
		int taxForTen = (int)(500000 * 0.1);
		
		if(yearlySalary <= 250000)
			return 0;
		
		else if(yearlySalary <= 500000) {
			int taxAmount = yearlySalary - 250000;
		return (int) (taxAmount * 0.05);
		}
		
		else if(yearlySalary > 500000 && yearlySalary <= 1000000) {
			int taxAmount = yearlySalary - 500000;
			return (int)((taxAmount * 0.1)+taxForFive);
		}
		
		else {
			int taxAmount = yearlySalary - 1000000;
			return (int) ((taxAmount *0.2)+taxForFive+taxForTen);
		}
	}
	@Override
	public EmployeeDetails getEmployee(Long employee_Id) {
		
		EmployeeDetails employeeDetails = employeeRepo.findById(employee_Id).orElseThrow();
		return employeeDetails;
	}
}
