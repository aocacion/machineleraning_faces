package com.ia.machineleraning_faces.persistence.repository.mysql;

import com.ia.machineleraning_faces.persistence.entity.mysql.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
