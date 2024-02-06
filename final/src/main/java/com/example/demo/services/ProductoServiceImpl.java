package com.example.demo.services;

import com.example.demo.entities.Producto;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService {

    public ProductoServiceImpl(BaseRepository<Producto,Long> baseRepository){
        super(baseRepository);
    }

}
