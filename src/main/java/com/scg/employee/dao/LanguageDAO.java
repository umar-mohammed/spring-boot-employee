package com.scg.employee.dao;

import java.util.List;

import com.scg.employee.vo.LanguageVO;

public interface LanguageDAO {
	LanguageVO saveLanguage(final LanguageVO languageVO);

	List<LanguageVO> getLanguages();

	LanguageVO getlanguageById(final Integer id);

	String deleteLanguage(final Integer id);

	List<String> languageWithEmployeeAssociated();

	List<String> languageWithNoEmployeeAssociated();

}
