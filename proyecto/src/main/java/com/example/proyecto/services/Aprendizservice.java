package com.example.proyecto.services;

import com.example.proyecto.model.Aprendizentity;
import com.example.proyecto.repository.Aprendizrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Aprendizservice {
    @Autowired
    private Aprendizrepository aprendizRepository;

    public void crearAprendiz(Aprendizentity aprendiz) {
        aprendizRepository.save(aprendiz);
    }

    public List<Aprendizentity> obtenerAprendices() {
        return aprendizRepository.findAll();
    }

    public void eliminarAprendiz(Long id) {
        aprendizRepository.deleteById(id);
    }

    public Aprendizentity buscarAprendiz(Long id) {
        return aprendizRepository.findById(id).orElse(null);
    }

    public Aprendizentity actualizarAprendiz(Long id, Aprendizentity aprendiz) {
        aprendiz.setId(id);
        return aprendizRepository.save(aprendiz);
    }
}
