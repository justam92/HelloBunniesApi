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

import pl.justyna.HelloBunnies.model.FirstAid;
import pl.justyna.HelloBunnies.service.FirstAidService;

@RestController
@RequestMapping("firstAids")
public class FirstAidController {

	@Autowired
	private FirstAidService firstAidService;

	@PostMapping
	public void create(@RequestBody FirstAid firstAid) {
		firstAidService.create(firstAid);
	}

	@GetMapping
	public List<FirstAid> getAll() {
		return firstAidService.selectAll();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		firstAidService.deleteById(Long.valueOf(id));
	}
}
