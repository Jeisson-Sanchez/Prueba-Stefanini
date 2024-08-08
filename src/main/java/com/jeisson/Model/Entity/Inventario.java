package com.jeisson.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Inventario")

public class Inventario {

    @Id
    @Column(name="idInventario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInventario;

    @Column(name="NombreUsuario")
    private String NombreUsuario;

    @Column(name="NombreProducto")
    private String NombreProducto;

    @Column(name="NumSerie")
    private Integer NumSerie;

    @Column(name="FechaCreate")
    private Date FechaCreate;

    @Column(name="Estado")
    private Integer Estado = 1;
}
