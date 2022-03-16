package it.innovaway.kae.mapper.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.innovaway.kae.dto.EmployeeDto;
import it.innovaway.kae.mapper.EmployeeMapper;
import it.innovaway.kae.mapper.ProjectMapper;
import it.innovaway.kae.model.Employee;
import it.innovaway.kae.model.Role;
import it.innovaway.kae.model.User;
import it.innovaway.kae.model.WageLevel;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

	@Autowired
	public ProjectMapper projectMapper;

	@Override
	public Employee employeeDtoToEmployee(EmployeeDto employeeDto) {

		if (employeeDto == null) {
			return null;
		}

		Employee employee = new Employee();
		employee.setId(employeeDto.getEmployeeId());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setJobPosition(employeeDto.getJobPosition());
		employee.setIsDeleted(employeeDto.getIsDeleted());
		employee.setProjects(employeeDto.getProjects());

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

		if (employee == null) {
			return null;
		}

		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setEmployeeId(employee.getId());
		employeeDto.setFirstName(employee.getFirstName());
		employeeDto.setLastName(employee.getLastName());
		employeeDto.setJobPosition(employee.getJobPosition());
		employeeDto.setIsDeleted(employee.getIsDeleted());
		employeeDto.setProjects(employee.getProjects());

		employeeDto.setUserId(employee.getUser().getId());
		employeeDto.setUserEmail(employee.getUser().getEmail());
		employeeDto.setUserPassword(employee.getUser().getPassword());

		employeeDto.setRoleId(employee.getUser().getRole().getId());
		employeeDto.setRoleName(employee.getUser().getRole().getName());

		employeeDto.setWageLevelId(employee.getWageLevel().getId());
		employeeDto.setWageLevelMin(employee.getWageLevel().getMin());
		employeeDto.setWageLevelMax(employee.getWageLevel().getMax());

		return employeeDto;
	}

}
