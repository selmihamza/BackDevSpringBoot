package com.jihene.parc.services;

import com.jihene.parc.model.entity.Tache;

import java.util.List;

public interface ServiceTacheInterface {
    List listeEtudiant();
    Tache save(Tache e);
    void delete(long id);
}
