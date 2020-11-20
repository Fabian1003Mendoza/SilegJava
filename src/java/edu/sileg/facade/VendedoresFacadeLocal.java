/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.Vendedores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface VendedoresFacadeLocal {

    void create(Vendedores vendedores);

    void edit(Vendedores vendedores);

    void remove(Vendedores vendedores);

    Vendedores find(Object id);

    List<Vendedores> findAll();

    List<Vendedores> findRange(int[] range);

    int count();
    
}
