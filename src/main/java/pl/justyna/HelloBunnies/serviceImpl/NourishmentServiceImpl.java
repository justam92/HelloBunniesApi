package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.Nourishment;
import pl.justyna.HelloBunnies.repository.NourishmentRepository;
import pl.justyna.HelloBunnies.service.NourishmentService;

@Service
public class NourishmentServiceImpl implements NourishmentService{

	@Autowired
	private NourishmentRepository nourishmentRepository;
	
	@Override
	public List<Nourishment> selectByIdNourishmentCategory(Long idCategory){
		return nourishmentRepository.findByIdNourishmentCategory(idCategory);
	}

	@Override
	public void create(Nourishment nourishment) {
		nourishmentRepository.save(nourishment);
	}

	@Override
	public List<Nourishment> selectAll() {
		return nourishmentRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		nourishmentRepository.deleteById(id);
		
	}
}
