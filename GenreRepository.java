package com.spring.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.exercise.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

	public Genre findByName(String name);
}
