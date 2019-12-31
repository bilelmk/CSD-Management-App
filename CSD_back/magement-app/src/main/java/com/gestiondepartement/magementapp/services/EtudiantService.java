package com.gestiondepartement.magementapp.services;

import com.gestiondepartement.magementapp.exception.ValidationException;
import com.gestiondepartement.magementapp.models.Etudiant;
import com.gestiondepartement.magementapp.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantrep ;

    public List<Etudiant> findAllEtudiants(){
        return this.etudiantrep.findAll();
    }

    public Etudiant createEtudiant(Etudiant etudiant){
        return this.etudiantrep.save(etudiant);
    }

    public void deleteEtudiant(Integer id){
        this.etudiantrep.deleteById(id);
    }

    public Etudiant updateEtudiant(Etudiant etudiantdetails) {
        Etudiant etudiant=this.etudiantrep.findById(etudiantdetails.getId_etudiant()).orElseThrow(()->new ValidationException("etudiants not found"));

        etudiant.setNom(etudiantdetails.getNom());
        etudiant.setPrenom(etudiantdetails.getPrenom());
        etudiant.setAdresse(etudiantdetails.getAdresse());
        etudiant.setCin(etudiantdetails.getCin());
        etudiant.setTel(etudiantdetails.getTel());

        return this.etudiantrep.save(etudiant);
    }
}
