package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.Care;

public interface CareService {
	List<Care> selectByIdCareCategory(Long idCategory);
	
	void create(Care care);
	
	List<Care> selectAll();
	
	void deleteById(Long id);

}
