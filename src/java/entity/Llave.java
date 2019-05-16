/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author javie
 */
@Entity
@Table(name = "llave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Llave.findAll", query = "SELECT l FROM Llave l")
    , @NamedQuery(name = "Llave.findByNombrellave", query = "SELECT l FROM Llave l WHERE l.nombrellave = :nombrellave")
    , @NamedQuery(name = "Llave.findByUsername", query = "SELECT l FROM Llave l WHERE l.username = :username")})
public class Llave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombrellave")
    private String nombrellave;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "username")
    private String username;
    @Lob
    @Column(name = "password")
    private byte[] password;
    @JoinColumn(name = "idBoveda", referencedColumnName = "idBoveda")
    @ManyToOne(optional = false)
    private Boveda idBoveda;

    public Llave() {
    }

    public Llave(String nombrellave) {
        this.nombrellave = nombrellave;
    }

    public Llave(String nombrellave, String url, String username) {
        this.nombrellave = nombrellave;
        this.url = url;
        this.username = username;
    }

    public String getNombrellave() {
        return nombrellave;
    }

    public void setNombrellave(String nombrellave) {
        this.nombrellave = nombrellave;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public Boveda getIdBoveda() {
        return idBoveda;
    }

    public void setIdBoveda(Boveda idBoveda) {
        this.idBoveda = idBoveda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombrellave != null ? nombrellave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Llave)) {
            return false;
        }
        Llave other = (Llave) object;
        if ((this.nombrellave == null && other.nombrellave != null) || (this.nombrellave != null && !this.nombrellave.equals(other.nombrellave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Llave[ nombrellave=" + nombrellave + " ]";
    }
    
}
