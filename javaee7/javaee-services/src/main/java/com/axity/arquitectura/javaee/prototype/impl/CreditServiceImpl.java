package com.axity.arquitectura.javaee.prototype.impl;

import com.axity.arquitectura.javaee.prototype.CreditService;
import com.axity.arquitectura.javaee.prototype.model.CustomerDO;
import com.axity.arquitectura.javaee.prototype.to.CreditoTO;
import com.axity.arquitectura.prototype.persistence.compras.CustomerDAO;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreditServiceImpl implements CreditService{

    @Inject
    private CustomerDAO customerDAO;


    @Override
    @Transactional
    public List<CreditoTO> findAllCredit() {

        CustomerDO customer= new CustomerDO();
        customer.setApellidos("Nombre completo ");
        customer.setNombre("Java EE");
        customer.setTelefono("1231313");
        customer.setZipcode("7571");
        customerDAO.create(customer);

        List<CreditoTO> empleados = new ArrayList<>();

        CreditoTO creditoTO = new CreditoTO();
        creditoTO.setDesarrolloEncabezado("encabezado");
        creditoTO.setEmpresaAcreditadaEncabezado("empresa");
        creditoTO.setEstatusEncabezado("estatus");
        creditoTO.setProyectoEncabezado("proyecto");
        creditoTO.setUnidadNegocioEncabezado("unidad de negocio");
        empleados.add(creditoTO);
        creditoTO = new CreditoTO();
        creditoTO.setDesarrolloEncabezado("encabezado");
        creditoTO.setEmpresaAcreditadaEncabezado("empresa");
        creditoTO.setEstatusEncabezado("estatus");
        creditoTO.setProyectoEncabezado("proyecto");
        creditoTO.setUnidadNegocioEncabezado("unidad de negocio");
        empleados.add(creditoTO);
        creditoTO = new CreditoTO();
        creditoTO.setDesarrolloEncabezado("encabezado");
        creditoTO.setEmpresaAcreditadaEncabezado("empresa");
        creditoTO.setEstatusEncabezado("estatus");
        creditoTO.setProyectoEncabezado("proyecto");
        creditoTO.setUnidadNegocioEncabezado("unidad de negocio");
        empleados.add(creditoTO);
        creditoTO = new CreditoTO();
        creditoTO.setDesarrolloEncabezado("encabezado");
        creditoTO.setEmpresaAcreditadaEncabezado("empresa");
        creditoTO.setEstatusEncabezado("estatus");
        creditoTO.setProyectoEncabezado("proyecto");
        creditoTO.setUnidadNegocioEncabezado("unidad de negocio");
        empleados.add(creditoTO);

        return empleados;
    }
}
