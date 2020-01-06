package com.gestiondepartement.magementapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_module ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nom ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private float coefficient ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean cours ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean tp ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean td ;


    public int getId_module() {
        return id_module;
    }

    public String getNom() {
        return nom;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public boolean isCours() {
        return cours;
    }

    public boolean isTp() {
        return tp;
    }

    public boolean isTd() {
        return td;
    }


    public void setId_module(int id_matiere) {
        this.id_module = id_matiere;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public void setCours(boolean cours) {
        this.cours = cours;
    }

    public void setTp(boolean tp) {
        this.tp = tp;
    }

    public void setTd(boolean td) {
        this.td = td;
    }
}
