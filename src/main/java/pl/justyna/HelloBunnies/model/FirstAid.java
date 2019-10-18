package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import pl.justyna.HelloBunnies.model.base.NameAndDescription;

@Entity
public class FirstAid extends NameAndDescription {

	public FirstAid() {
	}

	public FirstAid(String name, String description) {
		this.setName(name);
		this.setDescription(description);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
