package com.example.demo.services;

import com.example.demo.entities.Factura;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {

    public FacturaServiceImpl(BaseRepository<Factura,Long> baseRepository){
        super(baseRepository);
    }

}
