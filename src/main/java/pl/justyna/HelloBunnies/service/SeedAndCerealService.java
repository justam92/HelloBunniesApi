package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.SeedAndCereal;

public interface SeedAndCerealService {
	
	List<SeedAndCereal> selectByIdNourishmentCategory(Long idCategory);
	
	void create(SeedAndCereal seedAndCereal);
	
	List<SeedAndCereal> selectAll();
	
	void deleteById(Long id);

}
