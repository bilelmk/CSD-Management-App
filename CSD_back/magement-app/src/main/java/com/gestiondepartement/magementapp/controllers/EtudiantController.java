package com.gestiondepartement.magementapp.controllers;

import com.gestiondepartement.magementapp.models.Etudiant;
import com.gestiondepartement.magementapp.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etudiants")
public class EtudiantController {


    @Autowired
    EtudiantService etudiantService;

    @CrossOrigin(origins = "*")
    @GetMapping(produces = "application/json")
    public List<Etudiant> all() {
        List<Etudiant> etudiants = this.etudiantService.findAllEtudiants();
        return etudiants;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public Etudiant create(@RequestBody Etudiant et) {
        System.out.println(et);
        return etudiantService.createEtudiant(et);
    }


    @CrossOrigin(origins = "*")
    @PutMapping
    public Etudiant edit(@RequestBody Etudiant et) {
        return etudiantService.updateEtudiant(et);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        etudiantService.deleteEtudiant(id);
    }


}