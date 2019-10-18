package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import pl.justyna.HelloBunnies.model.base.NameAndDescription;

@Entity
public class Disease extends NameAndDescription{
	
	public Disease() {
	}

	public Disease(Long idDiseaseCategory, String name, String description) {
		this.setIdDiseaseCategory(idDiseaseCategory);
		this.setName(name);
		this.setDescription(description);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idDiseaseCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdDiseaseCategory() {
		return idDiseaseCategory;
	}

	public void setIdDiseaseCategory(Long idDiseaseCategory) {
		this.idDiseaseCategory = idDiseaseCategory;
	}

}
