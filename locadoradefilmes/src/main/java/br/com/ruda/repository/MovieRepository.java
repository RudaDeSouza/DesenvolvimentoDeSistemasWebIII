package br.com.ruda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.ruda.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
