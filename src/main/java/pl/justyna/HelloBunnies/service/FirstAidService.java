package pl.justyna.HelloBunnies.service;

import java.util.List;

import pl.justyna.HelloBunnies.model.FirstAid;

public interface FirstAidService {

	void create(FirstAid firstAid);

	List<FirstAid> selectAll();

	void deleteById(Long id);
}
