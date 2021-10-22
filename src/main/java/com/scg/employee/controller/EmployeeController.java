package com.scg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employee.feign.proxy.QualifierDemoProxy;
import com.scg.employee.service.EmployeeService;
import com.scg.employee.vo.EmployeeVO;
import com.scg.exceptions.ErrorCode;
import com.scg.exceptions.NotFoundException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private QualifierDemoProxy qualifierDemoProxy;

	@PostMapping
	public EmployeeVO save(@RequestBody final EmployeeVO employeeVO) {
		return employeeService.insertEmployee(employeeVO);

	}

	@GetMapping
	public ResponseEntity<List<EmployeeVO>> getEmployees() {
		if (employeeService.getEmployees().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable final Integer id) {
		if (null == employeeService.getEmployeeById(id)) {
			throw new NotFoundException(ErrorCode.EMPLOYEE_NOT_FOUND);
		}
		return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}

//	@GetMapping("/{name}")
//	public List<EmployeeVO> findByName(@PathVariable final String name) {
//		return employeeService.findByFirstName(name);
//	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable final Integer id) {
		return employeeService.deleteEmployee(id);

	}

	@PutMapping
	public EmployeeVO updateEmployeeById(@RequestBody final EmployeeVO employeeVO) {
		return employeeService.updateEmployeeById(employeeVO);
	}

//	@GetMapping("/department")
//	public List<DepartmentVO> getdepartment() {
//		return departmentService.getDepartment();
//
//	}

	@GetMapping("/feigndemo")
	public String testFeign() {
		return qualifierDemoProxy.inputName1();
	}

}
