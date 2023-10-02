package com.vinni.conexionbd;


import com.vinni.conexionbd.dto.VehiculoDto;
import com.vinni.conexionbd.entidad.Vehiculo;
import com.vinni.conexionbd.repositorios.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

@Service
public class ServiciosVehiculo {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    private ModelMapper modelMapper;

    public ServiciosVehiculo() {
    }

    @Transactional(readOnly = true)
    public VehiculoDto getByPlaca(String placa) {
        Vehiculo vehiculo = vehiculoRepository.findByPlaca(placa);
        return  this.modelMapper.map(vehiculo, VehiculoDto.class);
    }
}
