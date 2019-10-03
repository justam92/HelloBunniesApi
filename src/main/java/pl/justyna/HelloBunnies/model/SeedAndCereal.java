package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SeedAndCereal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idNourishmentCategory;
	
	private String name;
	
	private OilyOrCereal oilyOrCereal;
	
	private String destiny;

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

	public OilyOrCereal getOilyOrCereal() {
		return oilyOrCereal;
	}

	public void setOilyOrCereal(OilyOrCereal oilyOrCereal) {
		this.oilyOrCereal = oilyOrCereal;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destiny == null) ? 0 : destiny.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idNourishmentCategory == null) ? 0 : idNourishmentCategory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((oilyOrCereal == null) ? 0 : oilyOrCereal.hashCode());
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
		SeedAndCereal other = (SeedAndCereal) obj;
		if (destiny == null) {
			if (other.destiny != null)
				return false;
		} else if (!destiny.equals(other.destiny))
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
		if (oilyOrCereal != other.oilyOrCereal)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SeedAndCereal [id=" + id + ", idNourishmentCategory=" + idNourishmentCategory + ", name=" + name
				+ ", oilyOrCereal=" + oilyOrCereal + ", destiny=" + destiny + "]";
	}

}
