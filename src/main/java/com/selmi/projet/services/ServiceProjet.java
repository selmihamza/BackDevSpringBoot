package com.selmi.projet.services;

import com.selmi.projet.model.dao.projetRepository;
import com.selmi.projet.model.entity.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProjet implements ServiceProjetInterface {
    @Autowired
    projetRepository repo ;
    @Override
    public List liste() { return repo.findAll(); }
    @Override
    public Projet save(Projet p) {
        return repo.save(p);
    }
    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }
    @Override
    public Projet findById(long id) {
         return repo.findById(id).get();
    }
}
