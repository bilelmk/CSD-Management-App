package com.gestiondepartement.magementapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_enseignant ;

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
    private String grade ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int auth;


    @OneToOne(mappedBy = "responsable")
    private Classe resp_classe ;


    public int getId_enseignant() {
        return id_enseignant;
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

    public String getGrade() {
        return grade;
    }

    public Classe getResp_classe() {
        return resp_classe;
    }


    public void setId_enseignant(int id_enseignant) {
        this.id_enseignant = id_enseignant;
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

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setResp_classe(Classe resp_classe) {
        this.resp_classe = resp_classe;
    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }
}
