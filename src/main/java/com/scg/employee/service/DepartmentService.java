package com.scg.employee.service;

import java.util.List;

import com.scg.employee.vo.DepartmentVO;

public interface DepartmentService {

	DepartmentVO saveDepartment(DepartmentVO departmentVO);

	List<DepartmentVO> getDepartment();

	DepartmentVO getDepartmentById(final Integer id);

	List<DepartmentVO> findByName(final String name);

	String deleteDepartmentById(final Integer id);

	DepartmentVO updateDepartmentById(DepartmentVO departmentVO);
}
