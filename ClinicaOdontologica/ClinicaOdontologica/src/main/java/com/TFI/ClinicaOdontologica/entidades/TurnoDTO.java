package com.TFI.ClinicaOdontologica.entidades;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

public class TurnoDTO {
    private Long turn_id;
    private Date fechaTurno;
    private Date horaTurno;
    private Paciente paciente;
    private Odontologo odontologo;

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

    public Date getHoraTurno() {
        return horaTurno;
    }

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
