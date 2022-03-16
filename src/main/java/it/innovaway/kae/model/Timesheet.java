package it.innovaway.kae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
		super();
	}

	public Timesheet(int workDays, String month, String year, Double cost, Employee employee, Task task) {
		super();
		this.workDays = workDays;
		this.month = month;
		this.year = year;
		this.cost = cost;
		this.employee = employee;
		this.task = task;
	}

	public Timesheet(Long id, int workDays, String month, String year, Double cost, Employee employee, Task task) {
		super();
		this.id = id;
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
	@JoinColumn(name = "fk_employee", referencedColumnName = "id")
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@OneToOne
	@JoinColumn(name = "fk_task", referencedColumnName = "id")
	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
