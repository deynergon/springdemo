package com.example.demo.modelos;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Table(name="detalles")
@Entity
public class Detalle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer costoTotal;
    private Integer cantidadProductos;




}
