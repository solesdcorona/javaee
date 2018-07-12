/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axity.arquitectura.javaee.prototype.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jcorona
 */
@Entity
@Table(name = "TR_ORDERLINE", catalog = "", schema = "JAVAEE")
@NamedQueries({
    @NamedQuery(name = "OrderlineDO.findAll", query = "SELECT o FROM OrderlineDO o")
    , @NamedQuery(name = "OrderlineDO.findById", query = "SELECT o FROM OrderlineDO o WHERE o.id = :id")
    , @NamedQuery(name = "OrderlineDO.findByQuantity", query = "SELECT o FROM OrderlineDO o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "OrderlineDO.findBySoldby", query = "SELECT o FROM OrderlineDO o WHERE o.soldby = :soldby")
    , @NamedQuery(name = "OrderlineDO.findByTotal", query = "SELECT o FROM OrderlineDO o WHERE o.total = :total")})
public class OrderlineDO implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "QUANTITY")
    private Short quantity;
    @Column(name = "SOLDBY", precision = 18, scale = 2)
    private BigDecimal soldby;
    @Column(name = "TOTAL", precision = 18, scale = 2)
    private BigDecimal total;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductoDO idProducto;
    @JoinColumn(name = "ID_ORDER", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderDO idOrder;

    public OrderlineDO() {
    }

    public OrderlineDO(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSoldby() {
        return soldby;
    }

    public void setSoldby(BigDecimal soldby) {
        this.soldby = soldby;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ProductoDO getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(ProductoDO idProducto) {
        this.idProducto = idProducto;
    }

    public OrderDO getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(OrderDO idOrder) {
        this.idOrder = idOrder;
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
        if (!(object instanceof OrderlineDO)) {
            return false;
        }
        OrderlineDO other = (OrderlineDO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelosjavaee.OrderlineDO[ id=" + id + " ]";
    }
    
}
