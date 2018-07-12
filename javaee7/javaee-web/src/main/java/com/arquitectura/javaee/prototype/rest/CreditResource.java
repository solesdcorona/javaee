/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arquitectura.javaee.prototype.rest;

import com.arquitectura.javaee.prototype.base.ResponseTO;
import com.axity.arquitectura.javaee.prototype.CreditService;
import com.axity.arquitectura.javaee.prototype.to.CreditoTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jcorona
 */
@Path("/credit")
public class CreditResource {

    private static final Logger LOG = LogManager.getLogger(CreditResource.class);

    private Gson gson = new GsonBuilder().serializeNulls().create();


    @Inject
    private CreditService creditService;



    @POST
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response executeNewCredit(String request) {
        ResponseTO responseTO = new ResponseTO();
        responseTO.setBody(creditService.findAllCredit());
        responseTO.setMessage("ok");
        responseTO.setState("ok");


        /*Type ty = new TypeToken<RequestTO<CreditoTO>>(){}.getType();
        RequestTO<CreditoTO> requestTo= gson.fromJson(request, ty);
        LOG.info("Guardando {} ",gson.toJson(requestTo));
*/
        //return Response.ok(gson.toJson(responseTO)).build();
        return Response.ok(responseTO).build();
    }

    @POST
    @Path("/search")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response findCreditsByFilter(String request) {
        return Response.ok(creditService.findAllCredit()).build();
    }

    @GET
    @Path("/get/{idCredit}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDetailCredit(@PathParam("idCredit") String request) {
        CreditoTO creditoTO = new CreditoTO();
        creditoTO.setDesarrolloEncabezado("encabezado");
        creditoTO.setEmpresaAcreditadaEncabezado("empresa");
        creditoTO.setEstatusEncabezado("estatus");
        creditoTO.setProyectoEncabezado("proyecto");
        creditoTO.setUnidadNegocioEncabezado("unidad de negocio");

        return Response.ok(gson.toJson(creditoTO)).build();
    }

}
