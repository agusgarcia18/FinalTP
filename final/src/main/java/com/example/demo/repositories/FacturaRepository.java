package com.example.demo.repositories;

import com.example.demo.entities.Factura;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends BaseRepository<Factura,Long> {
}
