package pelicula.project.services;

import java.util.List;

import pelicula.project.entities.Genero;

public interface IGeneroService  {
    public void save(Genero genero);
	public Genero findById(Long id);
	public void delete(Long id);
	public List<Genero> findAll();
}
