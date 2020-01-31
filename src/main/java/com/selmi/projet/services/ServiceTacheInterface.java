package com.selmi.projet.services;

import com.selmi.projet.model.entity.Tache;

import java.util.List;

public interface ServiceTacheInterface {
    List listeTache();
    Tache save(Tache e);
    void delete(long id);
}
