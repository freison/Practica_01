
package com.Practica.service;

import com.Practica.domain.Estado;
import java.util.List;


public interface EstadoService {
    public List<Estado> getEstados();
    
    public void save(Estado estado);
    
    public void delete(Estado estado);
    
    public Estado getEstado(Estado estado);
    
    
}
