package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long> implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    @Transactional
    public List<Cliente> searchByNameOrLastname(String filtro) throws Exception{
        try {
            List<Cliente> clientes = clienteRepository.searchByNameOrLastname(filtro);
            return clientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }


}
