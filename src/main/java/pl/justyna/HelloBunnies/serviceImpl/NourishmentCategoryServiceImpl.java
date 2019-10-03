package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.NourishmentCategory;
import pl.justyna.HelloBunnies.repository.NourishmentCategoryRepository;
import pl.justyna.HelloBunnies.service.NourishmentCategoryService;
import pl.justyna.HelloBunnies.service.NourishmentService;
import pl.justyna.HelloBunnies.service.OtherNourishmentService;
import pl.justyna.HelloBunnies.service.SeedAndCerealService;

@Service
public class NourishmentCategoryServiceImpl implements NourishmentCategoryService {

	@Autowired
	private NourishmentCategoryRepository nourishmentCategoryRepository;
	
	@Autowired
	private NourishmentService nourishmentService;
	
	@Autowired
	private OtherNourishmentService otherNourishmentService;
	
	@Autowired
	private SeedAndCerealService seedAndCerealService;

	@Override
	public void create(NourishmentCategory nourishmentCategory) {
		nourishmentCategoryRepository.save(nourishmentCategory);
	}

	@Override
	public List<NourishmentCategory> selectAll() {
		return nourishmentCategoryRepository.findAll();
	}

	@Override
	public NourishmentCategory selectById(Long id) {
		NourishmentCategory nourishmentCategory = nourishmentCategoryRepository.findById(id).get();
		
		nourishmentCategory.setNourishments(nourishmentService.selectByIdNourishmentCategory(id));
		
		nourishmentCategory.setOtherNourishments(otherNourishmentService.selectByIdNourishmentCategory(id));
		
		nourishmentCategory.setSeedsAndCereals(seedAndCerealService.selectByIdNourishmentCategory(id));
		
		return nourishmentCategory;
	}

	@Override
	public void deleteById(Long id) {
		nourishmentCategoryRepository.deleteById(id);
	}

}
