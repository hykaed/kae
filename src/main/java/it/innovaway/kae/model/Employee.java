package it.innovaway.kae.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private String jobPosition;
    private WageLevel wageLevel;
    private User user;
    private Set<Project> projects;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String jobPosition, WageLevel wageLevel, User user, Set<Project> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.wageLevel = wageLevel;
        this.user = user;
        this.projects = projects;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @ManyToOne
    public WageLevel getWageLevel() {
        return wageLevel;
    }

    public void setWageLevel(WageLevel wageLevel) {
        this.wageLevel = wageLevel;
    }

    @OneToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToMany
    @JoinTable(name = "project_member",
            joinColumns = @JoinColumn(name = "fk_employee"),
            inverseJoinColumns = @JoinColumn(name = "fk_project"))
    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
        project.getEmployees().add(this);
    }
}
