package pelicula.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pelicula.project.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {

    

}
