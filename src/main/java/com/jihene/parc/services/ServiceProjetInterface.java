package com.jihene.parc.services;


import com.jihene.parc.model.entity.Projet;

import java.util.List;

public interface ServiceProjetInterface {
    List liste();
    Projet save(Projet p);
    void delete(long id);
}
