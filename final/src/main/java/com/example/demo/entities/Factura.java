package com.example.demo.entities;

import com.example.demo.enums.FormaPago;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends Base{
    private int numeroFactura;
    //private Date fechaFacturacion;
    private double porcentajeDescuento;
    private FormaPago formaPago;
    private double totalVenta;
    private double totalCosto;
    private boolean eliminado;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "detalle_id")
    private List<DetalleFactura> detalleFacturas = new ArrayList<>();

}
