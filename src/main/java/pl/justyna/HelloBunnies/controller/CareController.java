package pl.justyna.HelloBunnies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.justyna.HelloBunnies.model.Care;
import pl.justyna.HelloBunnies.service.CareService;

@RestController
@RequestMapping("care")
public class CareController {
	
	@Autowired
	private CareService careService;
	
	@PostMapping
	public void create(@RequestBody Care care) {
		careService.create(care);
	}
	
	@GetMapping
	public List<Care> getAll(){
		return careService.selectAll();
	}
	
	public void deleteById(@PathVariable int id) {
		careService.deleteById(Long.valueOf(id));
	}

}
