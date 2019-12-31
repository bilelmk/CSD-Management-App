package com.gestiondepartement.historique;

import com.gestiondepartement.classes.EtudiantHistorique;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EtudiantHistoriqueRepository extends MongoRepository<EtudiantHistorique, String> {

    public List<EtudiantHistorique> findAll();

    public EtudiantHistorique save(EtudiantHistorique etudiantHistorique);


}

