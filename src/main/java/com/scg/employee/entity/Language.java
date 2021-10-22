package com.scg.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "language")
public class Language {

	@Id
	private int id;

	@Column(name = "language", nullable = false)
	private String languagename;

}
