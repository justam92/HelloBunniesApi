package pl.justyna.HelloBunnies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.justyna.HelloBunnies.model.Nourishment;
import pl.justyna.HelloBunnies.service.NourishmentService;

@RestController
@RequestMapping("nourishments")
public class NourishmentController {
	
	@Autowired
	private NourishmentService nourishmentService;
	
	@PostMapping
	public void create(@RequestBody Nourishment nourishment) {
		nourishmentService.create(nourishment);
	}
	
	@GetMapping
	public List<Nourishment> getAll(){
		return nourishmentService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		nourishmentService.deleteById(Long.valueOf(id));
	}

}
