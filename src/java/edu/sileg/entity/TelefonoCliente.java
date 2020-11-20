/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "telefono_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelefonoCliente.findAll", query = "SELECT t FROM TelefonoCliente t")})
public class TelefonoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtelefonocliente")
    private Integer idtelefonocliente;
    @Size(max = 50)
    @Column(name = "nro_telefono")
    private String nroTelefono;
    @JoinColumn(name = "idclientes", referencedColumnName = "idclientes")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clientes idclientes;

    public TelefonoCliente() {
    }

    public TelefonoCliente(Integer idtelefonocliente) {
        this.idtelefonocliente = idtelefonocliente;
    }

    public Integer getIdtelefonocliente() {
        return idtelefonocliente;
    }

    public void setIdtelefonocliente(Integer idtelefonocliente) {
        this.idtelefonocliente = idtelefonocliente;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public Clientes getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Clientes idclientes) {
        this.idclientes = idclientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefonocliente != null ? idtelefonocliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoCliente)) {
            return false;
        }
        TelefonoCliente other = (TelefonoCliente) object;
        if ((this.idtelefonocliente == null && other.idtelefonocliente != null) || (this.idtelefonocliente != null && !this.idtelefonocliente.equals(other.idtelefonocliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sileg.entity.TelefonoCliente[ idtelefonocliente=" + idtelefonocliente + " ]";
    }
    
}
