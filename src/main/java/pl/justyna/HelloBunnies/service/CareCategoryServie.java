package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.CareCategory;

public interface CareCategoryServie {
	
	void create(CareCategory careCategory);
	
	List<CareCategory> selectAll();
	
	CareCategory selectByID(Long id);
	
	void deleteById(Long id);

}
