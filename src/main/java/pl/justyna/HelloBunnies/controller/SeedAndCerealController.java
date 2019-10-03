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

import pl.justyna.HelloBunnies.model.SeedAndCereal;
import pl.justyna.HelloBunnies.service.SeedAndCerealService;

@RestController
@RequestMapping("seedsAndCereals")
public class SeedAndCerealController {

	@Autowired
	private SeedAndCerealService seedAndCerealService;
	
	@PostMapping
	public void create(@RequestBody SeedAndCereal seedAndCereal) {
		seedAndCerealService.create(seedAndCereal);
	}
	
	@GetMapping
	public List<SeedAndCereal> getAll(){
		return seedAndCerealService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		seedAndCerealService.deleteById(Long.valueOf(id));
	}
}
