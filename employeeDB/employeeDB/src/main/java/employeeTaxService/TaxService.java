package employeeTaxService;

import com.employeeDB.entity.EmployeeDetails;

public interface TaxService {

	int employeeTax(EmployeeDetails employee);

	EmployeeDetails getEmployee(Long employee_Id);
}
