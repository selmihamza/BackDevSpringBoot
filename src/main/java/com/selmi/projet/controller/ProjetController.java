package com.selmi.projet.controller;

import com.selmi.projet.model.entity.Projet;
import com.selmi.projet.services.ServiceProjet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/auth")
@CrossOrigin(origins = "*")
public class ProjetController {
    @Autowired
    ServiceProjet sp;
    List<Projet> list;


    @RequestMapping(value = "/projet", method = RequestMethod.GET)
    List<Projet> list() {
        list = sp.liste();
        if (list != null) {
            return list;
        } else {
            return null;
        }

    }

    @RequestMapping(value = "/projet/{id}", method = RequestMethod.GET)
    Projet getProject(@PathVariable long id) {
        Projet p = sp.findById(id);
        if (list != null) {
            return p;
        } else {
            return null;
        }

    }

    @RequestMapping(value = "/projet", method = RequestMethod.POST)
    public Projet  save(@RequestBody Projet p) {
        return sp.save(p);
    }

    @RequestMapping(value = "/projet/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        sp.delete(id);
    }

    @RequestMapping(value = "/projet", method = RequestMethod.PUT)
    public Projet update(@RequestBody Projet p) {
        return sp.save(p);
    }

}
