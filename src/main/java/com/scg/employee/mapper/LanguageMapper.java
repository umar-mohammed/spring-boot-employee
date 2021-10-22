package com.scg.employee.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.employee.entity.Language;
import com.scg.employee.vo.LanguageVO;

@Mapper(componentModel = "spring")
public interface LanguageMapper {

	LanguageVO langaugeToVO(final Language language);

	Language voTolangauge(LanguageVO languageVO);

	List<LanguageVO> langaugelistToVOList(List<Language> language);

	List<Language> voListTolangaugelist(List<LanguageVO> languageVO);

}
