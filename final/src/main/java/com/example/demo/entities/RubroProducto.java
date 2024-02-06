package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RubroProducto extends Base{

    private String denominacion;
    private boolean eliminado;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_id")
    private List<Producto> productos = new ArrayList<>();

 /*   @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "rubro_padre_id")
    @Builder.Default
    private List<RubroProducto> rubrosPadre = new ArrayList<>();*/
}
