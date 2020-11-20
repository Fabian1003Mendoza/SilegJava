/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.ProductosEspeciales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface ProductosEspecialesFacadeLocal {

    void create(ProductosEspeciales productosEspeciales);

    void edit(ProductosEspeciales productosEspeciales);

    void remove(ProductosEspeciales productosEspeciales);

    ProductosEspeciales find(Object id);

    List<ProductosEspeciales> findAll();

    List<ProductosEspeciales> findRange(int[] range);

    int count();
    
}
