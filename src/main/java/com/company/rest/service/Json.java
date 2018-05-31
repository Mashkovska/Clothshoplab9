package com.company.rest.service;

import com.company.model.Clothes;
import com.company.persistence.dao.ClothesDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/clothes")
@SessionScoped
public class Json implements Serializable {
    private static final long serialVersionID = 1L;

    @Inject
    private ClothesDao dao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Clothes getClothes(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    public Response createClothes(Clothes clothes) {
        dao.persist(clothes);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteClothes(@PathParam(("id")) Integer id) {
        dao.remove(id);
        return Response.status(200).entity("Clothes").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateClothes(Clothes clothes) {
        dao.persist(clothes);
        return Response.status(200).entity("Clothes").build();
    }
}
