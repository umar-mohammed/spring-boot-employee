package com.scg.employee.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.employee.entity.Department;
import com.scg.employee.vo.DepartmentVO;

@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface DepartmentMapper {

	DepartmentVO departmentToVO(final Department department);

	Department voToDepartment(DepartmentVO departmentVO);

	List<DepartmentVO> departmentlistToVOList(List<Department> employee);

	List<Department> voListTodepartmentlist(List<DepartmentVO> employee);

}
