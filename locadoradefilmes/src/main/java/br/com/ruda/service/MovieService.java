package br.com.ruda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ruda.model.Movie;
import br.com.ruda.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	public Movie insertOrUpdate(Movie movie) {
		return movieRepository.save(movie); 
	}
	
	public List<Movie> findAll() {
		List<Movie> movies = new ArrayList<>();
		movieRepository.findAll().forEach(movies::add);
		return movies;
	}
	
	public Optional<Movie> findOne(int id) {
		return movieRepository.findById(id);
	}
	
	public void remove(int id) {
		movieRepository.deleteById(id);
	}
}
