package it.innovaway.kae.controller;

import it.innovaway.kae.dto.ProjectDto;
import it.innovaway.kae.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /*@GetMapping(value = "kae/project")
    public List<Project> getProjects() {
        return projectService.getProjects();
    }*/

    /*@PostMapping(value = "kae/project")
    public void addNewProject(@RequestBody ProjectDto projectDto) {
        projectService.addNewProject(projectDto);
    }*/

    @GetMapping(value = "kae/project")
    public List<ProjectDto> getProjects() {
        return projectService.getProjects();
    }

    @PostMapping(value = "kae/project")
    public ProjectDto addNewProject(@RequestBody ProjectDto projectDto) {
        return projectService.addNewProject(projectDto);
    }

    @DeleteMapping("kae/project/{projectId}")
    public void deleteProject(@PathVariable("projectId") Long projectId) {
        projectService.deleteProject(projectId);
    }

    @PutMapping("kae/project")
    public void updateProject(@RequestBody ProjectDto projectDto) {
        projectService.updateProject(projectDto);
    }

    /*@PostMapping(value = "kae/project")
    public ResponseEntity<ProjectDto> getAllStudents(@RequestBody ProjectDto projectDto) {
        ProjectDto prj = projectService.addNewProject(projectDto);
        return new ResponseEntity<>(prj, HttpStatus.CREATED);
    }*/
}
