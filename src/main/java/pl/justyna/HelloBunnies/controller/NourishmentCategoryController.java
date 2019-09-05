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

import pl.justyna.HelloBunnies.model.NourishmentCategory;
import pl.justyna.HelloBunnies.service.NourishmentCategoryService;

@RestController
@RequestMapping("nourishmentCategories")
public class NourishmentCategoryController {
	
	@Autowired
	private NourishmentCategoryService nourishmentCategoryService;
	
	@PostMapping
	public void create(@RequestBody NourishmentCategory nourishmentCategory) {
		nourishmentCategoryService.create(nourishmentCategory);
	}
	
	@GetMapping("/{id}")
	public NourishmentCategory getById(@PathVariable int id) {
		return nourishmentCategoryService.selectById(Long.valueOf(id));
	}
	
	@GetMapping
	public List<NourishmentCategory> getAll() {
		return nourishmentCategoryService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		nourishmentCategoryService.deleteById(Long.valueOf(id));
	}
}
