package com.innovaway.kao1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wagelevel")
public class WageLevel extends Base {
    private Double min;
    private Double max;
    @OneToMany(mappedBy = "wagelevel")
    private List<Employee>  employee;
}
