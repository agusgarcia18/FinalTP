package com.example.demo.services;

import com.example.demo.entities.Ingrediente;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredienteServiceImpl extends BaseServiceImpl<Ingrediente,Long> implements IngredienteService {

    public IngredienteServiceImpl(BaseRepository<Ingrediente,Long> baseRepository){
        super(baseRepository);
    }
}
