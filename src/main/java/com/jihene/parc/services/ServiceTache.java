package com.jihene.parc.services;

import com.jihene.parc.model.dao.tacheRepository;
import com.jihene.parc.model.entity.Tache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTache implements ServiceTacheInterface {
    @Autowired
    tacheRepository repoEtudiant ;
    @Override
    public List listeEtudiant() {
        return repoEtudiant.findAll();
    }
    @Override
    public Tache save(Tache e) {
        return repoEtudiant.save(e);
    }
    @Override
    public void delete(long id) {
        repoEtudiant.deleteById(id);
    }
}
