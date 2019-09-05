package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.NourishmentCategory;

public interface NourishmentCategoryService {
	
	void create(NourishmentCategory nourishmentCategory);
	
	List<NourishmentCategory> selectAll();
	
	NourishmentCategory selectById(Long id);
	
	void deleteById(Long id);
}
