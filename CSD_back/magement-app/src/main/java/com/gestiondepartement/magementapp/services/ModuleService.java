package com.gestiondepartement.magementapp.services;

import com.gestiondepartement.magementapp.exception.ValidationException;
import com.gestiondepartement.magementapp.models.Module;
import com.gestiondepartement.magementapp.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository ;

    public List<Module> findAllModules(){
        return this.moduleRepository.findAll();
    }

    public Module createModule(Module md){
        return this.moduleRepository.save(md);
    }

    public void deleteModule(Integer id){
        this.moduleRepository.deleteById(id);
    }

    public Module updateModule(Module moduledetails) {
        Module md=this.moduleRepository.findById(moduledetails.getId_module()).orElseThrow(()->new ValidationException("modules not found"));
        md.setNom(moduledetails.getNom());
        md.setCoefficient(moduledetails.getCoefficient());
        md.setCours(moduledetails.isCours());
        md.setTd(moduledetails.isTd());
        md.setTp(moduledetails.isTp());
        return this.moduleRepository.save(md);
    }
}
