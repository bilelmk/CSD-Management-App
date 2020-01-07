package com.gestiondepartement.magementapp.repositories;

import com.gestiondepartement.magementapp.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    Etudiant findByAuth(int i);

}
