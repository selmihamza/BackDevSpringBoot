package com.jihene.parc.services;

import com.jihene.parc.model.dao.projetRepository;
import com.jihene.parc.model.entity.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceProjet implements ServiceProjetInterface {
    @Autowired
    projetRepository repo ;
    @Override
    public List liste() {
        return repo.findAll();
    }
    @Override
    public Projet save(Projet p) {
        return repo.save(p);
    }
    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }
}
