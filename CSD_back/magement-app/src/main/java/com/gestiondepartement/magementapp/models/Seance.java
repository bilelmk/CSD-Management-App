package com.gestiondepartement.magementapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames={"jour", "heure" ,"id_classe"}),
        @UniqueConstraint(columnNames={"jour", "heure" ,"id_enseignant"})})
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_seance;

    private String jour ;
    private String heure ;
    private String type ; //cours td tp

    @ManyToOne
    @JoinColumn(name = "id_enseignant")
    private Enseignant enseignant ;

    @ManyToOne
    @JsonIgnoreProperties(value = {"liste_etudiants"} ,allowSetters = true)
    @JoinColumn(name = "id_classe")
    private Classe classe ;

    @ManyToOne
    @JoinColumn(name="id_module")
    private Module module;

    public int getId_seance() {
        return id_seance;
    }

    public String getJour() {
        return jour;
    }

    public String getHeure() {
        return heure;
    }

    public String getType() {
        return type;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public Classe getClasse() {
        return classe;
    }

    public Module getModule() {
        return module;
    }

    public void setId_seance(int id_seance) {
        this.id_seance = id_seance;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
