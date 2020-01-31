package com.mx.jr.cendi.bienesconsumibles.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Areas {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Getter
    @Setter
    private String clave;

    @Getter
    @Setter
    private String descripcion;

//    @Getter
//    @Setter
//    private Date create;
}