package it.innovaway.kae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.innovaway.kae.dto.EmployeeDto;
import it.innovaway.kae.repository.EmployeeRepository;
import it.innovaway.kae.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService employeeService;

	@GetMapping(value = "kae/employee")
	public List<EmployeeDto> getEmployees() {
		return employeeService.getEmployees();
	}

	@PostMapping(value = "kae/employee")
	public void addNewEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.addNewEmployee(employeeDto);
	}

	@PutMapping(value = "kae/employee/{id}")
	public void deleteEmployee(@PathVariable(name = "id", required = true) Long id) {
		employeeService.deleteEmployee(id);
	}

	@PutMapping(value = "kae/employee")
	public void updateEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.updateEmployee(employeeDto);
	}

}
