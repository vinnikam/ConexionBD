package com.vinni.conexionbd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehiculoDto {
    private String placa;
    private String marca;
    private int modelo;
    private long precio;

}
