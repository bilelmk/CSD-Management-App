package com.gestiondepartement.magementapp.controllers;

import com.gestiondepartement.magementapp.models.Classe;
import com.gestiondepartement.magementapp.models.Enseignant;
import com.gestiondepartement.magementapp.models.Seance;
import com.gestiondepartement.magementapp.services.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("seances")
public class SeanceController {

    @Autowired
    private SeanceService seanceService;

    @CrossOrigin(origins = "*")
    @GetMapping(produces = "application/json")
    public List<Seance> all() {
        List<Seance> s = this.seanceService.findAllSeances();
        return s;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public Seance create(@RequestBody Seance c) {
        return seanceService.createSeances(c);
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public Seance edit(@RequestBody Seance c) {
        return seanceService.updateSeances(c);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        seanceService.deleteSeances(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/classe")
    public List<Seance> classeSeance(@RequestBody Classe c) {
        return seanceService.findClasseSeances(c);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/enseignant")
    public List<Seance> ensSeance(@RequestBody Enseignant e) {
        return seanceService.findEnseignantSeances(e);
    }

}
