package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class AnimalRight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Type(type="text")
	private String worldDeclarationOnAnimalRights;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorldDeclarationOnAnimalRights() {
		return worldDeclarationOnAnimalRights;
	}

	public void setWorldDeclarationOnAnimalRights(String worldDeclarationOnAnimalRights) {
		this.worldDeclarationOnAnimalRights = worldDeclarationOnAnimalRights;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((worldDeclarationOnAnimalRights == null) ? 0 : worldDeclarationOnAnimalRights.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalRight other = (AnimalRight) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (worldDeclarationOnAnimalRights == null) {
			if (other.worldDeclarationOnAnimalRights != null)
				return false;
		} else if (!worldDeclarationOnAnimalRights.equals(other.worldDeclarationOnAnimalRights))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AnimalRight [id=" + id + ", name=" + name + ", worldDeclarationOnAnimalRights="
				+ worldDeclarationOnAnimalRights + "]";
	}

}
