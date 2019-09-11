package pl.justyna.HelloBunnies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.justyna.HelloBunnies.model.FirstBunny;
import pl.justyna.HelloBunnies.repository.FirstBunnyRepository;
import pl.justyna.HelloBunnies.service.FirstBunnyService;

@Service
public class FirstBunnyServiceImpl implements FirstBunnyService {

	@Autowired
	private FirstBunnyRepository firstBunnyRepository;

	@Override
	public void create(FirstBunny firstBunny) {
		firstBunnyRepository.save(firstBunny);

	}

	@Override
	public List<FirstBunny> selectAll() {
		return firstBunnyRepository.findAll();
	}

}
