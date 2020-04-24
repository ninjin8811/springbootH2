package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/countlists")
public class CountListRestController {
	@Autowired
	CountListService countListService;

	@CrossOrigin
	@GetMapping
	List<CountList> getCountLists() {
		List<CountList> countLists = countListService.findAll();
		return countLists;
	}

	@CrossOrigin
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	CountList postCountList(@RequestBody CountList countList) {
		return countListService.create(countList);
	}

	@CrossOrigin
	@PutMapping(path = "{id}")
	CountList putCountList(@PathVariable Integer id, @RequestBody CountList countList) {
		countList.setId(id);
		System.out.println(countList);
		return countListService.update(countList);
	}
}
