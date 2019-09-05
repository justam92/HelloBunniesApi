package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.Poison;
import pl.justyna.HelloBunnies.repository.PoisonRepository;
import pl.justyna.HelloBunnies.service.PoisonService;

@Service
public class PoisonServiceImpl implements PoisonService{

	@Autowired
	private PoisonRepository poisonRepository;
	
	@Override
	public void create(Poison poison) {
		poisonRepository.save(poison);
	}

	@Override
	public List<Poison> selectAll() {
		return poisonRepository.findAll();
	}

}
