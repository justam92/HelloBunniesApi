package pl.justyna.HelloBunnies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.justyna.HelloBunnies.model.FirstBunny;
import pl.justyna.HelloBunnies.service.FirstBunnyService;

@RestController
@RequestMapping("firstBunnies")
public class FirstBunnyController {

	@Autowired
	private FirstBunnyService firstBunnyService;

	@PostMapping
	public void create(@RequestBody FirstBunny firstBunny) {
		firstBunnyService.create(firstBunny);
	}

	@GetMapping
	public List<FirstBunny> getAll() {
		return firstBunnyService.selectAll();
	}
}
