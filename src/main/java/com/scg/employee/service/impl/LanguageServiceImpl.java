package com.scg.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employee.dao.LanguageDAO;
import com.scg.employee.service.LanguageService;
import com.scg.employee.vo.LanguageVO;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageDAO languageDAO;

	@Override
	public List<LanguageVO> getLanguages() {
		return languageDAO.getLanguages();
	}

	@Override
	public LanguageVO getLanguageById(final Integer id) {
		return languageDAO.getlanguageById(id);
	}

	@Override
	public String deleteLanguage(final Integer id) {
		return languageDAO.deleteLanguage(id);
	}

	@Override
	public LanguageVO insertLanguage(final LanguageVO languageVO) {
		return languageDAO.saveLanguage(languageVO);
	}

	@Override
	public List<String> languageWithEmployeeAssociated() {
		return languageDAO.languageWithEmployeeAssociated();
	}

	@Override
	public List<String> languageWithNoEmployeeAssociated() {
		return languageDAO.languageWithNoEmployeeAssociated();
	}

}
