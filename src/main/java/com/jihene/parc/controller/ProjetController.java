package com.jihene.parc.controller;

import com.jihene.parc.model.Response;
import com.jihene.parc.model.entity.Projet;
import com.jihene.parc.services.ServiceProjet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "/projet", method = RequestMethod.POST)
    public Projet  save(@RequestBody Projet p) {
        return sp.save(p);
        //return e.getId();
    }

    @RequestMapping(value = "/projet", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@RequestParam("id") int id) {
        sp.delete(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new Response(true, new Date()));
    }

    @RequestMapping(value = "/projet", method = RequestMethod.PUT)
    public Projet update(@RequestBody Projet p) {
        return sp.save(p);
    }

}
