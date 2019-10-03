package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.OtherNourishment;
import pl.justyna.HelloBunnies.repository.OtherNourishmentRepository;
import pl.justyna.HelloBunnies.service.OtherNourishmentService;

@Service
public class OtherNourishmentServiceImpl implements OtherNourishmentService {

	@Autowired
	private OtherNourishmentRepository otherNourishmentRepository;

	@Override
	public List<OtherNourishment> selectByIdNourishmentCategory(Long idCategory) {
		return otherNourishmentRepository.findByIdNourishmentCategory(idCategory);
	}

	@Override
	public void create(OtherNourishment otherNourishment) {
		otherNourishmentRepository.save(otherNourishment);
	}

	@Override
	public List<OtherNourishment> selectAll() {
		return otherNourishmentRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		otherNourishmentRepository.deleteById(id);
	}
	
	
}
