package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;

public interface EmployeeRepository extends JpaRepository<Employee,String> {

    public Employee findByName(Name name);

}
