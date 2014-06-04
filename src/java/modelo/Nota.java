/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chema
 */
@Entity
@Table(name = "nota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nota.findAll", query = "SELECT n FROM Nota n"),
    @NamedQuery(name = "Nota.findByIdNota", query = "SELECT n FROM Nota n WHERE n.idNota = :idNota"),
    @NamedQuery(name = "Nota.findByIdProd", query = "SELECT n FROM Nota n WHERE n.idProd = :idProd"),
    @NamedQuery(name = "Nota.findByFolio", query = "SELECT n FROM Nota n WHERE n.folio = :folio"),
    @NamedQuery(name = "Nota.findByCantidad", query = "SELECT n FROM Nota n WHERE n.cantidad = :cantidad")})
public class Nota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNota")
    private Integer idNota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProd")
    private int idProd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "folio")
    private int folio;
    @Column(name = "cantidad")
    private Integer cantidad;

    public Nota() {
    }

    public Nota(Integer idNota) {
        this.idNota = idNota;
    }

    public Nota(Integer idNota, int idProd, int folio) {
        this.idNota = idNota;
        this.idProd = idProd;
        this.folio = folio;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNota != null ? idNota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nota)) {
            return false;
        }
        Nota other = (Nota) object;
        if ((this.idNota == null && other.idNota != null) || (this.idNota != null && !this.idNota.equals(other.idNota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Nota[ idNota=" + idNota + " ]";
    }
    
}
