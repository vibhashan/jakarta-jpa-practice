package org.vibhashana.jakarta_jpa_practice.converters;

import org.vibhashana.jakarta_jpa_practice.enums.Gender;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, String> {
	@Override
	public String convertToDatabaseColumn(Gender gender) {
		switch (gender) {
		case MALE:
			return "M";
		case FEMALE:
			return "F";
		default:
			throw new IllegalArgumentException("Unexpected value during db column conversion: " + gender);
		}
	}

	@Override
	public Gender convertToEntityAttribute(String gender) {
		switch (gender) {
		case "M":
			return Gender.MALE;
		case "F":
			return Gender.FEMALE;
		default:
			throw new IllegalArgumentException("Unexpected value during entity attrribute conversion: " + gender);
		}
	}

}
