package pl.justyna.HelloBunnies.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class DiseaseType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idDiseaseCategory;
	
	private String name;
	
	@Transient
	private List<Disease> diseases = new ArrayList<Disease>();

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseases == null) ? 0 : diseases.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idDiseaseCategory == null) ? 0 : idDiseaseCategory.hashCode());
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
		DiseaseType other = (DiseaseType) obj;
		if (diseases == null) {
			if (other.diseases != null)
				return false;
		} else if (!diseases.equals(other.diseases))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idDiseaseCategory == null) {
			if (other.idDiseaseCategory != null)
				return false;
		} else if (!idDiseaseCategory.equals(other.idDiseaseCategory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiseaseType [id=" + id + ", idDiseaseCategory=" + idDiseaseCategory + ", name=" + name + ", diseases="
				+ diseases + "]";
	}
	
}
