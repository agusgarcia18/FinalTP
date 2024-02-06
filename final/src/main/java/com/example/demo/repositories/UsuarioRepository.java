package com.example.demo.repositories;

import com.example.demo.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long> {
}
