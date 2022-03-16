package it.innovaway.kae.service;

import java.util.List;

import it.innovaway.kae.dto.EmployeeDto;

public interface EmployeeService {

	public List<EmployeeDto> getEmployees();

	public void addNewEmployee(EmployeeDto employeeDto);

	public void deleteEmployee(Long id);

	public void updateEmployee(EmployeeDto employeeDto);

}
