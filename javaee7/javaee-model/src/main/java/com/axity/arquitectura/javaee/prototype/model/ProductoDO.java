/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axity.arquitectura.javaee.prototype.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcorona
 */
@Entity
@Table(name = "TC_PRODUCTO", catalog = "", schema = "JAVAEE")
@NamedQueries({
    @NamedQuery(name = "ProductoDO.findAll", query = "SELECT p FROM ProductoDO p")
    , @NamedQuery(name = "ProductoDO.findById", query = "SELECT p FROM ProductoDO p WHERE p.id = :id")
    , @NamedQuery(name = "ProductoDO.findByUpc", query = "SELECT p FROM ProductoDO p WHERE p.upc = :upc")
    , @NamedQuery(name = "ProductoDO.findByName", query = "SELECT p FROM ProductoDO p WHERE p.name = :name")
    , @NamedQuery(name = "ProductoDO.findByUnidprice", query = "SELECT p FROM ProductoDO p WHERE p.unidprice = :unidprice")
    , @NamedQuery(name = "ProductoDO.findByStock", query = "SELECT p FROM ProductoDO p WHERE p.stock = :stock")})
public class ProductoDO implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Size(max = 100)
    @Column(name = "UPC", length = 100)
    private String upc;
    @Size(max = 100)
    @Column(name = "NAME", length = 100)
    private String name;
    @Column(name = "UNIDPRICE", precision = 18, scale = 2)
    private BigDecimal unidprice;
    @Column(name = "STOCK")
    private Short stock;
    @OneToMany(mappedBy = "idProducto", fetch = FetchType.LAZY)
    private List<OrderlineDO> orderlineDOList;

    public ProductoDO() {
    }

    public ProductoDO(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnidprice() {
        return unidprice;
    }

    public void setUnidprice(BigDecimal unidprice) {
        this.unidprice = unidprice;
    }

    public Short getStock() {
        return stock;
    }

    public void setStock(Short stock) {
        this.stock = stock;
    }

    public List<OrderlineDO> getOrderlineDOList() {
        return orderlineDOList;
    }

    public void setOrderlineDOList(List<OrderlineDO> orderlineDOList) {
        this.orderlineDOList = orderlineDOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoDO)) {
            return false;
        }
        ProductoDO other = (ProductoDO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelosjavaee.ProductoDO[ id=" + id + " ]";
    }
    
}
