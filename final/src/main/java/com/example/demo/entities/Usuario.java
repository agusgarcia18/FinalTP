package com.example.demo.entities;

import com.example.demo.enums.Role;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario extends Base{

    private String auth0id;
    private String username;
    private String password;
    private Role role;
    private boolean eliminado;
}
