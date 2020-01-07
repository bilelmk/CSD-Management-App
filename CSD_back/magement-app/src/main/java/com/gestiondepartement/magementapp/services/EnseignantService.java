package com.gestiondepartement.magementapp.services;

import com.gestiondepartement.magementapp.models.Enseignant;
import com.gestiondepartement.magementapp.repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantService {    @Autowired
private EnseignantRepository enseignantRepository ;

    public List<Enseignant> findAllEnseignant(){
        return this.enseignantRepository.findAll();
    }

    public Enseignant createEnseignant(Enseignant e){
        return this.enseignantRepository.save(e);
    }

    public void deleteEnseignant(Integer id){
        this.enseignantRepository.deleteById(id);
    }

    public Enseignant findEnseignant(int id ){
        return  this.enseignantRepository.findByAuth(id) ;
    }
}
