package com.TFI.ClinicaOdontologica.entidades;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity //Le avisamos a Hibernate que es una entidad
@Table(name="Pacientes") //Que se llama pacientes

public class Paciente {
    @Id //Nuestra propiedad id va a ser el identificador
    @GeneratedValue //Si alguien no lo pase que ese ID se autogenere
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String DNI;
    private Date fechaDelAlta;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
    @JsonIgnore //Cada vez que esto se convierra en un JSON pedimos que se ignore esa propiedad para no crear un loop infinito
    private Set<Turno> turnos;

    //define una colección que no puede contener elementos duplicados. Un paciente puede tener muchos turnos
    //hibernate utiliza los set para no repetir los elementos que estén dentro de la coleccion

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

    public Set<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Set<Turno> turnos) {
        this.turnos = turnos;
    }
}
