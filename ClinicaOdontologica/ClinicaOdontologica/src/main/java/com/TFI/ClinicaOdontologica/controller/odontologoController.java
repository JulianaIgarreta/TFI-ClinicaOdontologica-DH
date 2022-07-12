package com.TFI.ClinicaOdontologica.controller;

import com.TFI.ClinicaOdontologica.Service.IOdontologoService;
import com.TFI.ClinicaOdontologica.entidades.Odontologo;
import com.TFI.ClinicaOdontologica.entidades.OdontologoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologos")

public class odontologoController {
    @Autowired
    IOdontologoService odontologoService;


    @PostMapping
    public ResponseEntity<?>crearPaciente(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public OdontologoDTO GetOdontologo(@PathVariable Long id){
        return odontologoService.leerOdontologo(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping
    public Collection<OdontologoDTO> getTodosLosOdontologos(){
        return odontologoService.getTodosLosOdontologo();
    }
}
