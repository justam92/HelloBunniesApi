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

import pl.justyna.HelloBunnies.model.OtherNourishment;
import pl.justyna.HelloBunnies.service.OtherNourishmentService;

@RestController
@RequestMapping("otherNourishments")
public class OtherNourishmentController {

	@Autowired
	private OtherNourishmentService otherNourishmentService;
	
	@PostMapping
	public void create(@RequestBody OtherNourishment otherNourishment) {
		otherNourishmentService.create(otherNourishment);
	}
	
	@GetMapping
	public List<OtherNourishment> getAll(){
		return otherNourishmentService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		otherNourishmentService.deleteById(Long.valueOf(id));
	}
}
