package com.scg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employee.service.LanguageService;
import com.scg.employee.vo.LanguageVO;

@RestController
@RequestMapping("/language")
public class LanguageController {

	@Autowired
	private LanguageService languageService;

	@PostMapping()
	public LanguageVO save(@RequestBody final LanguageVO languageVO) {
		return languageService.insertLanguage(languageVO);

	}

	@GetMapping()
	public List<LanguageVO> getLanguages() {
		return languageService.getLanguages();

	}

	@GetMapping("/{id}")
	public LanguageVO getLanguageId(@PathVariable final Integer id) {
		return languageService.getLanguageById(id);

	}

	@Transactional
	@DeleteMapping("/{id}")
	public String deleteLanguage(@PathVariable final Integer id) {
		return languageService.deleteLanguage(id);

	}

	@GetMapping("/active")
	public List<String> languageWithEmployeeAssociated() {
		return languageService.languageWithEmployeeAssociated();
	}

	@GetMapping("/inactive")
	public List<String> languageWithNoEmployeeAssociated() {
		return languageService.languageWithNoEmployeeAssociated();
	}

}
