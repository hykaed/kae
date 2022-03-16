package it.innovaway.kae.repository;

import it.innovaway.kae.dto.SimpleEmployeeDto;
import it.innovaway.kae.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByFirstName(String employeeName);

}
