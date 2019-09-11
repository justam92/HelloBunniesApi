package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.DiseaseType;

public interface DiseaseTypeService {

	List<DiseaseType> selectByIdDiseaseCategory(Long idDiseaseCategory);
	
	void create(DiseaseType diseaseType);
	
	List<DiseaseType> selectAll();
	
	DiseaseType selectById(Long id);
	
	void deleteById(Long id);
}
