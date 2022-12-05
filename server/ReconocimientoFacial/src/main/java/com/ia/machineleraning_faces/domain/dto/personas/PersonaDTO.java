package com.ia.machineleraning_faces.domain.dto.personas;

import com.ia.machineleraning_faces.persistence.entity.mysql.Pais;

import java.time.LocalDateTime;

public class PersonaDTO {
  private Integer id;
  private String identificacion;
  private String nombre;
  private String apellidos;
  private String telefono;
  private LocalDateTime fechaNacimiento;
  private Pais pais;
}
