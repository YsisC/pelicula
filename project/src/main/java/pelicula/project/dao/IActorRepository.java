package pelicula.project.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pelicula.project.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor, Long> {

	List<Actor> findAll();

}