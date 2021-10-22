package com.scg.employee.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.employee.entity.Employee;
import com.scg.employee.vo.EmployeeVO;

@Mapper(componentModel = "spring", uses = { DepartmentMapper.class, LanguageMapper.class })
public interface EmployeeMapper {

	EmployeeVO employeeToVO(final Employee employee);

	Employee voToemployee(EmployeeVO employeeDTO);

	List<EmployeeVO> employeelistToVOList(List<Employee> employee);

	List<Employee> voListToemployeelist(List<EmployeeVO> employee);

}
