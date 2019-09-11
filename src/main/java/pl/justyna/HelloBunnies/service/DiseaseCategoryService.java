package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.DiseaseCategory;

public interface DiseaseCategoryService {

	void create(DiseaseCategory diseaseCategory);
	
	List<DiseaseCategory> selectAll();
	
	DiseaseCategory selectById(Long id);
	
	void deleteById(Long id);
}
