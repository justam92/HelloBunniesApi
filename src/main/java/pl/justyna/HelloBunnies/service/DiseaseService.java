package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.Disease;

public interface DiseaseService {

	List<Disease> selectByIdDiseaseCategory(Long idDiseaseCategory);
	
	void create(Disease disease);
	
	List<Disease> selectAll();
	
	void deleteById(Long id);
}
