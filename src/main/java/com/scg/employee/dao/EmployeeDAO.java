package com.scg.employee.dao;

import java.util.List;

import com.scg.employee.vo.EmployeeVO;

public interface EmployeeDAO {
	EmployeeVO insertEmployee(final EmployeeVO employeeVO);

	List<EmployeeVO> getEmployees();

	EmployeeVO getEmployeeById(final Integer id);

	List<EmployeeVO> findByFirstName(final String name);

	String deleteEmployee(final Integer id);

	EmployeeVO updateEmployeeById(final EmployeeVO employeeVO);

}
