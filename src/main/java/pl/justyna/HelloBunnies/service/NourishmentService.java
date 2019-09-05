package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.Nourishment;

public interface NourishmentService {
	List<Nourishment> selectByIdNourishmentCategory(Long idCategory);
	
	void create(Nourishment nourishment);
	
	List<Nourishment> selectAll();
	
	void deleteById(Long id);
}
