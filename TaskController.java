package com.spring.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.exercise.model.Actor;
import com.spring.exercise.model.Genre;
import com.spring.exercise.model.Movie;
import com.spring.exercise.repository.ActorRepository;
import com.spring.exercise.repository.GenreRepository;
import com.spring.exercise.repository.MovieRepository;

@Controller
public class TaskController {

	@Autowired
	private GenreRepository genreRepository;
	
	@Autowired
	private ActorRepository actorRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	//run method declaration
	public void run() {

		/************************INSERTING PART************************************/
		// Value for Genre
		Genre g1 = new Genre("Comedy", null);
		Genre g2 = new Genre("Action", null);
		Genre g3 = new Genre("Romantic", null);
		Genre g4 = new Genre("Sci-fi", null);

		/******** 6. Saving objects of type Genre to the database *********/
		genreRepository.save(g1);
		genreRepository.save(g2);
		genreRepository.save(g3);
		genreRepository.save(g4);

		// Value For Actor 
		Actor a1 = new Actor("Govinda", "kumar", 1980, null);
		Actor a2 = new Actor("AKshay", "Kumar", 1984, null);
		Actor a3 = new Actor("Sunny", "Deol", 1976, null);
		Actor a4 = new Actor("Shahid", "Kapur", 1988, null);

		
		/******** 7. Saving objects of type Actor to the database ********/
		actorRepository.save(a1);
		actorRepository.save(a2);
		actorRepository.save(a3);
		actorRepository.save(a4);

		// Value For Movie 
		Movie m1 = new Movie("Welcome-Back", 2021, g1, null);
		Movie m2 = new Movie("Gudder", 2012, g2, null);
		Movie m3 = new Movie("Vivah", 2010, g3, null);
		Movie m4 = new Movie("Misson Mangal", 2020, g4, null);

		
		/********* 16. adding Movie records to the database *********/
		movieRepository.save(m1);
		movieRepository.save(m2);
		movieRepository.save(m3);
		movieRepository.save(m4);

		
		/****************************DISPLAYING PART**************************************/
		
		/******** 8. removing Actor record by id from the database *********/
		/*
		System.out.println("\n\n Removing Actor record by id =>");

		actorRepository.deleteById(1L);

		System.out.println("\n All Actor records after removing :");
		List<Actor> actor3 = actorRepository.findAll();

		actor3.forEach((a) -> {
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getLastName());
			System.out.println(a.getYearOfBirth());
		});
		*/
		
		
		/******** 9. searching Actor records by name ************/
		System.out.println("\n\n Actor records by name =>");
		Actor actor1 = actorRepository.findByName("Akshay");

		System.out.println(actor1.getId());
		System.out.println(actor1.getName());
		System.out.println(actor1.getLastName());
		System.out.println(actor1.getYearOfBirth());

		
		/******** 10. searching for Actor records by id *********/
		System.out.println("\n\n Actor records by id =>");
		Actor actor = actorRepository.findById(1L).get();

		System.out.println(actor.getId());
		System.out.println(actor.getName());
		System.out.println(actor.getLastName());
		System.out.println(actor.getYearOfBirth());

		
		/******** 11. returning all Actor records ********/
		System.out.println("\n\n All Actor records =>");
		List<Actor> actor2 = actorRepository.findAll();

		actor2.forEach((a) -> {
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getLastName());
			System.out.println(a.getYearOfBirth());
			System.out.println("\n ");
		});

		
		
		
		
		
		/******** 12. removing Genre records from the database ********/
		/*
		System.out.println("\n\n Removing Genre records =>");
		genreRepository.deleteById(1L);

		System.out.println("\n All Genre records after removing : ");
		List<Genre> genre3 = genreRepository.findAll();

		genre3.forEach((g) -> {
			System.out.println(g.getId());
			System.out.println(g.getName());
			System.out.println("\n");
		});
		*/
		

		/********* 13. searching for Genre records by name *************/
		System.out.println("\n\n Genre records by name => ");
		Genre genre1 = genreRepository.findByName("Comedy");

		System.out.println(genre1.getId());
		System.out.println(genre1.getName());

		
		/********* 14. searching for Genre records by id *************/
		System.out.println("\n\n Genre records by id =>");
		Genre genre = genreRepository.findById(1L).get();

		System.out.println(genre.getId());
		System.out.println(genre.getName());

		
		/******** 15. returning all Genre records ***********/
		System.out.println("\n\n All Genre records => ");
		List<Genre> genre2 = genreRepository.findAll();

		genre2.forEach((g) -> {
			System.out.println(g.getId());
			System.out.println(g.getName());
		});

		
		
		
		
		/********* 17. removing Movie records from the database *********/
		/*
		System.out.println("\n\n Removing Movie records from the database =>");

		movieRepository.deleteById(1L);

		System.out.println("\n\n All Genre records after removing : ");
		List<Movie> movie3 = movieRepository.findAll();

		movie3.forEach((m) -> {
			System.out.println(m.getId());
			System.out.println(m.getTitle());
			System.out.println(m.getYearOfRelease());
		});
		*/
		
		
		/******** 18. searching Movie records by title ************/
		System.out.println("\n\n Movie records by title =>");
		Movie movie1 = movieRepository.findByTitle("Bahubali");

		System.out.println(movie1.getId());
		System.out.println(movie1.getTitle());
		System.out.println(movie1.getYearOfRelease());

		
		
		/******* 19. searching for Movie records by id *********/
		System.out.println("\n\n Movie records by id =>");
		Movie movie = movieRepository.findById(1L).get();

		System.out.println(movie.getId());
		System.out.println(movie.getTitle());
		System.out.println(movie.getYearOfRelease());

		
		
		/********* 20. returning all Movie records *********/
		System.out.println("\n\n All Movie records =>");
		List<Movie> movie2 = movieRepository.findAll();

		movie2.forEach((m) -> {
			System.out.println(m.getId());
			System.out.println(m.getTitle());
			System.out.println(m.getYearOfRelease());
			System.out.println("\n");
		});
	}
}
