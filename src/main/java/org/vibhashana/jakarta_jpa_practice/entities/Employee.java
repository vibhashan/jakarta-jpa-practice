package org.vibhashana.jakarta_jpa_practice.entities;

import org.vibhashana.jakarta_jpa_practice.converters.GenderConverter;
import org.vibhashana.jakarta_jpa_practice.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name", length = 100)
	private String name;

	@Column(name = "gender")
	@Convert(converter = GenderConverter.class) // Optional if autoApply=true
	private Gender gender;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
}