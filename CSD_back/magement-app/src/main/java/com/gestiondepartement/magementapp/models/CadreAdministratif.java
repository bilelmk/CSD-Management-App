package com.gestiondepartement.magementapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadreAdministratif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cadre ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nom ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String prenom ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cin ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String adresse ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tel ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String poste ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int auth;

    public int getId_cadre() {
        return id_cadre;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public String getPoste() {
        return poste;
    }

    public void setId_cadre(int id_cadre) {
        this.id_cadre = id_cadre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }
}
