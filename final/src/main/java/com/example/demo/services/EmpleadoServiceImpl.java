package com.example.demo.services;

import com.example.demo.entities.Empleado;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado,Long> implements EmpleadoService {

    public EmpleadoServiceImpl(BaseRepository<Empleado,Long> baseRepository){
        super(baseRepository);
    }

}
