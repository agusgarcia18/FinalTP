package com.example.demo.repositories;

import com.example.demo.entities.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto,Long>{
}
