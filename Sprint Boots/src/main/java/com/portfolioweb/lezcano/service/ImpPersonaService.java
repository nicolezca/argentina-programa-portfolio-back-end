package com.portfolioweb.lezcano.service;

import com.portfolioweb.lezcano.entity.Persona;
import com.portfolioweb.lezcano.interfaces.IPersonaService;
import com.portfolioweb.lezcano.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savepersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletepersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
