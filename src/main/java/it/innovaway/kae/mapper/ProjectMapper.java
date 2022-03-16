package it.innovaway.kae.mapper;

import it.innovaway.kae.dto.ProjectDto;
import it.innovaway.kae.model.Project;

public interface ProjectMapper {
    //public Project projectDtoToProject(ProjectDto projectDto);

    Project toEntity(ProjectDto projectDto);
    ProjectDto toDto(Project project);

    //tests

}
