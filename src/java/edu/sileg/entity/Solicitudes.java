/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sileg.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "solicitudes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitudes.findAll", query = "SELECT s FROM Solicitudes s")})
public class Solicitudes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsolicitudes")
    private Integer idsolicitudes;
    @Size(max = 40)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_limite_respuesta")
    @Temporal(TemporalType.DATE)
    private Date fechaLimiteRespuesta;
    @JoinColumn(name = "idcategoria_solicitud", referencedColumnName = "idcategoria_solicitud")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaSolicitud idcategoriaSolicitud;
    @JoinColumn(name = "idclientes", referencedColumnName = "idclientes")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clientes idclientes;
    @JoinColumn(name = "idadministrador", referencedColumnName = "idadministrador")
    @ManyToOne(fetch = FetchType.LAZY)
    private Administrador idadministrador;

    public Solicitudes() {
    }

    public Solicitudes(Integer idsolicitudes) {
        this.idsolicitudes = idsolicitudes;
    }

    public Integer getIdsolicitudes() {
        return idsolicitudes;
    }

    public void setIdsolicitudes(Integer idsolicitudes) {
        this.idsolicitudes = idsolicitudes;
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

    public Date getFechaLimiteRespuesta() {
        return fechaLimiteRespuesta;
    }

    public void setFechaLimiteRespuesta(Date fechaLimiteRespuesta) {
        this.fechaLimiteRespuesta = fechaLimiteRespuesta;
    }

    public CategoriaSolicitud getIdcategoriaSolicitud() {
        return idcategoriaSolicitud;
    }

    public void setIdcategoriaSolicitud(CategoriaSolicitud idcategoriaSolicitud) {
        this.idcategoriaSolicitud = idcategoriaSolicitud;
    }

    public Clientes getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Clientes idclientes) {
        this.idclientes = idclientes;
    }

    public Administrador getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(Administrador idadministrador) {
        this.idadministrador = idadministrador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsolicitudes != null ? idsolicitudes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitudes)) {
            return false;
        }
        Solicitudes other = (Solicitudes) object;
        if ((this.idsolicitudes == null && other.idsolicitudes != null) || (this.idsolicitudes != null && !this.idsolicitudes.equals(other.idsolicitudes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sileg.entity.Solicitudes[ idsolicitudes=" + idsolicitudes + " ]";
    }
    
}
