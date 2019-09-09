package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.CareCategory;
import pl.justyna.HelloBunnies.repository.CareCategoryRepository;
import pl.justyna.HelloBunnies.service.CareCategoryServie;
import pl.justyna.HelloBunnies.service.CareService;

@Service
public class CareCategoryServiceImpl implements CareCategoryServie {
	
	@Autowired
	private CareCategoryRepository careCategoryRepository;
	
	@Autowired
	private CareService careService;

	@Override
	public void create(CareCategory careCategory) {
		careCategoryRepository.save(careCategory);
	}

	@Override
	public List<CareCategory> selectAll() {
		return careCategoryRepository.findAll();
	}

	@Override
	public CareCategory selectByID(Long id) {
		CareCategory careCategory = careCategoryRepository.findById(id).get();
		
		careCategory.setCareList(careService.selectByIdCareCategory(id));
		
		return careCategory;
	}

	@Override
	public void deleteById(Long id) {
		careCategoryRepository.deleteById(id);
	}

}
