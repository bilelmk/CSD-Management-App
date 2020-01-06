package com.gestiondepartement.magementapp.controllers;

import com.gestiondepartement.magementapp.models.Enseignant;
import com.gestiondepartement.magementapp.services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("enseignants")
public class EnseignantController {

    @Autowired
    EnseignantService enseignantService;

    @CrossOrigin(origins = "*")
    @GetMapping(produces = "application/json")
    public List<Enseignant> all() {
        List<Enseignant> cadres = this.enseignantService.findAllEnseignant();
        return cadres;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public Enseignant create(@RequestBody Enseignant e) {
        return enseignantService.createEnseignant(e);
    }

//    @CrossOrigin(origins = "*")
//    @PutMapping
//    public Enseignant edit(@RequestBody Enseignant e) {
//        return enseignantService.updateClasse(e);
//    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        enseignantService.deleteEnseignant(id);
    }
}
