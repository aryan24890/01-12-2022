package com.spring.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.exercise.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{

	public Actor findByName(String name);
}
