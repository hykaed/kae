package it.innovaway.kae.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class WageLevel {

	private Long id;
	private Double min;
	private Double max;
	private List<Employee> employees;

	public WageLevel() {
		super();
	}

	public WageLevel(Double min, Double max) {
		super();
		this.min = min;
		this.max = max;
	}

	public WageLevel(Long id, Double min, Double max) {
		super();
		this.id = id;
		this.min = min;
		this.max = max;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	@OneToMany(mappedBy = "wageLevel")
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
