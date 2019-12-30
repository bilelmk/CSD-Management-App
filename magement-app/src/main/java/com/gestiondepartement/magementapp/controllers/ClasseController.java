package com.gestiondepartement.magementapp.controllers;

import com.gestiondepartement.magementapp.models.Classe;
import com.gestiondepartement.magementapp.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("classes")
public class ClasseController {
    @Autowired
    private ClasseService classeService;

    @CrossOrigin(origins = "*")
    @GetMapping(produces = "application/json")
    public List<Classe> all() {
        List<Classe> classes = this.classeService.findAllClasses();
        return classes;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public Classe create(@RequestBody Classe cl) {
        return classeService.createClasse(cl);
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public Classe edit(@RequestBody Classe cl) {
        return classeService.updateClasse(cl);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        classeService.deleteClasse(id);
    }
}
