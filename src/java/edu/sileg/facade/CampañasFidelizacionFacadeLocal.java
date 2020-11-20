/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.CampañasFidelizacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface CampañasFidelizacionFacadeLocal {

    void create(CampañasFidelizacion campañasFidelizacion);

    void edit(CampañasFidelizacion campañasFidelizacion);

    void remove(CampañasFidelizacion campañasFidelizacion);

    CampañasFidelizacion find(Object id);

    List<CampañasFidelizacion> findAll();

    List<CampañasFidelizacion> findRange(int[] range);

    int count();
    
}
