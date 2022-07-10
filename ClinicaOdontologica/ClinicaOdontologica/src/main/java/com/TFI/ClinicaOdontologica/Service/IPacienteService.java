package com.TFI.ClinicaOdontologica.Service;

import com.TFI.ClinicaOdontologica.entidades.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    void crearPaciente(PacienteDTO pacienteDTO);
    PacienteDTO leerPaciente(Long id);
    void modificarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Long id);
    Set<PacienteDTO> getTodosLosPacientes();

}
