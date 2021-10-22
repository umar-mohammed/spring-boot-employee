package com.scg.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employee.dao.EmployeeDAO;
import com.scg.employee.service.EmployeeService;
import com.scg.employee.vo.EmployeeVO;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public EmployeeVO insertEmployee(final EmployeeVO employeeVO) {
		return employeeDAO.insertEmployee(employeeVO);

	}

	@Override
	public List<EmployeeVO> getEmployees() {
		return employeeDAO.getEmployees();
	}

//	@Override
//	public Page<Employee> getEmployeesByPagination(final int pageNumber) {
//		return employeeDAO.getEmployeesByPagination(pageNumber);
//	}

	@Override
	public EmployeeVO getEmployeeById(final Integer id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public List<EmployeeVO> findByFirstName(final String name) {
		return employeeDAO.findByFirstName(name);
	}

	@Override
	public String deleteEmployee(final Integer id) {
		return employeeDAO.deleteEmployee(id);
	}

	@Override
	public EmployeeVO updateEmployeeById(final EmployeeVO employeeVO) {
		return employeeDAO.updateEmployeeById(employeeVO);

	}

}
