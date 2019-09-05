package pl.justyna.HelloBunnies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poison {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String whyCanNotThisBeGivenToARabbit;

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

	public String getWhyCanNotThisBeGivenToARabbit() {
		return whyCanNotThisBeGivenToARabbit;
	}

	public void setWhyCanNotThisBeGivenToARabbit(String whyCanNotThisBeGivenToARabbit) {
		this.whyCanNotThisBeGivenToARabbit = whyCanNotThisBeGivenToARabbit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((whyCanNotThisBeGivenToARabbit == null) ? 0 : whyCanNotThisBeGivenToARabbit.hashCode());
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
		Poison other = (Poison) obj;
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
		if (whyCanNotThisBeGivenToARabbit == null) {
			if (other.whyCanNotThisBeGivenToARabbit != null)
				return false;
		} else if (!whyCanNotThisBeGivenToARabbit.equals(other.whyCanNotThisBeGivenToARabbit))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Poison [id=" + id + ", name=" + name + ", whyCanNotThisBeGivenToARabbit="
				+ whyCanNotThisBeGivenToARabbit + "]";
	}
	
}
