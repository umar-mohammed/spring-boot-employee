package com.scg.employee.service;

import java.util.List;

import com.scg.employee.vo.EmployeeVO;

public interface EmployeeService {
	List<EmployeeVO> getEmployees();

	EmployeeVO getEmployeeById(final Integer id);

	List<EmployeeVO> findByFirstName(final String name);

	String deleteEmployee(final Integer id);

	EmployeeVO updateEmployeeById(final EmployeeVO employeeVO);

	EmployeeVO insertEmployee(EmployeeVO employeeVO);

}
