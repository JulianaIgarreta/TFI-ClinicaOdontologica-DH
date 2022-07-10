package com.TFI.ClinicaOdontologica.Service;

import com.TFI.ClinicaOdontologica.entidades.TurnoDTO;

import java.util.Set;

public interface ITurnoService {
    void crearTurno(TurnoDTO turnoDTO);
    TurnoDTO leerTurno(Long id);
    void modificarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Long id);
    Set<TurnoDTO> getTodosLosTurnos();
}
