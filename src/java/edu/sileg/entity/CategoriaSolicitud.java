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
@Table(name = "categoria_solicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaSolicitud.findAll", query = "SELECT c FROM CategoriaSolicitud c")})
public class CategoriaSolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoria_solicitud")
    private Integer idcategoriaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    @OneToMany(mappedBy = "idcategoriaSolicitud", fetch = FetchType.LAZY)
    private Collection<Solicitudes> solicitudesCollection;

    public CategoriaSolicitud() {
    }

    public CategoriaSolicitud(Integer idcategoriaSolicitud) {
        this.idcategoriaSolicitud = idcategoriaSolicitud;
    }

    public CategoriaSolicitud(Integer idcategoriaSolicitud, String nombreCategoria) {
        this.idcategoriaSolicitud = idcategoriaSolicitud;
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getIdcategoriaSolicitud() {
        return idcategoriaSolicitud;
    }

    public void setIdcategoriaSolicitud(Integer idcategoriaSolicitud) {
        this.idcategoriaSolicitud = idcategoriaSolicitud;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @XmlTransient
    public Collection<Solicitudes> getSolicitudesCollection() {
        return solicitudesCollection;
    }

    public void setSolicitudesCollection(Collection<Solicitudes> solicitudesCollection) {
        this.solicitudesCollection = solicitudesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcategoriaSolicitud != null ? idcategoriaSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaSolicitud)) {
            return false;
        }
        CategoriaSolicitud other = (CategoriaSolicitud) object;
        if ((this.idcategoriaSolicitud == null && other.idcategoriaSolicitud != null) || (this.idcategoriaSolicitud != null && !this.idcategoriaSolicitud.equals(other.idcategoriaSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sileg.entity.CategoriaSolicitud[ idcategoriaSolicitud=" + idcategoriaSolicitud + " ]";
    }
    
}
