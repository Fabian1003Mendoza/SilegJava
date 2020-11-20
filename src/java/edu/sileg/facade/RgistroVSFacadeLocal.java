/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.RgistroVS;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface RgistroVSFacadeLocal {

    void create(RgistroVS rgistroVS);

    void edit(RgistroVS rgistroVS);

    void remove(RgistroVS rgistroVS);

    RgistroVS find(Object id);

    List<RgistroVS> findAll();

    List<RgistroVS> findRange(int[] range);

    int count();
    
}
