package com.scg.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scg.employee.dao.LanguageDAO;
import com.scg.employee.entity.Language;
import com.scg.employee.mapper.LanguageMapper;
import com.scg.employee.repository.LanguageRepository;
import com.scg.employee.vo.LanguageVO;

@Component
public class LanguageDAOImpl implements LanguageDAO {

	@Autowired
	private LanguageMapper languageMapper;

	@Autowired
	private LanguageRepository languageRepository;

	@Override
	public LanguageVO saveLanguage(final LanguageVO languageVO) {
		final Language language = languageMapper.voTolangauge(languageVO);
		return languageMapper.langaugeToVO(languageRepository.save(language));
	}

	@Override
	public List<LanguageVO> getLanguages() {
		return languageMapper.langaugelistToVOList(languageRepository.findAll());
	}

	@Override
	public LanguageVO getlanguageById(final Integer id) {
		return languageMapper.langaugeToVO(languageRepository.findById(id).orElse(null));
	}

	@Override
	@Transactional(propagation = Propagation.NEVER)
	public String deleteLanguage(final Integer id) {
		languageRepository.deleteById(id);
		return "Language with id : " + id + " Removed";
	}

	@Override
	public List<String> languageWithEmployeeAssociated() {
		return languageRepository.languageWithEmployeeAssociated();
	}

	@Override
	public List<String> languageWithNoEmployeeAssociated() {
		return languageRepository.languageWithNoEmployeeAssociated();
	}

}
