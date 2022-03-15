package com.innovaway.kao1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "task")
public class Task extends Base {
    private String name;
    private String decription;
    private LocalDate startDay;
    private LocalDate endDay;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    @OneToOne(mappedBy = "task")
    private Timesheet timesheet;
}
