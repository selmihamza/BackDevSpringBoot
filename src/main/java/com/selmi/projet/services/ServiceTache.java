package com.selmi.projet.services;

import com.selmi.projet.model.dao.tacheRepository;
import com.selmi.projet.model.entity.Tache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTache implements ServiceTacheInterface {
    @Autowired
    tacheRepository repoTache ;
    @Override
    public List listeTache() {
        return repoTache.findAll();
    }
    @Override
    public Tache save(Tache e) {
        return repoTache.save(e);
    }
    @Override
    public void delete(long id) {
        repoTache.deleteById(id);
    }
}
