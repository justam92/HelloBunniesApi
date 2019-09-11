package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.FirstAid;
import pl.justyna.HelloBunnies.repository.FirstAidRepository;
import pl.justyna.HelloBunnies.service.FirstAidService;

@Service
public class FirstAidServiceImpl implements FirstAidService{
	
	@Autowired
	private FirstAidRepository firstAidRepository;

	@Override
	public void create(FirstAid firstAid) {
		firstAidRepository.save(firstAid);
		
	}

	@Override
	public List<FirstAid> selectAll() {
		return firstAidRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		firstAidRepository.deleteById(id);
	}

}
