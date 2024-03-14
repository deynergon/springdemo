package com.example.demo.modelos;

import jakarta.persistence.*;

@Table(name="productos")
@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    private String nombre;
    private String referencia;
    private String cantidadBodega;
    private String precioUnitario;
    private String descripcion;
    private String fotografia;
    private String marca;


}
