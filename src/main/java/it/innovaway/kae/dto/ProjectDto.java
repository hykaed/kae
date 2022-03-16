package it.innovaway.kae.dto;

import java.time.LocalDate;
import java.util.Set;

public class ProjectDto {
    private Long projectId;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Set<SimpleEmployeeDto> employees;
    private Set<Long> employeesId;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Set<SimpleEmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<SimpleEmployeeDto> employees) {
        this.employees = employees;
    }

    public Set<Long> getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(Set<Long> employeesId) {
        this.employeesId = employeesId;
    }
}
