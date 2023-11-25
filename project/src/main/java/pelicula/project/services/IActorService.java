package pelicula.project.services;

import java.util.List;

import pelicula.project.entities.Actor;

public interface IActorService {
	public List<Actor> findAll();
	public List<Actor> findAllById(List<Long> ids);
}
