package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.DiseaseType;
import pl.justyna.HelloBunnies.repository.DiseaseTypeRepository;
import pl.justyna.HelloBunnies.service.DiseaseService;
import pl.justyna.HelloBunnies.service.DiseaseTypeService;

@Service
public class DiseaseTypeServiceImpl implements DiseaseTypeService{
	
	@Autowired
	private DiseaseTypeRepository diseaseTypeRepository;
	
	@Autowired
	private DiseaseService diseaseService;

	@Override
	public List<DiseaseType> selectByIdDiseaseCategory(Long idDiseaseCategory) {
		return diseaseTypeRepository.findByIdDiseaseCategory(idDiseaseCategory);
	}

	@Override
	public void create(DiseaseType diseaseType) {
		diseaseTypeRepository.save(diseaseType);
	}

	@Override
	public List<DiseaseType> selectAll() {
		return diseaseTypeRepository.findAll();
	}

	@Override
	public DiseaseType selectById(Long id) {
		DiseaseType diseaseType = diseaseTypeRepository.findById(id).get();
		
		diseaseType.setDiseases(diseaseService.selectByIdDiseaseType(id));
		
		return diseaseType;
	}

	@Override
	public void deleteById(Long id) {
		diseaseTypeRepository.deleteById(id);
	}

}
