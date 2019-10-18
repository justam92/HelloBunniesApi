package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import pl.justyna.HelloBunnies.model.base.NameAndDescription;

@Entity
public class Care extends NameAndDescription{
	
	public Care() {
	}

	public Care(Long idCareCategory, String name, String description) {
		this.setIdCareCategory(idCareCategory);
		this.setName(name);
		this.setDescription(description);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idCareCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCareCategory() {
		return idCareCategory;
	}

	public void setIdCareCategory(Long idCareCategory) {
		this.idCareCategory = idCareCategory;
	}
	
}
