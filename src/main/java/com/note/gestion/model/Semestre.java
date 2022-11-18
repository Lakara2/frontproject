package com.note.gestion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static javax.persistence.GenerationType.IDENTITY;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Semestre {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long idSemestre;

    private String name;

    private Float average;

    private String mention;
}