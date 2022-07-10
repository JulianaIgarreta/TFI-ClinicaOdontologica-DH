package com.TFI.ClinicaOdontologica.Service;

import com.TFI.ClinicaOdontologica.entidades.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {

    void crearOdontologo(OdontologoDTO odontologoDTO);
    OdontologoDTO leerOdontologo(Long id);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Long id);
    Set<OdontologoDTO> getTodosLosOdontologo();
}
