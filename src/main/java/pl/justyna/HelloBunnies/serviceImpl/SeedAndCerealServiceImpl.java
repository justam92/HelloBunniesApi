package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.SeedAndCereal;
import pl.justyna.HelloBunnies.repository.SeedAndCerealRepository;
import pl.justyna.HelloBunnies.service.SeedAndCerealService;

@Service
public class SeedAndCerealServiceImpl implements SeedAndCerealService{

	@Autowired
	private SeedAndCerealRepository seedAndCerealRepository;

	@Override
	public List<SeedAndCereal> selectByIdNourishmentCategory(Long idCategory) {
		return seedAndCerealRepository.findByIdNourishmentCategory(idCategory);
	}

	@Override
	public void create(SeedAndCereal seedAndCereal) {
		seedAndCerealRepository.save(seedAndCereal);
	}

	@Override
	public List<SeedAndCereal> selectAll() {
		return seedAndCerealRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		seedAndCerealRepository.existsById(id);
	}
	
	
}
