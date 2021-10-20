package br.com.ruda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ruda.model.Movie;
import br.com.ruda.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@PostMapping
	public Movie insert(@RequestBody Movie movie) {
		return movieService.insertOrUpdate(movie);
	}
	
	@PutMapping
	public Movie update(@RequestBody Movie movie) {
		return movieService.insertOrUpdate(movie);
	}
}
