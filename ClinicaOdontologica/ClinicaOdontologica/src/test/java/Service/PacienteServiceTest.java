package com.TFI.ClinicaOdontologica;

import com.TFI.ClinicaOdontologica.Service.IPacienteService;
import com.TFI.ClinicaOdontologica.entidades.PacienteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PacienteServiceTest {

    @Autowired
    private IPacienteService pacienteService;

    @Test
    public void testCrearUnPaciente(){
        PacienteDTO pacienteDTO = new PacienteDTO(1L,"Juliana", "Igarreta", "Villa Dolores 1164","39147101", new Date("2022/01/20"));
        pacienteService.crearPaciente(pacienteDTO);

        PacienteDTO pacienteJuliana = pacienteService.leerPaciente(1L);
        assertTrue(pacienteJuliana != null);
    }






}