package com.example.springboot2.repository;

import com.example.springboot2.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface PaisRepository extends JpaRepository<Pais, Long> {
    Optional<Pais> findByNombre(String nombre);
}
