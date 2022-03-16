package it.innovaway.kae.mapper;

import it.innovaway.kae.dto.ProjectDto;
import it.innovaway.kae.model.Project;

public interface ProjectMapper {

	public Project projectDtoToProject(ProjectDto projectDto);

	public ProjectDto projectToProjectDto(Project project);

}
