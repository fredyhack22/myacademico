package com.myacademico.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="estudiante")
public class Estudiante {
    //Definir los atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ide_estu;
    private String nom_estu;
    @Temporal(TemporalType.DATE)
    private Date fna_estu;
    private String gen_estu;
    private String dir_estu;
    private String tel_estu;
}