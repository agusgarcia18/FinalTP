package com.example.demo.controllers;

import com.example.demo.entities.Cliente;
import com.example.demo.services.ClienteService;
import com.example.demo.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/clients")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {

    @GetMapping("/search")
    public ResponseEntity<?> searchByNameOrLastname(@RequestBody String filtro) throws Exception{
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchByNameOrLastname(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    "{\"error\":\" no se encontraron resultados para la busqueda\"}");
            }
        }
    }
