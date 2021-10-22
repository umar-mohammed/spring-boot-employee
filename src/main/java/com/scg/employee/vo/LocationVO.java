package com.scg.employee.vo;

import java.util.Set;

import com.scg.employee.entity.Department;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationVO {

	private int id;
	private String locationName;
	private Set<Department> department;

}
