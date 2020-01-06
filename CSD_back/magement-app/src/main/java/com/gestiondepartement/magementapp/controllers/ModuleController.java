package com.gestiondepartement.magementapp.controllers;

import com.gestiondepartement.magementapp.models.Module;
import com.gestiondepartement.magementapp.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("modules")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @CrossOrigin(origins = "*")
    @GetMapping(produces = "application/json")
    public List<Module> all() {
        List<Module> modules = this.moduleService.findAllModules();
        return modules;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public Module create(@RequestBody Module md) {
        return moduleService.createModule(md);
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public Module edit(@RequestBody Module md) {
        return moduleService.updateModule(md);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        moduleService.deleteModule(id);
    }
}
