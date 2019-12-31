package com.gestiondepartement.magementapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class SupportDuCours {

    @Id
    private int id ;
}
