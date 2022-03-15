package com.innovaway.kao1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends Base {
    private String firstName;
    private String lastName;
    private String jobPosition;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "employee")
    private List<Project> projects;

    @OneToOne(mappedBy = "employee")
    private Timesheet timesheet;
    @ManyToOne
    @JoinColumn(name = "wagelevel_id")
    private WageLevel wagelevel;
}
