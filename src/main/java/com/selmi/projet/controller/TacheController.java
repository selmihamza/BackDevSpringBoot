package com.selmi.projet.controller;

import com.selmi.projet.model.entity.Projet;
import com.selmi.projet.model.entity.Tache;
import com.selmi.projet.services.ServiceProjet;
import com.selmi.projet.services.ServiceTache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/auth")
@CrossOrigin(origins = "*")
public class TacheController {



    @Autowired
    ServiceTache serviceTache;
    @Autowired
    ServiceProjet serviceProjet;
    List<Tache> listT;

    @RequestMapping(value = "/tache", method = RequestMethod.GET)
    List<Tache> listTache() {
        listT = serviceTache.listeTache();
        if (listT != null) {
            return listT;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/tache/{id}", method = RequestMethod.POST)
    public Tache save(@PathVariable long id,@RequestBody Tache e) {
        Projet p = serviceProjet.findById(id);
        e.setProjet(p);
        return serviceTache.save(e);
    }

    @RequestMapping(value = "/tache/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        serviceTache.delete(id);
    }

    @RequestMapping(value = "/tache/{id}", method = RequestMethod.PUT)
    public Tache update(@PathVariable long id,@RequestBody Tache e) {
        Projet p = serviceProjet.findById(id);
        e.setProjet(p);
        return serviceTache.save(e);
    }


}
