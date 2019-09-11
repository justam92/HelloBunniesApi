package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.AnimalRight;

public interface AnimalRightService {

	void create(AnimalRight animalRight);
	
	List<AnimalRight> selectAll();
}
