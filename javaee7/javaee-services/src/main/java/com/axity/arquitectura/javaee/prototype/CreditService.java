package com.axity.arquitectura.javaee.prototype;

import com.axity.arquitectura.javaee.prototype.to.CreditoTO;

import java.util.List;


public interface CreditService {

    List<CreditoTO> findAllCredit();
 }
