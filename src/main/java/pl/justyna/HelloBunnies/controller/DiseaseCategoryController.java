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

import pl.justyna.HelloBunnies.model.DiseaseCategory;
import pl.justyna.HelloBunnies.service.DiseaseCategoryService;

@RestController
@RequestMapping("diseasesCategories")
public class DiseaseCategoryController {

	@Autowired
	private DiseaseCategoryService diseaseCategoryService;
	
	@PostMapping
	public void create(@RequestBody DiseaseCategory diseaseCategory) {
		diseaseCategoryService.create(diseaseCategory);
	}
	
	@GetMapping("/{id}")
	public DiseaseCategory getById(@PathVariable int id) {
		return diseaseCategoryService.selectById(Long.valueOf(id));
	}
	
	@GetMapping
	public List<DiseaseCategory> getAll(){
		return diseaseCategoryService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		diseaseCategoryService.deleteById(Long.valueOf(id));
	}
}
