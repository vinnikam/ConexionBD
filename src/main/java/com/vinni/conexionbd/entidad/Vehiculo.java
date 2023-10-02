package com.vinni.conexionbd.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Vehiculo")
@Table(name = "vehiculos")
public class Vehiculo {
    @Serial
    private static final long serialVersionUID = -1359540121612959495L;
    @Id
    @Column(name = "veh_placa", nullable = false)
    private String placa;

    @Column(name = "veh_marca", nullable = false)
    private String marca;

    @Column(name = "veh_modelo", nullable = false)
    private int modelo;

    @Column(name = "veh_precio", nullable = false)
    private long precio;
}
