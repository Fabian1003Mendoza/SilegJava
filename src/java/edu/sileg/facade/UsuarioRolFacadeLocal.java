/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.UsuarioRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface UsuarioRolFacadeLocal {

    void create(UsuarioRol usuarioRol);

    void edit(UsuarioRol usuarioRol);

    void remove(UsuarioRol usuarioRol);

    UsuarioRol find(Object id);

    List<UsuarioRol> findAll();

    List<UsuarioRol> findRange(int[] range);

    int count();
    
}
