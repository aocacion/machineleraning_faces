package com.ia.machineleraning_faces.persistence.entity.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "pais")
public class Pais {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nombre;
  private String codigo;

  @OneToMany(mappedBy="pais")
  List<Persona> personas = new ArrayList<Persona>();

}
