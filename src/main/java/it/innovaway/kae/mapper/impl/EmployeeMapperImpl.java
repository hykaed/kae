package it.innovaway.kae.mapper.impl;

import it.innovaway.kae.dto.EmployeeDto;
import it.innovaway.kae.dto.SimpleEmployeeDto;
import it.innovaway.kae.mapper.EmployeeMapper;
import it.innovaway.kae.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    /*@Override
    public Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
        if (employeeDto == null) {
            return null;
        }
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDto.getEmployeeId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setJobPosition(employeeDto.getJobPosition());

        Project project = new Project();
        project.setId(employeeDto.getEmployeeId());
        Set<Project> projects = new HashSet<>();
        projects.add(project);
        employee.setProjects(projects);

        User user = new User();
        user.setId(employeeDto.getUserId());
        user.setEmail(employeeDto.getUserEmail());
        user.setPassword(employeeDto.getUserPassword());

        Role role = new Role();
        role.setId(employeeDto.getRoleId());
        role.setName(employeeDto.getRoleName());
        user.setRole(role);

        WageLevel wageLevel = new WageLevel();
        wageLevel.setId(employeeDto.getWageLevelId());
        wageLevel.setMin(employeeDto.getWageLevelMin());
        wageLevel.setMax(employeeDto.getWageLevelMax());

        employee.setWageLevel(wageLevel);
        employee.setUser(user);

        return employee;
    }

    @Override
    public EmployeeDto employeeToEmployeeDto(Employee employee) {
        return null;
    }*/


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
        //employeeDto.setProjects(employee.getProjects());

        return employeeDto;
    }


}
