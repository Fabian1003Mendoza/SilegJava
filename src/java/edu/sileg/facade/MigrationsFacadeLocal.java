/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.Migrations;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface MigrationsFacadeLocal {

    void create(Migrations migrations);

    void edit(Migrations migrations);

    void remove(Migrations migrations);

    Migrations find(Object id);

    List<Migrations> findAll();

    List<Migrations> findRange(int[] range);

    int count();
    
}
