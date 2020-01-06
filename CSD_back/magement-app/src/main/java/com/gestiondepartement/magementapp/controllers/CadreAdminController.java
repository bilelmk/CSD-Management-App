package com.gestiondepartement.magementapp.controllers;

import com.gestiondepartement.magementapp.models.CadreAdministratif;
import com.gestiondepartement.magementapp.services.CadreAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadres")
public class CadreAdminController {

    @Autowired
    CadreAdminService cadreAdminService;

    @CrossOrigin(origins = "*")
    @GetMapping(produces = "application/json")
    public List<CadreAdministratif> all() {
        List<CadreAdministratif> cadres = this.cadreAdminService.findAllCadres();
        return cadres;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public CadreAdministratif create(@RequestBody CadreAdministratif c) {
        return cadreAdminService.createCadre(c);
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public CadreAdministratif edit(@RequestBody CadreAdministratif c) {
        return cadreAdminService.updateCadre(c);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        cadreAdminService.deleteCadre(id);
    }
}
