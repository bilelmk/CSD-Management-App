package com.gestiondepartement.magementapp.services;

import com.gestiondepartement.magementapp.exception.ValidationException;

import com.gestiondepartement.magementapp.models.CadreAdministratif;
import com.gestiondepartement.magementapp.repositories.CadreAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CadreAdminService {
    @Autowired
    private CadreAdminRepository cadreAdminRepository ;

    public List<CadreAdministratif> findAllCadres(){
        return this.cadreAdminRepository.findAll();
    }

    public CadreAdministratif createCadre(CadreAdministratif cadreAdministratif){
        return this.cadreAdminRepository.save(cadreAdministratif);
    }

    public void deleteCadre(Integer id){
        this.cadreAdminRepository.deleteById(id);
    }

    public CadreAdministratif updateCadre(CadreAdministratif cadreAdministratifdetails) {
        CadreAdministratif cadreAdministratif=this.cadreAdminRepository.findById(cadreAdministratifdetails.getId_cadre()).orElseThrow(()->new ValidationException("cadreAdministratif not found"));

        cadreAdministratif.setNom(cadreAdministratifdetails.getNom());
        cadreAdministratif.setPrenom(cadreAdministratifdetails.getPrenom());
        cadreAdministratif.setCin(cadreAdministratifdetails.getCin());
        cadreAdministratif.setTel(cadreAdministratifdetails.getTel());
        cadreAdministratif.setAdresse(cadreAdministratifdetails.getAdresse());
        cadreAdministratif.setPoste(cadreAdministratifdetails.getPoste());


        return this.cadreAdminRepository.save(cadreAdministratif);
    }
}
