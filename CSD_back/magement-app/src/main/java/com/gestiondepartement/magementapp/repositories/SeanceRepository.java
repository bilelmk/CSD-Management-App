package com.gestiondepartement.magementapp.repositories;

import com.gestiondepartement.magementapp.models.Classe;
import com.gestiondepartement.magementapp.models.Enseignant;
import com.gestiondepartement.magementapp.models.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeanceRepository extends JpaRepository<Seance, Integer> {
    List<Seance> findByClasse(Classe c);
    List<Seance> findByEnseignant(Enseignant e);

}
