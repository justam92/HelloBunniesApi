package pl.justyna.HelloBunnies.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class DiseaseCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Transient
	private List<DiseaseType> diseasesTypes = new ArrayList<DiseaseType>();

	@Override
	public String toString() {
		return "DiseaseCategory [id=" + id + ", name=" + name + ", diseasesTypes=" + diseasesTypes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseasesTypes == null) ? 0 : diseasesTypes.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		DiseaseCategory other = (DiseaseCategory) obj;
		if (diseasesTypes == null) {
			if (other.diseasesTypes != null)
				return false;
		} else if (!diseasesTypes.equals(other.diseasesTypes))
			return false;
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
		return true;
	}

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

	public List<DiseaseType> getDiseasesTypes() {
		return diseasesTypes;
	}

	public void setDiseasesTypes(List<DiseaseType> diseasesTypes) {
		this.diseasesTypes = diseasesTypes;
	}

	
}
