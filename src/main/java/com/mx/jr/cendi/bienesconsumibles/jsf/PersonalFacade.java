/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.jr.cendi.bienesconsumibles.jsf;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.jr.cendi.bienesconsumibles.model.Articulos;
import com.mx.jr.cendi.bienesconsumibles.model.Personal;

/**
 *
 * @author usuario
 */
@Repository
public interface PersonalFacade  extends JpaRepository<Personal, String> {
//    @PersistenceContext(unitName = "WebApplication1PU")
//    private EntityManager em;
//
//    @Override
//    protected EntityManager getEntityManager() {
//        return em;
//    }
//
//    public PersonalFacade() {
//        super(Personal.class);
//    }
    
}
