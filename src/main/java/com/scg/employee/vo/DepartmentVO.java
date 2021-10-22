package com.scg.employee.vo;

import java.util.Set;

import com.scg.employee.entity.Employee;
import com.scg.employee.entity.Location;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentVO {
//	@JsonProperty("departmentId")
//	private int id;
//	@JsonProperty("departmentname")
//	private String departmentName;
//	@JsonProperty("location")
//	private String location;
//	@JsonProperty("employee")
//	private Employee employee;

	private int departmentId;

	private String departmentName;

	private Set<Employee> employee;

	private Set<Location> location;

}
