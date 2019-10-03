package pl.justyna.HelloBunnies.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OilyOrCereal {

	OILY("oleisty"), CEREAL("zboże");
	
	private String value;
	
	private OilyOrCereal(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	@JsonValue
	public String toJson() {
		return value;
	}
	
}
