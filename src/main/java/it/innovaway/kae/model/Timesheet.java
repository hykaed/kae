package it.innovaway.kae.model;

import javax.persistence.*;

@Entity
@Table
public class Timesheet {
    private Long id;
    private int workDays;
    private String month;
    private String year;
    private Double cost;
    private Employee employee;
    private Task task;

    public Timesheet() {
    }

    public Timesheet(int workDays, String month, String year, Double cost, Employee employee, Task task) {
        this.workDays = workDays;
        this.month = month;
        this.year = year;
        this.cost = cost;
        this.employee = employee;
        this.task = task;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @OneToOne
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @OneToOne
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
