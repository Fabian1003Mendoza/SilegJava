/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.TelefonoProveedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface TelefonoProveedorFacadeLocal {

    void create(TelefonoProveedor telefonoProveedor);

    void edit(TelefonoProveedor telefonoProveedor);

    void remove(TelefonoProveedor telefonoProveedor);

    TelefonoProveedor find(Object id);

    List<TelefonoProveedor> findAll();

    List<TelefonoProveedor> findRange(int[] range);

    int count();
    
}
