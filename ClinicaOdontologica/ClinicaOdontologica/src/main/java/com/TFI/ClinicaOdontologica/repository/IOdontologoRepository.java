package com.TFI.ClinicaOdontologica.repository;

import com.TFI.ClinicaOdontologica.entidades.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {
}
