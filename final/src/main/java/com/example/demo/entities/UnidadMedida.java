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
public class UnidadMedida extends Base{

    private String denominacion;
    private String abreviatura;
    private boolean eliminado;
}
