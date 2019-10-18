package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import pl.justyna.HelloBunnies.model.base.NameAndDescription;

@Entity
public class OtherNourishment extends NameAndDescription{
	
	public OtherNourishment() {
	}

	public OtherNourishment(Long idNourishmentCategory, String name, String description) {
		this.setIdNourishmentCategory(idNourishmentCategory);
		this.setName(name);
		this.setDescription(description);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idNourishmentCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdNourishmentCategory() {
		return idNourishmentCategory;
	}

	public void setIdNourishmentCategory(Long idNourishmentCategory) {
		this.idNourishmentCategory = idNourishmentCategory;
	}
	
	
}
