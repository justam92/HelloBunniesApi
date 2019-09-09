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

import pl.justyna.HelloBunnies.model.CareCategory;
import pl.justyna.HelloBunnies.service.CareCategoryServie;

@RestController
@RequestMapping("careCategories")
public class CareCategoryController {

	@Autowired
	private CareCategoryServie careCategoryServie;
	
	@PostMapping
	public void create(@RequestBody CareCategory careCategory) {
		careCategoryServie.create(careCategory);
	}
	
	@GetMapping("/{id}")
	public CareCategory getById(@PathVariable int id) {
		return careCategoryServie.selectByID(Long.valueOf(id));
	}
	
	@GetMapping
	public List<CareCategory> getAll(){
		return careCategoryServie.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		careCategoryServie.deleteById(Long.valueOf(id));
	}
}
