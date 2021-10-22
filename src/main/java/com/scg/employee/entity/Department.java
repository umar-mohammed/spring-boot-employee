package com.scg.employee.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	@Column(name = "department_Name")
//	private String departmentName;
//	@Column(name = "location")
//	private String location;
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "department")
//	private Employee employee;

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	@Column(name = "department_name")
	private String departmentName;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "department", cascade = CascadeType.PERSIST)
	private Set<Employee> employee;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "department_location", joinColumns = @JoinColumn(name = "department_id"), inverseJoinColumns = @JoinColumn(name = "location_id"))
	private Set<Location> location;
}
