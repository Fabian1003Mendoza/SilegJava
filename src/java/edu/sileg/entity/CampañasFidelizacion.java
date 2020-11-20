/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "campa\u00f1as_fidelizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campa\u00f1asFidelizacion.findAll", query = "SELECT c FROM Campa\u00f1asFidelizacion c")})
public class CampañasFidelizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcampa\u00f1as")
    private Integer idcampañas;
    @Size(max = 100)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "puntos_totales")
    private Integer puntosTotales;
    @JoinTable(name = "campa\u00f1asfidelizacion_productosespeciales", joinColumns = {
        @JoinColumn(name = "idcampa\u00f1as", referencedColumnName = "idcampa\u00f1as")}, inverseJoinColumns = {
        @JoinColumn(name = "idproductos_especiales", referencedColumnName = "idproductos_especiales")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<ProductosEspeciales> productosEspecialesCollection;

    public CampañasFidelizacion() {
    }

    public CampañasFidelizacion(Integer idcampañas) {
        this.idcampañas = idcampañas;
    }

    public Integer getIdcampañas() {
        return idcampañas;
    }

    public void setIdcampañas(Integer idcampañas) {
        this.idcampañas = idcampañas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(Integer puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    @XmlTransient
    public Collection<ProductosEspeciales> getProductosEspecialesCollection() {
        return productosEspecialesCollection;
    }

    public void setProductosEspecialesCollection(Collection<ProductosEspeciales> productosEspecialesCollection) {
        this.productosEspecialesCollection = productosEspecialesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcampañas != null ? idcampañas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CampañasFidelizacion)) {
            return false;
        }
        CampañasFidelizacion other = (CampañasFidelizacion) object;
        if ((this.idcampañas == null && other.idcampañas != null) || (this.idcampañas != null && !this.idcampañas.equals(other.idcampañas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sileg.entity.Campa\u00f1asFidelizacion[ idcampa\u00f1as=" + idcampañas + " ]";
    }
    
}
