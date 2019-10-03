package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.OtherNourishment;

public interface OtherNourishmentService {
	List<OtherNourishment> selectByIdNourishmentCategory(Long idCategory);
	
	void create(OtherNourishment otherNourishment);
	
	List<OtherNourishment> selectAll();
	
	void deleteById(Long id);
}
