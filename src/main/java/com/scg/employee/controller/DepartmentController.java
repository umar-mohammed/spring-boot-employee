package com.scg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employee.service.DepartmentService;
import com.scg.employee.vo.DepartmentVO;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public DepartmentVO saveDepartment(@RequestBody final DepartmentVO departmentVO) {
		return departmentService.saveDepartment(departmentVO);

	}

	@GetMapping()
	public List<DepartmentVO> getdepartment() {
		return departmentService.getDepartment();

	}

	@GetMapping("/{id}")
	public DepartmentVO getDepartmentById(@PathVariable final Integer id) {
		return departmentService.getDepartmentById(id);

	}

	@GetMapping("/{name}")
	public List<DepartmentVO> findDepartmentByName(@PathVariable final String name) {
		return departmentService.findByName(name);
	}

	@DeleteMapping("/{id}")
	public String deleteDepartment(@PathVariable final Integer id) {
		return departmentService.deleteDepartmentById(id);

	}

	@PutMapping("/update")
	public DepartmentVO updateDepartmentById(@RequestBody final DepartmentVO departmentVO) {
		return departmentService.updateDepartmentById(departmentVO);
	}

}
