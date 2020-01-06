package com.gestiondepartement.magementapp.services;

import com.gestiondepartement.magementapp.exception.ValidationException;
import com.gestiondepartement.magementapp.models.Classe;
import com.gestiondepartement.magementapp.models.Enseignant;
import com.gestiondepartement.magementapp.models.Seance;
import com.gestiondepartement.magementapp.repositories.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeanceService {

    @Autowired
    private SeanceRepository seanceRepository;


    public List<Seance> findAllSeances(){
        return this.seanceRepository.findAll();
    }

    public Seance createSeances(Seance seance){
        return this.seanceRepository.save(seance);
    }

    public void deleteSeances(Integer id){
        this.seanceRepository.deleteById(id);
    }

    public Seance updateSeances(Seance seancedetails) {
        Seance s =this.seanceRepository.findById(seancedetails.getId_seance()).orElseThrow(()->new ValidationException("seance not found"));
        s.setHeure(seancedetails.getHeure());
        s.setClasse(seancedetails.getClasse());
        s.setEnseignant(seancedetails.getEnseignant());
        s.setJour(seancedetails.getJour());
        s.setType(seancedetails.getType());
        s.setModule(seancedetails.getModule());
        return this.seanceRepository.save(s);
    }

    public List<Seance> findClasseSeances(Classe c){
        return  this.seanceRepository.findByClasse(c) ;
    }

    public List<Seance> findEnseignantSeances(Enseignant e){
        return  this.seanceRepository.findByEnseignant(e) ;
    }

}
