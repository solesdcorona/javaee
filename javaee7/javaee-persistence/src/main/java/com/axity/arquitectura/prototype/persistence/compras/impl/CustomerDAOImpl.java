package com.axity.arquitectura.prototype.persistence.compras.impl;

import com.axity.arquitectura.base.BaseDAOImpl;
import com.axity.arquitectura.javaee.prototype.model.CustomerDO;
import com.axity.arquitectura.prototype.persistence.compras.CustomerDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class CustomerDAOImpl extends BaseDAOImpl<CustomerDO, Long> implements CustomerDAO{

    @PersistenceContext
    @Override
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }
}
