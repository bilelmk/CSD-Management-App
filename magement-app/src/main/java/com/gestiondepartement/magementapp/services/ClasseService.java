package com.gestiondepartement.magementapp.services;

import com.gestiondepartement.magementapp.exception.ValidationException;
import com.gestiondepartement.magementapp.models.Classe;
import com.gestiondepartement.magementapp.repositories.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository ;


    public List<Classe> findAllClasses(){
        return this.classeRepository.findAll();
    }

    public Classe createClasse(Classe classe){
        return this.classeRepository.save(classe);
    }

    public void deleteClasse(Integer id){
        this.classeRepository.deleteById(id);
    }

    public Classe updateClasse(Classe classedetails) {
        Classe classe=this.classeRepository.findById(classedetails.getId_classe()).orElseThrow(()->new ValidationException("classe not found"));

        classe.setLibelle(classedetails.getLibelle());
        classe.setNiveau(classedetails.getNiveau());
        classe.setGroupe(classedetails.getGroupe());

        return this.classeRepository.save(classe);

    }
}

