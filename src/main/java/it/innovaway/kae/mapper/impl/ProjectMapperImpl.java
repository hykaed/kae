package it.innovaway.kae.mapper.impl;

import it.innovaway.kae.dto.ProjectDto;
import it.innovaway.kae.mapper.EmployeeMapper;
import it.innovaway.kae.mapper.ProjectMapper;
import it.innovaway.kae.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
public class ProjectMapperImpl implements ProjectMapper {

    private final EmployeeMapper employeeMapper;

    @Autowired
    public ProjectMapperImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public Project toEntity(ProjectDto projectDto) {
        if(projectDto == null) {
            return null;
        }
        Project projectModel = new Project();
        projectModel.setId(projectDto.getProjectId());
        projectModel.setName(projectDto.getName());
        projectModel.setDescription(projectDto.getDescription());
        projectModel.setStartDate(projectDto.getStartDate());
        projectModel.setEndDate(projectDto.getEndDate());

        projectModel.setEmployees(projectDto.getEmployees().stream()
                .map(employeeMapper::toEntity)
                .collect(Collectors.toSet()));

        return projectModel;
    }


    @Override
    public ProjectDto toDto(Project project) {
        if (project == null) {
            return null;
        }
        ProjectDto projectDto = new ProjectDto();
        projectDto.setProjectId(project.getId());
        projectDto.setName(project.getName());
        projectDto.setDescription(project.getDescription());
        projectDto.setStartDate(project.getStartDate());
        projectDto.setEndDate(project.getEndDate());

        projectDto.setEmployees(project.getEmployees().stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toSet()));

        return projectDto;
    }

    }
