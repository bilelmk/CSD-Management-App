package com.gestiondepartement.magementapp.repositories;

import com.gestiondepartement.magementapp.models.CadreAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadreAdminRepository  extends JpaRepository<CadreAdministratif, Integer> {
}

