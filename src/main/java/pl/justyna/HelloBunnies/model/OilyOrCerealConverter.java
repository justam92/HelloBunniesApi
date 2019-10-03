package pl.justyna.HelloBunnies.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import pl.justyna.HelloBunnies.model.OilyOrCereal;

@Converter(autoApply = true)
public class OilyOrCerealConverter implements AttributeConverter<OilyOrCereal, String> {

	@Override
	public String convertToDatabaseColumn(OilyOrCereal value) {
		if (value == null) {
			return null;
		}

		return value.name();
	}

	@Override
	public OilyOrCereal convertToEntityAttribute(String dbData) {
		if (dbData == null)
			return null;

		for (OilyOrCereal oilyOrCereal : OilyOrCereal.values()) {
			if (oilyOrCereal.name().equals(dbData)) {
				return oilyOrCereal;
			}
		}

		throw new IllegalArgumentException(dbData + " not supported.");
	}

}
