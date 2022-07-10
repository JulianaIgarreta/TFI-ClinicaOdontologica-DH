package com.TFI.ClinicaOdontologica.controller;


import com.TFI.ClinicaOdontologica.Service.IPacienteService;
import com.TFI.ClinicaOdontologica.Service.ITurnoService;
import com.TFI.ClinicaOdontologica.entidades.PacienteDTO;
import com.TFI.ClinicaOdontologica.entidades.TurnoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
@CrossOrigin(origins = "http://localhost")

public class TurnosController {

    @Autowired
    ITurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> crearTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.crearTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDTO GetTurno(@PathVariable Long id){
        return turnoService.leerTurno(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.modificarTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno (@PathVariable Long id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping
    public Collection<TurnoDTO> getTodosLosTurnos(){
        return turnoService.getTodosLosTurnos();
    }

}
