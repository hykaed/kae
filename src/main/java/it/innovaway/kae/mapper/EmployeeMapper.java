package it.innovaway.kae.mapper;

import it.innovaway.kae.dto.EmployeeDto;
import it.innovaway.kae.model.Employee;

public interface EmployeeMapper {

	public Employee employeeDtoToEmployee(EmployeeDto employeeDto);

	public EmployeeDto employeeToEmployeeDto(Employee employee);

}
