package com.jihene.parc.controller;

import com.jihene.parc.model.Response;
import com.jihene.parc.model.entity.Tache;
import com.jihene.parc.services.ServiceTache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin(origins = "*")
public class TacheController {



    @Autowired
    ServiceTache serviceTache;
    List<Tache> listEt;

    @RequestMapping(value = "/etudiant", method = RequestMethod.GET)
    List<Tache> listEt() {
        listEt = serviceTache.listeEtudiant();
        if (listEt != null) {
            return listEt;
        } else {
            return null;
        }

    }

    @RequestMapping(value = "/etudiant", method = RequestMethod.POST)
    public Tache save(@RequestBody Tache e) {
        return serviceTache.save(e);
        //return e.getId();
    }

    @RequestMapping(value = "/etudiant", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@RequestParam("id") int id) {
        serviceTache.delete(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new Response(true, new Date()));
    }

    @RequestMapping(value = "/etudiant", method = RequestMethod.PUT)
    public Tache update(@RequestBody Tache e) {
        return serviceTache.save(e);
    }

}
