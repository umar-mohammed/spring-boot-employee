package com.scg.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employee.dao.DepartmentDAO;
import com.scg.employee.entity.Department;
import com.scg.employee.mapper.DepartmentMapper;
import com.scg.employee.repository.DepartmentRepository;
import com.scg.employee.vo.DepartmentVO;

@Component
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Autowired
	private DepartmentRepository departmentrepository;

	@Override
	public DepartmentVO saveDepartment(final DepartmentVO departmentvo) {
		final Department department = departmentMapper.voToDepartment(departmentvo);
		return departmentMapper.departmentToVO(departmentrepository.save(department));
	}

	@Override
	public List<DepartmentVO> getDepartments() {
		return departmentMapper.departmentlistToVOList(departmentrepository.findAll());
	}

	@Override
	public DepartmentVO getDepartmentById(final Integer id) {
		return departmentMapper.departmentToVO(departmentrepository.findById(id).orElse(null));
	}

	@Override
	public List<DepartmentVO> findDepartmentByName(final String name) {
		return departmentMapper.departmentlistToVOList(departmentrepository.findByDepartmentName(name));
	}

	@Override
	public String deleteDepartment(final Integer id) {
		departmentrepository.deleteById(id);
		return "Department with  id : " + id + " Removed";
	}

	@Override
	public DepartmentVO updateDepartmentById(final DepartmentVO departmentVO) {
		final Integer id = Integer.valueOf(departmentVO.getDepartmentId());
		System.out.println(id);
		final Department existingDepartment = departmentrepository.findById(id).orElse(null);
		existingDepartment.setDepartmentName(departmentVO.getDepartmentName());
		existingDepartment.setLocation(departmentVO.getLocation());
		return departmentMapper.departmentToVO(departmentrepository.save(existingDepartment));
	}

}
