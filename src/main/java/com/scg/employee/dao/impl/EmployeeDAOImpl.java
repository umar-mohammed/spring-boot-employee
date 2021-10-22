package com.scg.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employee.dao.EmployeeDAO;
import com.scg.employee.entity.Employee;
import com.scg.employee.mapper.EmployeeMapper;
import com.scg.employee.repository.EmployeeRepository;
import com.scg.employee.vo.EmployeeVO;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public EmployeeVO insertEmployee(final EmployeeVO employeeVO) {
		final Employee employee = employeeMapper.voToemployee(employeeVO);
		return employeeMapper.employeeToVO(employeerepository.save(employee));
	}

	@Override
	public List<EmployeeVO> getEmployees() {
		return employeeMapper.employeelistToVOList(employeerepository.findAll());
	}

	@Override
	public List<EmployeeVO> findByFirstName(final String name) {
		return employeeMapper.employeelistToVOList(employeerepository.findByEmployeeName(name));
	}

	@Override
	public EmployeeVO getEmployeeById(final Integer id) {
		return employeeMapper.employeeToVO(employeerepository.findById(id).orElse(null));
//		return employeeMapper.employeeToVO(employeerepository.findById(id)
//				.orElseThrow(() -> new NotFoundException("Customer not found with id " + id)));
	}

	@Override
	public String deleteEmployee(final Integer id) {
		employeerepository.deleteById(id);
		return "Employee id : " + id + " Removed";
	}

	@Override
	public EmployeeVO updateEmployeeById(final EmployeeVO employeeVO) {
		final Integer id = Integer.valueOf(employeeVO.getId());
		System.out.println(id);
		final Employee existingEmployee = employeerepository.findById(id).orElse(null);
		existingEmployee.setEmployeeName(employeeVO.getEmployeeName());
		return employeeMapper.employeeToVO(employeerepository.save(existingEmployee));

	}

}
