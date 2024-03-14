package com.example.demo.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name="marcas")
@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String nombre;
    private String nit;
    private LocalDate añoCreacion;
    private String sedePrincipal;

}
