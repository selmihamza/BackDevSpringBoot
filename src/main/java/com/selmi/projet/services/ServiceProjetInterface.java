package com.selmi.projet.services;


import com.selmi.projet.model.entity.Projet;

import java.util.List;

public interface ServiceProjetInterface {
    List liste();
    Projet save(Projet p);
    void delete(long id);
    Projet findById(long id);

}
