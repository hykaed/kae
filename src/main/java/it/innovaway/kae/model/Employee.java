package it.innovaway.kae.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	private Long id;
	private String firstName;
	private String lastName;
	private String jobPosition;
	private User user;
	private WageLevel wageLevel;
	private List<Project> projects;
	private boolean isDeleted = false;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String jobPosition, User user, WageLevel wageLevel,
			List<Project> projects, boolean isDeleted) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobPosition = jobPosition;
		this.user = user;
		this.wageLevel = wageLevel;
		this.projects = projects;
		this.isDeleted = isDeleted;
	}

	public Employee(Long id, String firstName, String lastName, String jobPosition, User user, WageLevel wageLevel,
			List<Project> projects, boolean isDeleted) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobPosition = jobPosition;
		this.user = user;
		this.wageLevel = wageLevel;
		this.projects = projects;
		this.isDeleted = isDeleted;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_user", referencedColumnName = "id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(optional = false, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_wage_level", referencedColumnName = "id")
	public WageLevel getWageLevel() {
		return wageLevel;
	}

	public void setWageLevel(WageLevel wageLevel) {
		this.wageLevel = wageLevel;
	}

	@ManyToMany
	@JoinTable(name = "project_members", joinColumns = @JoinColumn(name = "fk_employee"), inverseJoinColumns = @JoinColumn(name = "fk_project"))
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
