/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.facade;

import edu.sileg.entity.FailedJobs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface FailedJobsFacadeLocal {

    void create(FailedJobs failedJobs);

    void edit(FailedJobs failedJobs);

    void remove(FailedJobs failedJobs);

    FailedJobs find(Object id);

    List<FailedJobs> findAll();

    List<FailedJobs> findRange(int[] range);

    int count();
    
}
