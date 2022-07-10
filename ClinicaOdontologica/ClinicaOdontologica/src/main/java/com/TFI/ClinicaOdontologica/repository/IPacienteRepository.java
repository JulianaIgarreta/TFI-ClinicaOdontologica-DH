package com.TFI.ClinicaOdontologica.repository;
import com.TFI.ClinicaOdontologica.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//En estas interfaces vamos a guardar las acciones crud
//Sirve para hacer mejor la inyeccion de dependencias
//Capa de acceso a datos
@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
}
