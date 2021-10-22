package com.scg.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scg.employee.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	List<Department> findByDepartmentName(String name);

}
