package it.innovaway.kae.mapper.impl;

import it.innovaway.kae.dto.SimpleEmployeeDto;
import it.innovaway.kae.mapper.EmployeeMapper;
import it.innovaway.kae.model.*;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(SimpleEmployeeDto employeeDto) {

        if (employeeDto == null) return null;

        Employee entity = new Employee();
        entity.setEmployeeId(employeeDto.getEmployeeId());
        entity.setFirstName(employeeDto.getFirstName());
        entity.setLastName(employeeDto.getLastName());
        entity.setJobPosition(employeeDto.getJobPosition());
        //entity.setProjects(employeeDto.getProjects());

        return entity;
    }

    @Override
    public SimpleEmployeeDto toDto(Employee employee) {
        if (employee == null) {
            return null;
        }
        SimpleEmployeeDto employeeDto = new SimpleEmployeeDto();
        employeeDto.setEmployeeId(employee.getEmployeeId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setJobPosition(employee.getJobPosition());

        return employeeDto;
    }


}
