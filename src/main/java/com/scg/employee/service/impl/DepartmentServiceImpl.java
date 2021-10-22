package com.scg.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employee.dao.DepartmentDAO;
import com.scg.employee.service.DepartmentService;
import com.scg.employee.vo.DepartmentVO;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	public DepartmentVO saveDepartment(final DepartmentVO departmentVO) {
		return departmentDAO.saveDepartment(departmentVO);
	}

	@Override
	public List<DepartmentVO> getDepartment() {
		return departmentDAO.getDepartments();
	}

	@Override
	public DepartmentVO getDepartmentById(final Integer id) {
		return departmentDAO.getDepartmentById(id);
	}

	@Override
	public List<DepartmentVO> findByName(final String name) {
		return departmentDAO.findDepartmentByName(name);
	}

	@Override
	public String deleteDepartmentById(final Integer id) {
		return departmentDAO.deleteDepartment(id);
	}

	@Override
	public DepartmentVO updateDepartmentById(final DepartmentVO departmentVO) {
		return departmentDAO.updateDepartmentById(departmentVO);
	}

}
