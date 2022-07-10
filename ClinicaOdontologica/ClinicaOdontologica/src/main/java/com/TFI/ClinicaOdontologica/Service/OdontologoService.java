package com.TFI.ClinicaOdontologica.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.TFI.ClinicaOdontologica.entidades.Odontologo;
import com.TFI.ClinicaOdontologica.entidades.OdontologoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TFI.ClinicaOdontologica.repository.IOdontologoRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService{

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    private void guardarOdontologo(OdontologoDTO odontologoDTO){
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
    }

    @Override
    public void crearOdontologo(OdontologoDTO odontologoDTO) {
        guardarOdontologo(odontologoDTO);
    }

    @Override
    public OdontologoDTO leerOdontologo(Long id) {
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO  = null;
        if(odontologo.isPresent()){
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
            return odontologoDTO;
        }else{
            System.out.println("No existen odontólogos con ese ID");
        }
        return null;
    }


    @Override
    public void modificarOdontologo(OdontologoDTO odontologoDTO) {
        guardarOdontologo(odontologoDTO);
    }

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);

    }

    @Override
    public Set<OdontologoDTO> getTodosLosOdontologo() {
        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologoDTO = new HashSet<>();

        for(Odontologo odontologo: odontologos){
            odontologoDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }
        return odontologoDTO;
    }
}
