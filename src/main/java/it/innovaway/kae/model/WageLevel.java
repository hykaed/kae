package it.innovaway.kae.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class WageLevel {
    private Long id;
    private Double min;
    private Double max;

    private List<Employee> employees;


    public WageLevel() {
    }

    public WageLevel(Double min, Double max, List<Employee> employees) {
        this.min = min;
        this.max = max;
        this.employees = employees;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMin(Double min) {
        this.min = min;
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
