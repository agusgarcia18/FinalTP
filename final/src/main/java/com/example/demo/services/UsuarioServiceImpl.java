package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements UsuarioService {

    public UsuarioServiceImpl(BaseRepository<Usuario,Long> baseRepository){
        super(baseRepository);
    }
}
