package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nourishment {
	
	public Nourishment() {
	}

	public Nourishment(Long idNourishmentCategory, String name, String vitaminC, String calcium, String phosphorus, String administrationFrequency, String whatCanYouGive) {
		this.setIdNourishmentCategory(idNourishmentCategory);
		this.setName(name);
		this.setVitaminC(vitaminC);
		this.setCalcium(calcium);
		this.setPhosphorus(phosphorus);
		this.setAdministrationFrequency(administrationFrequency);
		this.setWhatCanYouGive(whatCanYouGive);
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idNourishmentCategory;
	
	private String name;
	
	private String vitaminC;
	
	private String calcium;
	
	private String phosphorus;
	
	private String administrationFrequency;
	
	private String whatCanYouGive;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVitaminC() {
		return vitaminC;
	}

	public void setVitaminC(String vitaminC) {
		this.vitaminC = vitaminC;
	}

	public String getCalcium() {
		return calcium;
	}

	public void setCalcium(String calcium) {
		this.calcium = calcium;
	}

	public String getPhosphorus() {
		return phosphorus;
	}

	public void setPhosphorus(String phosphorus) {
		this.phosphorus = phosphorus;
	}

	public String getAdministrationFrequency() {
		return administrationFrequency;
	}

	public void setAdministrationFrequency(String administrationFrequency) {
		this.administrationFrequency = administrationFrequency;
	}

	public String getWhatCanYouGive() {
		return whatCanYouGive;
	}

	public void setWhatCanYouGive(String whatCanYouGive) {
		this.whatCanYouGive = whatCanYouGive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((administrationFrequency == null) ? 0 : administrationFrequency.hashCode());
		result = prime * result + ((calcium == null) ? 0 : calcium.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idNourishmentCategory == null) ? 0 : idNourishmentCategory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phosphorus == null) ? 0 : phosphorus.hashCode());
		result = prime * result + ((vitaminC == null) ? 0 : vitaminC.hashCode());
		result = prime * result + ((whatCanYouGive == null) ? 0 : whatCanYouGive.hashCode());
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
		Nourishment other = (Nourishment) obj;
		if (administrationFrequency == null) {
			if (other.administrationFrequency != null)
				return false;
		} else if (!administrationFrequency.equals(other.administrationFrequency))
			return false;
		if (calcium == null) {
			if (other.calcium != null)
				return false;
		} else if (!calcium.equals(other.calcium))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idNourishmentCategory == null) {
			if (other.idNourishmentCategory != null)
				return false;
		} else if (!idNourishmentCategory.equals(other.idNourishmentCategory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phosphorus == null) {
			if (other.phosphorus != null)
				return false;
		} else if (!phosphorus.equals(other.phosphorus))
			return false;
		if (vitaminC == null) {
			if (other.vitaminC != null)
				return false;
		} else if (!vitaminC.equals(other.vitaminC))
			return false;
		if (whatCanYouGive == null) {
			if (other.whatCanYouGive != null)
				return false;
		} else if (!whatCanYouGive.equals(other.whatCanYouGive))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nourishment [id=" + id + ", idNourishmentCategory=" + idNourishmentCategory + ", name=" + name
				+ ", vitaminC=" + vitaminC + ", calcium=" + calcium + ", phosphorus=" + phosphorus
				+ ", administrationFrequency=" + administrationFrequency + ", whatCanYouGive=" + whatCanYouGive + "]";
	}

}
