package com.universidad.patrones.repository;

import com.universidad.patrones.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByAutorIgnoreCase(String autor); 
    boolean existsByIsbn(String isbn); 
}