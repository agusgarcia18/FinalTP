package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto extends Base{

    private String denominacion;
    private String descripcion;
    private Integer tiempoEstimadoCocina;
    private BigDecimal precioVenta;
    private BigDecimal precioCosto;
    private String urlImagen;
    private String receta;
    private boolean esBebida;
    private boolean eliminado;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "detalle_id")
    @Builder.Default
    private List<DetalleProducto> detalleProductos = new ArrayList<>();
}
