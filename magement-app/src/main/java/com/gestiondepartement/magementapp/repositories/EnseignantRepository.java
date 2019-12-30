package com.gestiondepartement.magementapp.repositories;

import com.gestiondepartement.magementapp.models.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {
}
