package com.vinni.conexionbd.repositorios;


import com.vinni.conexionbd.entidad.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long>,  JpaSpecificationExecutor<Vehiculo> {
    Vehiculo findByPlaca(String placa);
}
