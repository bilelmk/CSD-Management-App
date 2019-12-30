package com.gestiondepartement.magementapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Getter
@Setter
public class Matiere {

    @Id
    private  int id_matiere ;
//    private String nom ;
//    private float coefficient ;
//    private boolean cours ;
//    private boolean tp ;
//    private boolean td ;

}
