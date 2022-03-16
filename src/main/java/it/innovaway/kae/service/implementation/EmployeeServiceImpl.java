package it.innovaway.kae.service.implementation;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.innovaway.kae.dto.EmployeeDto;
import it.innovaway.kae.mapper.EmployeeMapper;
import it.innovaway.kae.model.Employee;
import it.innovaway.kae.model.User;
import it.innovaway.kae.model.WageLevel;
import it.innovaway.kae.repository.EmployeeRepository;
import it.innovaway.kae.repository.UserRepository;
import it.innovaway.kae.repository.WageLevelRepository;
import it.innovaway.kae.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private WageLevelRepository wageLevelRepository;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<EmployeeDto> getEmployees() {
		return employeeRepository.findEmployee().stream().map(employeeMapper::employeeToEmployeeDto)
				.collect(Collectors.toList());
	}

	@Override
	public void addNewEmployee(EmployeeDto employeeDto) {

		Optional<Employee> employeeOptional = employeeRepository.findByEmail(employeeDto.getUserEmail());
		if (employeeOptional.isPresent()) {
			throw new IllegalStateException("This employee already exists!");
		}

		Optional<User> userOptional = userRepository.findByEmail(employeeDto.getUserEmail());
		if (!userOptional.isPresent()) {
			throw new IllegalStateException("The user with this email does not exists!");
		}

		Employee employee = employeeMapper.employeeDtoToEmployee(employeeDto);
		employeeRepository.save(employee);

	}

	@Override
	@Transactional
	public void deleteEmployee(Long id) {

		Optional<Employee> employeeOptional = employeeRepository.findById(id);
		if (!employeeOptional.isPresent()) {
			throw new IllegalStateException("This employee does not exists!");
		}

		employeeOptional.get().setIsDeleted(true);
	}

	@Override
	@Transactional
	public void updateEmployee(EmployeeDto employeeDto) {

		Employee employee = employeeRepository.findById(employeeDto.getEmployeeId()).orElseThrow(
				() -> new IllegalStateException("Employee with id " + employeeDto.getEmployeeId() + " does not exist"));

		if (employeeDto.getFirstName() != null && employeeDto.getFirstName().length() > 0
				&& !Objects.equals(employee.getFirstName(), employeeDto.getFirstName())) {
			employee.setFirstName(employeeDto.getFirstName());
		}

		if (employeeDto.getLastName() != null && employeeDto.getLastName().length() > 0
				&& !Objects.equals(employee.getLastName(), employeeDto.getLastName())) {
			employee.setLastName(employeeDto.getLastName());
		}

		if (employeeDto.getJobPosition() != null && employeeDto.getJobPosition().length() > 0
				&& !Objects.equals(employee.getJobPosition(), employeeDto.getJobPosition())) {
			employee.setJobPosition(employeeDto.getJobPosition());
		}

		if (employeeDto.getWageLevelId() != null
				&& !Objects.equals(employee.getWageLevel().getId(), employeeDto.getWageLevelId())) {
			WageLevel wageLevel = wageLevelRepository.findById(employeeDto.getWageLevelId())
					.orElseThrow(() -> new IllegalStateException(
							"Wage level with id " + employeeDto.getWageLevelId() + " does not exist"));
			employee.setWageLevel(wageLevel);
		}
	}

}
