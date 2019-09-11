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

import pl.justyna.HelloBunnies.model.Disease;
import pl.justyna.HelloBunnies.service.DiseaseService;

@RestController
@RequestMapping("diseases")
public class DiseaseController {

	@Autowired
	private DiseaseService diseaseService;
	
	@PostMapping
	public void create(@RequestBody Disease disease) {
		diseaseService.create(disease);
	}
	
	@GetMapping
	public List<Disease> getAll(){
		return diseaseService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		diseaseService.deleteById(Long.valueOf(id));
	}
}
