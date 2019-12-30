package com.gestiondepartement.magementapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cours ;

//    private String heure ;
//    private String type ;
//
//    @ManyToOne
//    @JoinColumn(name = "id_enseignant")
//    private Enseignant enseignant ;
//
//    @ManyToOne
//    @JoinColumn(name = "id_classe")
//    private Classe classe ;
//
//    @OneToOne
//    @JoinColumn(name="id_matiere")
//    private Matiere matiere ;
}
