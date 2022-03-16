package it.innovaway.kae.dto;

import java.util.List;

import it.innovaway.kae.model.Project;

public class EmployeeDto {

	private Long employeeId;
	private String firstName;
	private String lastName;
	private String jobPosition;
	private List<Project> projects;
	private Long userId;
	private String userEmail;
	private String userPassword;
	private Long roleId;
	private String roleName;
	private Long wageLevelId;
	private Double wageLevelMin;
	private Double wageLevelMax;
	private boolean isDeleted;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getWageLevelId() {
		return wageLevelId;
	}

	public void setWageLevelId(Long wageLevelId) {
		this.wageLevelId = wageLevelId;
	}

	public Double getWageLevelMin() {
		return wageLevelMin;
	}

	public void setWageLevelMin(Double wageLevelMin) {
		this.wageLevelMin = wageLevelMin;
	}

	public Double getWageLevelMax() {
		return wageLevelMax;
	}

	public void setWageLevelMax(Double wageLevelMax) {
		this.wageLevelMax = wageLevelMax;
	}

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
