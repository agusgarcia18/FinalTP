package com.example.demo.services;

import com.example.demo.entities.Cliente;

import java.util.List;

public interface ClienteService extends BaseService<Cliente,Long>{

    List<Cliente> searchByNameOrLastname(String filtro) throws Exception;
}

