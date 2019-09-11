package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.DiseaseCategory;
import pl.justyna.HelloBunnies.repository.DiseaseCategoryRepository;
import pl.justyna.HelloBunnies.service.DiseaseCategoryService;
import pl.justyna.HelloBunnies.service.DiseaseTypeService;

@Service
public class DiseaseCategoryServiceImpl implements DiseaseCategoryService{
	
	@Autowired
	private DiseaseCategoryRepository diseaseCategoryRepository;
	
	@Autowired
	private DiseaseTypeService diseaseTypeService;

	@Override
	public void create(DiseaseCategory diseaseCategory) {
		diseaseCategoryRepository.save(diseaseCategory);
	}

	@Override
	public List<DiseaseCategory> selectAll() {
		return diseaseCategoryRepository.findAll();
	}

	@Override
	public DiseaseCategory selectById(Long id) {
		DiseaseCategory diseaseCategory = diseaseCategoryRepository.findById(id).get();
		
		diseaseCategory.setDiseasesTypes(diseaseTypeService.selectByIdDiseaseCategory(id));
		
		return diseaseCategory;
	}

	@Override
	public void deleteById(Long id) {
		diseaseCategoryRepository.deleteById(id);
	}

}
