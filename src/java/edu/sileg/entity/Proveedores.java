/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproveedores")
    private Integer idproveedores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 50)
    @Column(name = "representante")
    private String representante;
    @Size(max = 30)
    @Column(name = "Nit")
    private String nit;
    @Size(max = 60)
    @Column(name = "direccion")
    private String direccion;
    @OneToMany(mappedBy = "idproveedores", fetch = FetchType.LAZY)
    private Collection<Compras> comprasCollection;
    @OneToMany(mappedBy = "idproveedores", fetch = FetchType.LAZY)
    private Collection<Productos> productosCollection;
    @OneToMany(mappedBy = "idproveedores", fetch = FetchType.LAZY)
    private Collection<TelefonoProveedor> telefonoProveedorCollection;

    public Proveedores() {
    }

    public Proveedores(Integer idproveedores) {
        this.idproveedores = idproveedores;
    }

    public Proveedores(Integer idproveedores, String nombres) {
        this.idproveedores = idproveedores;
        this.nombres = nombres;
    }

    public Integer getIdproveedores() {
        return idproveedores;
    }

    public void setIdproveedores(Integer idproveedores) {
        this.idproveedores = idproveedores;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @XmlTransient
    public Collection<Compras> getComprasCollection() {
        return comprasCollection;
    }

    public void setComprasCollection(Collection<Compras> comprasCollection) {
        this.comprasCollection = comprasCollection;
    }

    @XmlTransient
    public Collection<Productos> getProductosCollection() {
        return productosCollection;
    }

    public void setProductosCollection(Collection<Productos> productosCollection) {
        this.productosCollection = productosCollection;
    }

    @XmlTransient
    public Collection<TelefonoProveedor> getTelefonoProveedorCollection() {
        return telefonoProveedorCollection;
    }

    public void setTelefonoProveedorCollection(Collection<TelefonoProveedor> telefonoProveedorCollection) {
        this.telefonoProveedorCollection = telefonoProveedorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedores != null ? idproveedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.idproveedores == null && other.idproveedores != null) || (this.idproveedores != null && !this.idproveedores.equals(other.idproveedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sileg.entity.Proveedores[ idproveedores=" + idproveedores + " ]";
    }
    
}
