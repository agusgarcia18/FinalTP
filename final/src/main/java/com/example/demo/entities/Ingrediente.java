package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ingrediente extends Base{

    private String denominacion;
    private String urlImagen;
    private BigDecimal precioCompra;
    private BigDecimal stockActual;
    private BigDecimal stockMinimo;
    private boolean eliminado;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;
}
