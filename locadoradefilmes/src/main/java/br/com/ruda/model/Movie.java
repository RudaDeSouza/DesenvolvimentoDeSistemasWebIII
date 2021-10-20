package br.com.ruda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	@Column (columnDefinition = "varchar(50)", name = "titulo")
	private String title;
	@Column (columnDefinition = "varchar(40)", name = "diretor")
	private String director;
	@Column (name = "anoLançamento")
	private int year;
	@Column (columnDefinition = "varchar(50)", name = "descricao")
	private String description;
	
	public Movie(int id, String title, String director, int year, String description) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.year = year;
		this.description = description;
	}

	public Movie() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
