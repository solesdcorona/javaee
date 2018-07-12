/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.axity.arquitectura.javaee.prototype.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcorona
 */
@Entity
@Table(name = "TR_CUSTOMER", catalog = "", schema = "JAVAEE")
@NamedQueries({
    @NamedQuery(name = "CustomerDO.findAll", query = "SELECT c FROM CustomerDO c")
    , @NamedQuery(name = "CustomerDO.findById", query = "SELECT c FROM CustomerDO c WHERE c.id = :id")
    , @NamedQuery(name = "CustomerDO.findByNombre", query = "SELECT c FROM CustomerDO c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CustomerDO.findByApellidos", query = "SELECT c FROM CustomerDO c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "CustomerDO.findByTelefono", query = "SELECT c FROM CustomerDO c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "CustomerDO.findByZipcode", query = "SELECT c FROM CustomerDO c WHERE c.zipcode = :zipcode")})
public class CustomerDO extends AbstractBaseDO<Long> implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(generator="CUSTOMER")
    @SequenceGenerator(name="CUSTOMER",sequenceName="CUSTOMER", allocationSize = 1)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private Long id;
    @Size(max = 100)
    @Column(name = "NOMBRE", length = 100)
    private String nombre;
    @Size(max = 100)
    @Column(name = "APELLIDOS", length = 100)
    private String apellidos;
    @Size(max = 100)
    @Column(name = "TELEFONO", length = 100)
    private String telefono;
    @Size(max = 100)
    @Column(name = "ZIPCODE", length = 100)
    private String zipcode;
    @OneToMany(mappedBy = "idCustomer", fetch = FetchType.LAZY)
    private List<OrderDO> orderDOList;

    public CustomerDO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<OrderDO> getOrderDOList() {
        return orderDOList;
    }

    public void setOrderDOList(List<OrderDO> orderDOList) {
        this.orderDOList = orderDOList;
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
        if (!(object instanceof CustomerDO)) {
            return false;
        }
        CustomerDO other = (CustomerDO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelosjavaee.CustomerDO[ id=" + id + " ]";
    }
    
}
