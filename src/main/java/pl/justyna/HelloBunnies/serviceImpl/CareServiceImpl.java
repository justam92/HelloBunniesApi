package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.Care;
import pl.justyna.HelloBunnies.repository.CareRepository;
import pl.justyna.HelloBunnies.service.CareService;

@Service
public class CareServiceImpl implements CareService {
	
	@Autowired
	private CareRepository careRepository;

	@Override
	public List<Care> selectByIdCareCategory(Long idCategory) {
		return careRepository.findByIdCareCategory(idCategory);
	}

	@Override
	public void create(Care care) {
		careRepository.save(care);
	}

	@Override
	public List<Care> selectAll() {
		return careRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		careRepository.deleteById(id);
	}

}
