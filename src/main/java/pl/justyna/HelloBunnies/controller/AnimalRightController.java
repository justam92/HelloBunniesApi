package pl.justyna.HelloBunnies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.justyna.HelloBunnies.model.AnimalRight;
import pl.justyna.HelloBunnies.service.AnimalRightService;

@RestController
@RequestMapping("animalRights")
public class AnimalRightController {

	@Autowired
	private AnimalRightService animalRightService;

	@PostMapping
	public void create(@RequestBody AnimalRight animalRight) {
		animalRightService.create(animalRight);
	}

	@GetMapping
	public List<AnimalRight> getAll() {
		return animalRightService.selectAll();
	}
}
