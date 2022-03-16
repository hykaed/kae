package it.innovaway.kae.mapper;

import it.innovaway.kae.dto.EmployeeDto;
import it.innovaway.kae.dto.SimpleEmployeeDto;
import it.innovaway.kae.model.Employee;

public interface EmployeeMapper {

     //Employee toEntity(EmployeeDto employeeDto);
     SimpleEmployeeDto toDto(Employee employee);

     Employee toEntity(SimpleEmployeeDto simpleEmployeeDto);
}
