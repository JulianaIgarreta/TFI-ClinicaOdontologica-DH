package com.TFI.ClinicaOdontologica.controller;

import com.TFI.ClinicaOdontologica.Service.IPacienteService;
import com.TFI.ClinicaOdontologica.entidades.PacienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin(origins = "http://localhost")
public class PacienteController {

    @Autowired
    IPacienteService pacienteService;

    @PostMapping
    public ResponseEntity<?>crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDTO GetPaciente(@PathVariable Long id){
        return pacienteService.leerPaciente(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.modificarPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Long id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping
    public Collection<PacienteDTO> getTodosLosPacientes(){
        return pacienteService.getTodosLosPacientes();
    }











}
