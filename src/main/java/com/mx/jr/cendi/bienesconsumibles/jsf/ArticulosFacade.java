/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.jr.cendi.bienesconsumibles.jsf;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mx.jr.cendi.bienesconsumibles.model.Articulos;

/**
 *
 * @author usuario
 */
public class ArticulosFacade extends AbstractFacade<Articulos> {
    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticulosFacade() {
        super(Articulos.class);
    }
    
}
