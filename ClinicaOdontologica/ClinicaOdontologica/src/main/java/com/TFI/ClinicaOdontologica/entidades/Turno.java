package com.TFI.ClinicaOdontologica.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue
    private Long turn_id;
    private Date fechaTurno;
    private Date horaTurno;

    @ManyToOne
    @JoinColumn(name="odontologo_id", nullable = false) //Con que columna en la base de datos se va a relacionar esta propiedad
    private Odontologo odontologo;

    @ManyToOne
    @JoinColumn(name="paciente_id", nullable = false) //No permite valores nulos
    private Paciente paciente;

    public Long getTurn_id() {
        return turn_id;
    }

    public void setTurn_id(Long turn_id) {
        this.turn_id = turn_id;
    }


    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Date getHoraTurno() { return horaTurno; }

    public void setHoraTurno(Date horaTurno) {
        this.horaTurno = horaTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }
}
