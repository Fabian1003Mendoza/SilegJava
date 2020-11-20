/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.CategoriaSolicitud;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface CategoriaSolicitudFacadeLocal {

    void create(CategoriaSolicitud categoriaSolicitud);

    void edit(CategoriaSolicitud categoriaSolicitud);

    void remove(CategoriaSolicitud categoriaSolicitud);

    CategoriaSolicitud find(Object id);

    List<CategoriaSolicitud> findAll();

    List<CategoriaSolicitud> findRange(int[] range);

    int count();
    
}
