package com.example.demo.entities;

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
public class RubroIngrediente extends Base{

    private String denominacion;
    private boolean eliminado;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "ingrediente_id")
    @Builder.Default
    private List<Ingrediente> ingredientes = new ArrayList<>();

  /*  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "rubro_padre_id")
    @Builder.Default
    private List<RubroIngrediente> rubroIngredientes = new ArrayList<>();*/
}
