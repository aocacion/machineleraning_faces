package com.ia.machineleraning_faces.persistence.entity.mysql;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "persona")
public class Persona{  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String identificacion;
  private String nombre;
  private String apellidos;

  private String telefono;
  private LocalDateTime fechaNacimiento;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="pais", nullable=false)
  private Pais pais;
}
