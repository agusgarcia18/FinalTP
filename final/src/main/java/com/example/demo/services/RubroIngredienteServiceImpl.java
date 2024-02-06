package com.example.demo.services;

import com.example.demo.entities.Producto;
import com.example.demo.entities.RubroIngrediente;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class RubroIngredienteServiceImpl extends BaseServiceImpl<RubroIngrediente,Long> implements RubroIngredienteService {

    public RubroIngredienteServiceImpl(BaseRepository<RubroIngrediente,Long> baseRepository){
        super(baseRepository);
    }
}
