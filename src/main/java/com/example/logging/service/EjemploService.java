package com.example.logging.service;

import org.springframework.stereotype.Service;
@Service

public class EjemploService {

    public String saludame(String nombre)throws Exception{
        try{
            return "Hola "+ nombre;

        }catch (Exception e){
            throw  new Exception(e.getMessage());
        }
    }
}
