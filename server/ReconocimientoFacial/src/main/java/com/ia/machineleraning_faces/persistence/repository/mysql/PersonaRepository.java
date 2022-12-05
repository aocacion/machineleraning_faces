package com.ia.machineleraning_faces.persistence.repository.mysql;

import com.ia.machineleraning_faces.persistence.entity.mysql.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
