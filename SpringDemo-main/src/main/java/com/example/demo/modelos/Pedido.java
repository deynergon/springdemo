package com.example.demo.modelos;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="pedidos")

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate fechayhora;



}
