package com.example.demo.repositories;

import com.example.demo.entities.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado,Long> {
}
