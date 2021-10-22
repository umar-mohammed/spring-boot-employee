package com.scg.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.scg.employee.audit.EmployeeAuditListener;
import com.scg.employee.audit.EmployeeAuditable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employees")
@EntityListeners(EmployeeAuditListener.class)
public class Employee implements EmployeeAuditable {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	@Column(name = "first_Name")
//	private String firstName;
//	@Column(name = "last_Name")
//	private String lastName;
//	@Column(name = "email")
//	private String email;
//
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name = "id")
//	private Department department;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "employeeName", nullable = false)
	private String employeeName;

	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Department department;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Language.class)
	@JoinColumn(name = "el_fk", referencedColumnName = "id")
	private List<Language> language;

	@Embedded
	private EmployeeAudit audit;

}
