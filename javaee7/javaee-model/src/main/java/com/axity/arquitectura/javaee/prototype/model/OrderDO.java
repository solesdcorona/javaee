/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axity.arquitectura.javaee.prototype.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jcorona
 */
@Entity
@Table(name = "TR_ORDER", catalog = "", schema = "JAVAEE")
@NamedQueries({
    @NamedQuery(name = "OrderDO.findAll", query = "SELECT o FROM OrderDO o")
    , @NamedQuery(name = "OrderDO.findById", query = "SELECT o FROM OrderDO o WHERE o.id = :id")
    , @NamedQuery(name = "OrderDO.findByDateOrder", query = "SELECT o FROM OrderDO o WHERE o.dateOrder = :dateOrder")
    , @NamedQuery(name = "OrderDO.findBySoldby", query = "SELECT o FROM OrderDO o WHERE o.soldby = :soldby")
    , @NamedQuery(name = "OrderDO.findByTotal", query = "SELECT o FROM OrderDO o WHERE o.total = :total")})
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "DATE_ORDER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrder;
    @Column(name = "SOLDBY", precision = 18, scale = 2)
    private BigDecimal soldby;
    @Column(name = "TOTAL", precision = 18, scale = 2)
    private BigDecimal total;
    @JoinColumn(name = "ID_CUSTOMER", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerDO idCustomer;
    @OneToMany(mappedBy = "idOrder", fetch = FetchType.LAZY)
    private List<OrderlineDO> orderlineDOList;

    public OrderDO() {
    }

    public OrderDO(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
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

    public CustomerDO getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(CustomerDO idCustomer) {
        this.idCustomer = idCustomer;
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
        if (!(object instanceof OrderDO)) {
            return false;
        }
        OrderDO other = (OrderDO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelosjavaee.OrderDO[ id=" + id + " ]";
    }
    
}
