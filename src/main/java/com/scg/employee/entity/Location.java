package com.scg.employee.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "location")
public class Location {
	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "location", nullable = false)
	private String locationName;

	@ManyToMany(mappedBy = "location", cascade = CascadeType.PERSIST)
	private Set<Department> department;

}
