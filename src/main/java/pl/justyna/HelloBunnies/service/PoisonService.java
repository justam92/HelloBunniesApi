package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.Poison;

public interface PoisonService {

	void create(Poison poison);
	
	List<Poison> selectAll();
}
