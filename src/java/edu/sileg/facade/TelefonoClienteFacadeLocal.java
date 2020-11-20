/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.TelefonoCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface TelefonoClienteFacadeLocal {

    void create(TelefonoCliente telefonoCliente);

    void edit(TelefonoCliente telefonoCliente);

    void remove(TelefonoCliente telefonoCliente);

    TelefonoCliente find(Object id);

    List<TelefonoCliente> findAll();

    List<TelefonoCliente> findRange(int[] range);

    int count();
    
}
