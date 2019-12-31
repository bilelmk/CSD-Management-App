package com.gestiondepartement.magementapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_classe ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String libelle ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String niveau ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private char groupe ;

    @OneToMany(mappedBy = "classe")
    @JsonIgnoreProperties(value = {"classe"} ,allowSetters = true)
    private List<Etudiant> liste_etudiants ;

    @OneToOne
    @JoinColumn(name="id_enseignant")
    private Enseignant responsable ;

//    @OneToMany(mappedBy = "classe")
//    private List<Cours> liste_cours ;


    public int getId_classe() {
        return id_classe;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getNiveau() {
        return niveau;
    }

    public char getGroupe() {
        return groupe;
    }

    public List<Etudiant> getListe_etudiants() {
        return liste_etudiants;
    }

    public Enseignant getResponsable() {
        return responsable;
    }


    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setGroupe(char groupe) {
        this.groupe = groupe;
    }

    public void setListe_etudiants(List<Etudiant> liste_etudiants) {
        this.liste_etudiants = liste_etudiants;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }
}
