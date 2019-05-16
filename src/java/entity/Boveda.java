/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author javie
 */
@Entity
@Table(name = "boveda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boveda.findAll", query = "SELECT b FROM Boveda b")
    , @NamedQuery(name = "Boveda.findByNombreBoveda", query = "SELECT b FROM Boveda b WHERE b.nombreBoveda = :nombreBoveda")
    , @NamedQuery(name = "Boveda.findByCantidadLlaves", query = "SELECT b FROM Boveda b WHERE b.cantidadLlaves = :cantidadLlaves")
    , @NamedQuery(name = "Boveda.findByIdBoveda", query = "SELECT b FROM Boveda b WHERE b.idBoveda = :idBoveda")})
public class Boveda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombreBoveda")
    private String nombreBoveda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidadLlaves")
    private int cantidadLlaves;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBoveda")
    private Integer idBoveda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBoveda")
    private Collection<Llave> llaveCollection;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Usuario username;

    public Boveda() {
    }

    public Boveda(Integer idBoveda) {
        this.idBoveda = idBoveda;
    }

    public Boveda(Integer idBoveda, String nombreBoveda, int cantidadLlaves) {
        this.idBoveda = idBoveda;
        this.nombreBoveda = nombreBoveda;
        this.cantidadLlaves = cantidadLlaves;
    }

    public String getNombreBoveda() {
        return nombreBoveda;
    }

    public void setNombreBoveda(String nombreBoveda) {
        this.nombreBoveda = nombreBoveda;
    }

    public int getCantidadLlaves() {
        return cantidadLlaves;
    }

    public void setCantidadLlaves(int cantidadLlaves) {
        this.cantidadLlaves = cantidadLlaves;
    }

    public Integer getIdBoveda() {
        return idBoveda;
    }

    public void setIdBoveda(Integer idBoveda) {
        this.idBoveda = idBoveda;
    }

    @XmlTransient
    public Collection<Llave> getLlaveCollection() {
        return llaveCollection;
    }

    public void setLlaveCollection(Collection<Llave> llaveCollection) {
        this.llaveCollection = llaveCollection;
    }

    public Usuario getUsername() {
        return username;
    }

    public void setUsername(Usuario username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBoveda != null ? idBoveda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boveda)) {
            return false;
        }
        Boveda other = (Boveda) object;
        if ((this.idBoveda == null && other.idBoveda != null) || (this.idBoveda != null && !this.idBoveda.equals(other.idBoveda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Boveda[ idBoveda=" + idBoveda + " ]";
    }
    
}
