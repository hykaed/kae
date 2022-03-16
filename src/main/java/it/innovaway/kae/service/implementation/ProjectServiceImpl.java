package it.innovaway.kae.service.implementation;

import it.innovaway.kae.dto.ProjectDto;
import it.innovaway.kae.mapper.ProjectMapper;
import it.innovaway.kae.model.Project;
import it.innovaway.kae.repository.EmployeeRepository;
import it.innovaway.kae.repository.ProjectRepository;
import it.innovaway.kae.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private static final String PROJECT_NOT_FOUND = "Project with id %d does not exist";

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    public ProjectMapper projectMapper;

    @Override
    public List<ProjectDto> getProjects()
    {
        System.out.println(projectRepository.findAll().stream()
                .map(Project::getEmployees).collect(Collectors.toList()));
        return projectRepository.findAll().stream()
                .map(projectMapper::toDto).collect(Collectors.toList());

    }

    @Override
    public ProjectDto addNewProject(ProjectDto project) {

        Optional<Project> projectOptional = projectRepository.findProjectByName(project.getName());
        if (projectOptional.isPresent()) {
            throw new IllegalStateException("Project name is taken");
        }

        Project entity = new Project();
        entity.setName(project.getName());
        entity.setDescription(project.getDescription());
        entity.setStartDate(project.getStartDate());
        entity.setEndDate(project.getEndDate());
        entity.setEmployees(new HashSet<>(employeeRepository.findAllById(project.getEmployeesId())));

        //tests

        //tests

        projectRepository.save(entity);

        return projectMapper.toDto(entity);
    }

    @Override
    @Transactional
    public void deleteProject(Long projectId) {
        if (!projectRepository.existsById(projectId)) {
            String message = String.format(PROJECT_NOT_FOUND, projectId);
            throw new IllegalStateException(message);
        }
        projectRepository.deleteById(projectId);
    }

    @Override
    public void updateProject(ProjectDto projectDto) {
        Project entity = projectRepository.findById(projectDto.getProjectId())
                .orElseThrow(EntityNotFoundException::new);

        //Project prj = projectMapper.toEntity(projectDto);
        entity.setName(projectDto.getName());
        entity.setDescription(projectDto.getDescription());
        entity.setStartDate(projectDto.getStartDate());
        entity.setEndDate(projectDto.getEndDate());
        entity.setEmployees(new HashSet<>(employeeRepository.findAllById(projectDto.getEmployeesId())));

        projectRepository.save(entity);
    }
}
