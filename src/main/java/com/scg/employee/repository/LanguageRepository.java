package com.scg.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.scg.employee.entity.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

	@Query(value = "SELECT distinct l.language FROM language l join employees e on (el_fk = e.id )", nativeQuery = true)
	List<String> languageWithEmployeeAssociated();

	@Query("SELECT distinct e.employeeName FROM Language l join Employee e on (el_fk != e.id )")
	List<String> languageWithNoEmployeeAssociated();

}
