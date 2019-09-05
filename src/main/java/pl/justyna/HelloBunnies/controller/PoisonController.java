package pl.justyna.HelloBunnies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.justyna.HelloBunnies.model.Poison;
import pl.justyna.HelloBunnies.service.PoisonService;

@RestController
@RequestMapping("poisons")
public class PoisonController {

	@Autowired
	private PoisonService poisonService;
	
	@PostMapping
	public void create(@RequestBody Poison poison) {
		poisonService.create(poison);
	}
	
	@GetMapping
	public List<Poison> getAll(){
		return poisonService.selectAll();
	}
}
