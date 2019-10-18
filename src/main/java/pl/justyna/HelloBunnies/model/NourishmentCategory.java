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
	
	public NourishmentCategory() {
	}

	public NourishmentCategory(String name) {
		this.setName(name);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Transient
	private List<Nourishment> nourishments = new ArrayList<Nourishment>();

	@Transient
	private List<OtherNourishment> otherNourishments = new ArrayList<OtherNourishment>();
	
	@Transient
	private List<SeedAndCereal> seedsAndCereals = new ArrayList<SeedAndCereal>();

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

	public List<OtherNourishment> getOtherNourishments() {
		return otherNourishments;
	}

	public void setOtherNourishments(List<OtherNourishment> otherNourishments) {
		this.otherNourishments = otherNourishments;
	}

	public List<SeedAndCereal> getSeedsAndCereals() {
		return seedsAndCereals;
	}

	public void setSeedsAndCereals(List<SeedAndCereal> seedsAndCereals) {
		this.seedsAndCereals = seedsAndCereals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nourishments == null) ? 0 : nourishments.hashCode());
		result = prime * result + ((otherNourishments == null) ? 0 : otherNourishments.hashCode());
		result = prime * result + ((seedsAndCereals == null) ? 0 : seedsAndCereals.hashCode());
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
		if (otherNourishments == null) {
			if (other.otherNourishments != null)
				return false;
		} else if (!otherNourishments.equals(other.otherNourishments))
			return false;
		if (seedsAndCereals == null) {
			if (other.seedsAndCereals != null)
				return false;
		} else if (!seedsAndCereals.equals(other.seedsAndCereals))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NourishmentCategory [id=" + id + ", name=" + name + ", nourishments=" + nourishments
				+ ", otherNourishments=" + otherNourishments + ", seedsAndCereals=" + seedsAndCereals + "]";
	}
	
}
