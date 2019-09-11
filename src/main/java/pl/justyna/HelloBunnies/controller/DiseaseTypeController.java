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

import pl.justyna.HelloBunnies.model.DiseaseType;
import pl.justyna.HelloBunnies.service.DiseaseTypeService;

@RestController
@RequestMapping("diseasesTypes")
public class DiseaseTypeController {

	@Autowired
	private DiseaseTypeService diseaseTypeService;
	
	@PostMapping
	public void create(@RequestBody DiseaseType diseaseType) {
		diseaseTypeService.create(diseaseType);
	}
	
	@GetMapping("/{id}")
	public DiseaseType getById(@PathVariable int id) {
		return diseaseTypeService.selectById(Long.valueOf(id));
	}
	
	@GetMapping
	public List<DiseaseType> getAll(){
		return diseaseTypeService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		diseaseTypeService.deleteById(Long.valueOf(id));
	}
}
