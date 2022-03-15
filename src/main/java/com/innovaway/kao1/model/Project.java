package com.innovaway.kao1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project")
public class Project extends Base {
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToMany
    @JoinTable(
            name = "project_member",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Employee> employee;

    @OneToMany(mappedBy = "project")
    private List<Task> tasks;

}
