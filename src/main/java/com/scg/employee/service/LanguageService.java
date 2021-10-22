package com.scg.employee.service;

import java.util.List;

import com.scg.employee.vo.LanguageVO;

public interface LanguageService {
	List<LanguageVO> getLanguages();

	LanguageVO getLanguageById(final Integer id);

	String deleteLanguage(final Integer id);

	LanguageVO insertLanguage(LanguageVO languageVO);

	List<String> languageWithEmployeeAssociated();

	List<String> languageWithNoEmployeeAssociated();

}
