package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.AnimalRight;
import pl.justyna.HelloBunnies.repository.AnimalRightRepository;
import pl.justyna.HelloBunnies.service.AnimalRightService;

@Service
public class AnimalRightServiceImpl implements AnimalRightService {
	
	@Autowired
	private AnimalRightRepository animalRightRepository;

	@Override
	public void create(AnimalRight animalRight) {
		animalRightRepository.save(animalRight);
	}

	@Override
	public List<AnimalRight> selectAll() {
		return animalRightRepository.findAll();
	}

}
