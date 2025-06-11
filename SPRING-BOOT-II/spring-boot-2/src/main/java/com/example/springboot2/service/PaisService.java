package com.example.springboot2.service;

import com.example.springboot2.model.Pais;
import com.example.springboot2.repository.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {
    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public List<Pais> obtenerTodos() {
        return paisRepository.findAll();
    }

    public Optional<Pais> obtenerPorId(Long id) {
        return paisRepository.findById(id);
    }

    public Optional<Pais> obtenerPorNombre(String nombre) {
        return paisRepository.findByNombre(nombre);
    }

    public Pais guardarPais(Pais pais) {
        return paisRepository.save(pais);
    }

    public void eliminarPais(Long id) {
        paisRepository.deleteById(id);
    }
}
