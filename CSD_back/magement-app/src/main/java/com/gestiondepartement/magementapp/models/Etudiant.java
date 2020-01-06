package com.gestiondepartement.magementapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


import javax.persistence.*;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_etudiant ;

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
    private int auth_id  ;


    @ManyToOne
    @JoinColumn(name = "id_classe")
    @JsonIgnoreProperties(value = {"liste_etudiants"} ,allowSetters = true)
    private Classe classe ;




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

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getId_etudiant() {
        return id_etudiant;
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

    public Classe getClasse() {
        return classe;
    }


    public int getAuth_id() {
        return auth_id;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }
}
