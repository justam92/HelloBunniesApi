package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import pl.justyna.HelloBunnies.model.base.NameAndDescription;

@Entity
public class Disease extends NameAndDescription{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idDiseaseType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdDiseaseType() {
		return idDiseaseType;
	}

	public void setIdDiseaseType(Long idDiseaseType) {
		this.idDiseaseType = idDiseaseType;
	}
	
}
