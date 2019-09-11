package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.FirstBunny;

public interface FirstBunnyService {

	void create(FirstBunny firstBunny);

	List<FirstBunny> selectAll();
}
