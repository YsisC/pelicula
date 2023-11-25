package pelicula.project.dao;

import org.springframework.data.repository.CrudRepository;

import pelicula.project.entities.Genero;

public interface IGeneroRepository extends CrudRepository<Genero, Long> {

}