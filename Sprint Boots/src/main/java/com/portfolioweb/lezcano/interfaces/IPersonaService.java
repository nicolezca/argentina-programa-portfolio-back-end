package com.portfolioweb.lezcano.interfaces;

import com.portfolioweb.lezcano.entity.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersona();
    
    public void savepersona(Persona persona);
    
    public void deletepersona(Long id);
    
    public Persona findPersona(Long id);


            
}
