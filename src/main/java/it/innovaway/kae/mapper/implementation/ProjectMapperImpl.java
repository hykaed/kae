package it.innovaway.kae.mapper.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.innovaway.kae.dto.ProjectDto;
import it.innovaway.kae.mapper.ProjectMapper;
import it.innovaway.kae.model.Employee;
import it.innovaway.kae.model.Project;
import it.innovaway.kae.model.Task;

@Component
public class ProjectMapperImpl implements ProjectMapper {

	@Override
	public Project projectDtoToProject(ProjectDto projectDto) {

		if (projectDto == null) {
			return null;
		}

		Project project = new Project();
		project.setId(projectDto.getProjectId());
		project.setName(projectDto.getName());
		project.setDescription(projectDto.getDescription());
		project.setStartDate(projectDto.getStartDate());
		project.setEndDate(projectDto.getEndDate());

		Employee employee = new Employee();
		employee.setId(projectDto.getEmployeeId());
		List<Employee> employees = new ArrayList<>();
		employees.add(employee);

		project.setEmployees(employees);

		Task task = new Task();
		task.setId(projectDto.getTaskId());
		List<Task> tasks = new ArrayList<>();
		tasks.add(task);

		project.setTasks(tasks);

		return project;
	}

	@Override
	public ProjectDto projectToProjectDto(Project project) {

		if (project == null) {
			return null;
		}

		ProjectDto projectDto = new ProjectDto();
		projectDto.setProjectId(project.getId());
		projectDto.setName(project.getName());
		projectDto.setDescription(project.getDescription());
		projectDto.setStartDate(project.getStartDate());
		projectDto.setEndDate(project.getEndDate());

		// projectDto.setEmployeeId(project.getEmployees().getId());

		// projectDto.setTaskId(project.getTasks().getId());

		return projectDto;
	}

}
