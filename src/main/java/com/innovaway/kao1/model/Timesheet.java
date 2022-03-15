package com.innovaway.kao1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "timesheet")
public class Timesheet extends Base {
    private int workDays;
    private String month;
    private String year;
    private Long cost;

    @OneToOne
    @JoinColumn(name = "task_id")
    private Task task;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


}
