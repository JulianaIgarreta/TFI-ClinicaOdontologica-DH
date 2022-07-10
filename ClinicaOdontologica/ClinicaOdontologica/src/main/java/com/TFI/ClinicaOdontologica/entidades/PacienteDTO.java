package com.TFI.ClinicaOdontologica.entidades;

import java.time.LocalDate;
import java.util.Date;

public class PacienteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String DNI;
    private Date fechaDelAlta;

    public PacienteDTO(Long id, String nombre, String apellido, String domicilio, String DNI, Date fechaDelAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.DNI = DNI;

        this.fechaDelAlta = fechaDelAlta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaDelAlta() {
        return fechaDelAlta;
    }

    public void setFechaDelAlta(Date fechaDelAlta) {
        this.fechaDelAlta = fechaDelAlta;
    }
}
