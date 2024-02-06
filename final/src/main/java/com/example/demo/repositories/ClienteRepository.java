package com.example.demo.repositories;

import com.example.demo.entities.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente,Long> {

    @Query(value = "select c from Cliente c where c.nombre like %:filtro% or c.apellido like %:filtro%")
    List<Cliente> searchByNameOrLastname(String filtro);

}
