package it.innovaway.kae.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.innovaway.kae.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("SELECT e From Employee e JOIN e.user u WHERE u.email = ?1")
	Optional<Employee> findByEmail(String email);

	@Query("SELECT e FROM Employee e WHERE e.isDeleted = false")
	List<Employee> findEmployee();
}
