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
@Table(name = "telefono_proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelefonoProveedor.findAll", query = "SELECT t FROM TelefonoProveedor t")})
public class TelefonoProveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtelefonoproveedor")
    private Integer idtelefonoproveedor;
    @Size(max = 50)
    @Column(name = "nro_telefono")
    private String nroTelefono;
    @JoinColumn(name = "idproveedores", referencedColumnName = "idproveedores")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores idproveedores;

    public TelefonoProveedor() {
    }

    public TelefonoProveedor(Integer idtelefonoproveedor) {
        this.idtelefonoproveedor = idtelefonoproveedor;
    }

    public Integer getIdtelefonoproveedor() {
        return idtelefonoproveedor;
    }

    public void setIdtelefonoproveedor(Integer idtelefonoproveedor) {
        this.idtelefonoproveedor = idtelefonoproveedor;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public Proveedores getIdproveedores() {
        return idproveedores;
    }

    public void setIdproveedores(Proveedores idproveedores) {
        this.idproveedores = idproveedores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefonoproveedor != null ? idtelefonoproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoProveedor)) {
            return false;
        }
        TelefonoProveedor other = (TelefonoProveedor) object;
        if ((this.idtelefonoproveedor == null && other.idtelefonoproveedor != null) || (this.idtelefonoproveedor != null && !this.idtelefonoproveedor.equals(other.idtelefonoproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sileg.entity.TelefonoProveedor[ idtelefonoproveedor=" + idtelefonoproveedor + " ]";
    }
    
}
