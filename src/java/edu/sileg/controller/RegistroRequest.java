/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.controller;

import edu.sileg.entity.Usuario;
import edu.sileg.facade.UsuarioFacadeLocal;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Asus
 */
@Named(value = "registroRequest")
@RequestScoped
public class RegistroRequest implements Serializable {
    
     @EJB
    UsuarioFacadeLocal usuarioFacadeLocal;

    private Usuario usuReg = new Usuario();
    private String correoIn = "";
   
    public RegistroRequest() {
        
        
        
    }
    
     public void registrarUsuario() {
        String mensajeRequest = "";
        try {
            
            usuarioFacadeLocal.create(usuReg);
            mensajeRequest = "swal('Registro', 'Exitoso !!!!', 'success');";
        } catch (Exception e) {
            System.out.println("Error RegistroRequest:registrarUsuario " +e.getMessage());
            mensajeRequest = "swal('Verifique sus datos', 'Intente de nuevo', 'error');";
        }
        PrimeFaces.current().executeScript(mensajeRequest);
        usuReg = new Usuario();
    }

    public Usuario getUsuReg() {
        return usuReg;
    }

    public void setUsuReg(Usuario usuReg) {
        this.usuReg = usuReg;
    }

    public String getCorreoIn() {
        return correoIn;
    }

    public void setCorreoIn(String correoIn) {
        this.correoIn = correoIn;
    }
    
    
    
}
