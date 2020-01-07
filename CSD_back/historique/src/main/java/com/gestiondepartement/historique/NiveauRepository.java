package com.gestiondepartement.historique;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NiveauRepository extends MongoRepository<Niveau, String> {

    public List<Niveau> findAll();

    public List<Niveau> findAllByNivOrderByAnnee(String niv);

}

