package com.example.logging.controller;

import com.example.logging.service.EjemploService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class EjemploRest {
    @Autowired
    EjemploService servicio;

    @GetMapping("saludo/{nivelLog}/{nombre}")
    public String saludame(@PathVariable String nivelLog,@PathVariable("nombre") String nombre ) {
        try {
            if (nivelLog.equalsIgnoreCase("ERROR"))
                log.error("Mostrando tipo error nombre: "+nombre);
            else
                log.info("Saludo tipo info nombre: "+nombre);
            return servicio.saludame(nombre);
        } catch (Exception e) {
            log.error("No se ha podido saludar al usuario");
            e.printStackTrace();
            return null;


        }
    }


}
