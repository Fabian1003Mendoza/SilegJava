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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "productos_especiales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductosEspeciales.findAll", query = "SELECT p FROM ProductosEspeciales p")})
public class ProductosEspeciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproductos_especiales")
    private Integer idproductosEspeciales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos_producto")
    private int puntosProducto;
    @ManyToMany(mappedBy = "productosEspecialesCollection", fetch = FetchType.LAZY)
    private Collection<CampañasFidelizacion> campañasFidelizacionCollection;

    public ProductosEspeciales() {
    }

    public ProductosEspeciales(Integer idproductosEspeciales) {
        this.idproductosEspeciales = idproductosEspeciales;
    }

    public ProductosEspeciales(Integer idproductosEspeciales, String nombreProducto, int puntosProducto) {
        this.idproductosEspeciales = idproductosEspeciales;
        this.nombreProducto = nombreProducto;
        this.puntosProducto = puntosProducto;
    }

    public Integer getIdproductosEspeciales() {
        return idproductosEspeciales;
    }

    public void setIdproductosEspeciales(Integer idproductosEspeciales) {
        this.idproductosEspeciales = idproductosEspeciales;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPuntosProducto() {
        return puntosProducto;
    }

    public void setPuntosProducto(int puntosProducto) {
        this.puntosProducto = puntosProducto;
    }

    @XmlTransient
    public Collection<CampañasFidelizacion> getCampañasFidelizacionCollection() {
        return campañasFidelizacionCollection;
    }

    public void setCampañasFidelizacionCollection(Collection<CampañasFidelizacion> campañasFidelizacionCollection) {
        this.campañasFidelizacionCollection = campañasFidelizacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproductosEspeciales != null ? idproductosEspeciales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductosEspeciales)) {
            return false;
        }
        ProductosEspeciales other = (ProductosEspeciales) object;
        if ((this.idproductosEspeciales == null && other.idproductosEspeciales != null) || (this.idproductosEspeciales != null && !this.idproductosEspeciales.equals(other.idproductosEspeciales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sileg.entity.ProductosEspeciales[ idproductosEspeciales=" + idproductosEspeciales + " ]";
    }
    
}
