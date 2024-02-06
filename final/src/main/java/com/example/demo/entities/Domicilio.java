package com.example.demo.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Domicilio extends Base{

    private String calle;
    private Integer numero;
    private Integer codigoPostal;
    private String localidad;
    private Integer numeroDpto;
    private Integer pisoDpto;
    private boolean eliminado;
}

