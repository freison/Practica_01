
package com.Practica.service;

import com.Practica.dao.EstadoDao;
import com.Practica.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDao clienteDao;
    
    @Override
    public List<Estado> getClientes() {
        return (List<Estado>)estadoDao.findAll();
        
    }

    @Override
    public void save(Estado estado) {
        clienteDao.save(estado);
        
    }

    @Override
    public void delete(Estado estado) {
        clienteDao.delete(estado);
        
    }

    @Override
    public Estado getEstado(Estado estado) {
        return clienteDao.findById(estado.getId*******Cliente()).orElse(null);
        
    }
    
    
}
