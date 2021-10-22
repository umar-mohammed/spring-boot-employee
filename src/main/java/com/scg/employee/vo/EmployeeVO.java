package com.scg.employee.vo;

import java.util.List;

import com.scg.employee.entity.EmployeeAudit;
import com.scg.employee.entity.Language;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeVO {
//	@JsonProperty("employeeId")
//	private int id;
//	@JsonProperty("FirstName")
//	private String firstName;
//	@JsonProperty("LastName")
//	private String lastName;
//	@JsonProperty("email")
//	private String email;
//	@JsonProperty("department")
//	private DepartmentVO department;

	private int id;

	private String employeeName;

	private DepartmentVO department;

	private List<Language> language;

	private EmployeeAudit audit;

}
