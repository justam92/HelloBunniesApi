package pl.justyna.HelloBunnies.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class NourishmentCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Transient
	private List<Nourishment> nourishments = new ArrayList<Nourishment>();

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

	public List<Nourishment> getNourishments() {
		return nourishments;
	}

	public void setNourishments(List<Nourishment> nourishments) {
		this.nourishments = nourishments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nourishments == null) ? 0 : nourishments.hashCode());
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
		NourishmentCategory other = (NourishmentCategory) obj;
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
		if (nourishments == null) {
			if (other.nourishments != null)
				return false;
		} else if (!nourishments.equals(other.nourishments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NourishmentCategory [id=" + id + ", name=" + name + ", nourishments=" + nourishments + "]";
	} 


	
}
