/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.TelefonoCliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class TelefonoClienteFacade extends AbstractFacade<TelefonoCliente> implements TelefonoClienteFacadeLocal {

    @PersistenceContext(unitName = "SilegPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TelefonoClienteFacade() {
        super(TelefonoCliente.class);
    }
    
}
