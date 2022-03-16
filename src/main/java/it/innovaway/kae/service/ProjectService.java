package it.innovaway.kae.service;

import it.innovaway.kae.dto.ProjectDto;
import it.innovaway.kae.model.Project;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getProjects();

    ProjectDto addNewProject(ProjectDto projectDto);

    void deleteProject(Long projectId);

    void updateProject(ProjectDto projectDto);


    //tests
    /*public ProjectDto addNewProject(ProjectDto courseDto);*/
}
