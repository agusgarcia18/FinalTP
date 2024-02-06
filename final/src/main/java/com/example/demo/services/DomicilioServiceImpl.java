package com.example.demo.services;

import com.example.demo.entities.Domicilio;
import com.example.demo.repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    public DomicilioServiceImpl(BaseRepository<Domicilio,Long> baseRepository){
        super(baseRepository);
    }

}
