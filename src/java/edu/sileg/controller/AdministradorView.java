/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.controller;

import edu.sileg.entity.Usuario;
import edu.sileg.facade.UsuarioFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Usuario
 */
@Named(value = "administradorView")
@ViewScoped
public class AdministradorView implements Serializable {

      @EJB
    UsuarioFacadeLocal usuarioFacadeLocal;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private Usuario usuarioSelect = new Usuario();
    private Usuario usuReg = new Usuario();
    
    @Inject
    UsuarioSesion usuarioSesion;
    

    @PostConstruct
    public void cargaUsuarios() {
        listaUsuarios.addAll(usuarioFacadeLocal.findAll());
    }

    public void removerUsuario(Usuario usuario) {
        String mensajeAlerta = "";
        try {
            usuarioFacadeLocal.remove(usuario);
            listaUsuarios.remove(usuario);
            mensajeAlerta = "swal('Removido el usuario', '" + usuario.getNombres() + ' ' + usuario.getApellidos() + "', 'success');";
        } catch (Exception e) {
            mensajeAlerta = "swal('Problemas eliminando a ', '" + usuario.getNombres() + ' ' + usuario.getApellidos() + "', 'error');";
        }
        PrimeFaces.current().executeScript(mensajeAlerta);

    }

    /**
     * Creates a new instance of AdministradorView
     */
    public AdministradorView() {
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuario getUsuarioSelect() {
        return usuarioSelect;
    }

    public void setUsuarioSelect(Usuario usuarioSelect) {
        this.usuarioSelect = usuarioSelect;
    }

    public Usuario getUsuReg() {
        return usuReg;
    }

    public void setUsuReg(Usuario usuReg) {
        this.usuReg = usuReg;
    }
  
    

}
