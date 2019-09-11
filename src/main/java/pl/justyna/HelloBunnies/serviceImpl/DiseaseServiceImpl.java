package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.Disease;
import pl.justyna.HelloBunnies.repository.DiseaseRepository;
import pl.justyna.HelloBunnies.service.DiseaseService;

@Service
public class DiseaseServiceImpl implements DiseaseService{
	
	@Autowired
	private DiseaseRepository diseaseRepository;

	@Override
	public List<Disease> selectByIdDiseaseType(Long idDiseaseType) {
		return diseaseRepository.findByIdDiseaseType(idDiseaseType);
	}

	@Override
	public void create(Disease disease) {
		diseaseRepository.save(disease);
	}

	@Override
	public List<Disease> selectAll() {
		return diseaseRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		diseaseRepository.deleteById(id);
	}

}
