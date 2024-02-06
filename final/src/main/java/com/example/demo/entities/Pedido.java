package com.example.demo.entities;

import com.example.demo.enums.FormaPago;
import com.example.demo.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pedido extends Base{

    //private Date fechaPedido;
    //private Date horaEstimadaPedido;
    private double totalPedido;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private boolean eliminado;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "factura_id")
    private Factura factura;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "detalle_id")
    @Builder.Default
    private List<DetallePedido> detallePedidos = new ArrayList<>();

}
