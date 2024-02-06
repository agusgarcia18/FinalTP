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
public class DetalleProducto extends Base{

    private BigDecimal cantidad;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ingrediente_id")
    private Ingrediente ingrediente;
}
