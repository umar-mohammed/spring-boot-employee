package com.scg.employee.dao;

import java.util.List;

import com.scg.employee.vo.DepartmentVO;

public interface DepartmentDAO {

	DepartmentVO saveDepartment(final DepartmentVO departmentvo);

	List<DepartmentVO> getDepartments();

	DepartmentVO getDepartmentById(final Integer id);

	List<DepartmentVO> findDepartmentByName(final String name);

	String deleteDepartment(final Integer id);

	DepartmentVO updateDepartmentById(final DepartmentVO departmentVO);

}
