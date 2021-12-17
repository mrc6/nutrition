package br.com.nutrition.datasource.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {

  private static final long serialVersionUID = 3862024889868951158L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String nome;
  private LocalDate idade;

  @Column(name = "codigo_registro")
  private String codigoRegistro;

  @Column(name = "id_paciente")
  private Long id_paciente;

  public Nutricionista() {}
}
