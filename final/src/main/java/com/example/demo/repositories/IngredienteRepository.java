package com.example.demo.repositories;

import com.example.demo.entities.Ingrediente;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepository extends BaseRepository<Ingrediente,Long> {
}
