package com.example.demo.services;

import com.example.demo.entities.Pedido;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService{

    public PedidoServiceImpl(BaseRepository<Pedido,Long> baseRepository){
        super(baseRepository);
    }
}
