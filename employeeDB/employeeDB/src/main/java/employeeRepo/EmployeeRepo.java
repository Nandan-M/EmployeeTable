package employeeRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeDB.entity.EmployeeDetails;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetails, Long> {
	
}
