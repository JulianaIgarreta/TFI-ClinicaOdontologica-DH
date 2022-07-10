package com.TFI.ClinicaOdontologica.repository;

import com.TFI.ClinicaOdontologica.entidades.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnosRepository extends JpaRepository<Turno, Long> {
}
