package com.example.clienteservice.repositories;

import com.example.clienteservice.entities.Cliente;
import com.example.clienteservice.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface IClienteDao  extends JpaRepository<Cliente, Long> {
    @Query("from Region")
    public List<Region> findAllRegiones();
}
