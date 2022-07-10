package com.TFI.ClinicaOdontologica.Service;

import com.TFI.ClinicaOdontologica.repository.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.TFI.ClinicaOdontologica.entidades.Paciente;
import com.TFI.ClinicaOdontologica.entidades.PacienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
//Debe acceder a la capa de datos
public class PacienteService implements IPacienteService{

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    @Override
    public PacienteDTO leerPaciente(Long id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDTO pacienteDTO  = null;
        if(paciente.isPresent()){
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
            return pacienteDTO;
        }else{
            System.out.println("No existen pacientes con ese ID");
        }
        return null;
    }


    private void guardarPaciente(PacienteDTO pacienteDTO){

        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);

    }
    @Override
    public void modificarPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);

    }

    @Override
    public Set<PacienteDTO> getTodosLosPacientes() {

        List<Paciente> pacientes = pacienteRepository.findAll();
        Set<PacienteDTO> pacientesDTO = new HashSet<>();

        for(Paciente paciente: pacientes){
            pacientesDTO.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        return pacientesDTO;
    }
}
