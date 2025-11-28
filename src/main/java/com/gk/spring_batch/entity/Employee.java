package com.gk.spring_batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	private Long id;
	private String name;
	private String designation;
	private double basicSalary;
	private double hra;
	private double allownaces;
	private double deductions;
	private double grossSalary;
	private double netSalary;
	private String month;

}
