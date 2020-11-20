/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.controller;

import edu.sileg.entity.Usuario;
import edu.sileg.facade.UsuarioFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Usuario
 */
@Named(value = "registroRequest")
@RequestScoped
public class registroRequest implements Serializable {
    @EJB
            UsuarioFacadeLocal usuariofacadelocal;
    
    private Usuario usuReg = new Usuario();
    /**
     * Creates a new instance of RegistroRequest
     */
    public registroRequest() {
       
        
    }
    
    public void registrarUsuario(){
        
        usuariofacadelocal.create(usuReg);
    }
}
